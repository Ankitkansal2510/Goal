package Java8.fork_join_Framework;

import Java8.Function.Function;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * The fork/Join framework is used to design to recursively split parallelizable task into smaller subtask and then combine
 * the result of the each subtask to produce a final result.It's an implementation of the ExecutorService interface which
 * distributes those subtask to the worker thread in a thread pool ,known as ForkJoinPool.
 *
 * Working with recurseive Task
 *
 * To submit a task to this pool we have to create a subclass of RecursiveTask<R>, (where R is the result produced of the
 * recursive task and all its subtask).To define Recursive task we just need to implement one method
 *  protected abstract R compute().
 *
 *  This method defines the logic of both splitting a task into a subtask and the algorithm to produce the result of single
 *  subtask when it is not possible to further divide it.
 *
 *  Lets implement it
 * **/
public class ForkJoinSumCalculator extends RecursiveTask<Long> {
    private final long[] numbers; //the array of numbers to be summed
    private final int start;//the initial position of the portion of the array  processed by this subtask
    private final int end;//the final position of the portion of the array processed by this subtask
    public static final long threshold=10_000;//The size of the array under which this task is no longer split into subtask
    public ForkJoinSumCalculator(long[] numbers){
        //public constructor used to create the main task
        this(numbers,0,numbers.length);
    }
    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        //private constructor used to recursively create the subtask of the main task
        this.numbers=numbers;
        this.start=start;
        this.end=end;
    }
    @Override
    protected Long compute() { //override the abstract method of the RecursiveTask
        int length=end-start; //the size of the portion of the array summed by this task
        if(length<=threshold){ //if a size is less than or equal to threshold ,compute the result sequentially
            return computeSequentially();
        }
        ForkJoinSumCalculator leftask=new ForkJoinSumCalculator(numbers,start,start+length/2);//create the leftsubtask to sum the first half of the array
        leftask.fork();//asynchronously execute the newly created subtask using another thread of the Forkjoinpool
        //Calling the fork method on a subtask is the way to schedule it on the ForkJoinPool
        ForkJoinSumCalculator righttask=new ForkJoinSumCalculator(numbers,start+length/2,end);
        long rightResult=righttask.compute();//execute the right subtask synchronously ,potentially allowing further recursive split
        long leftResult=leftask.join();//Read the result of the first subtask or wait if the result is not ready
        return leftResult+rightResult; //combine the result of the both subtask
    }


    private long computeSequentially(){
        //simple algorithm calculating the result of a subtask when it's no longer divisible
        long sum=0;
        for(int i=start;i<end;i++){
            sum+=numbers[i];
        }
        return sum;
    }

    public static long forkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }
    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            //  System.out.println("Result: " + sum);
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }
    public static void main(String[] args) {
        System.out.println("ForkJoin sum done in: " + measureSumPerf(
                ForkJoinSumCalculator::forkJoinSum, 10_000_000) + " msecs" );

    }
}
/**
 * When you pass the ForkJoinSumCalculator task to the ForkJoinPool, this task is executed by a thread of the pool that in turn calls the compute
 * method of the task. This method checks to see if the task is small enough to be performed sequentially; otherwise,
 * it splits the array of numbers to be summed into two halves and assigns them to two new ForkJoinSumCalculators that
 * are scheduled to be executed by the ForkJoinPool.As a result, this process can be recursively repeated, allowing the original
 * task to be divided into smaller tasks, until the condition used to check
 * if it’s no longer convenient or no longer possible to further split it is met (in this case, if the number of items to be summed is less than
 * or equal to 10,000). At this point, the result of each subtask is computed sequentially, and the (implicit) binary tree of tasks created by
 * the forking process is traversed back toward its root
 *
 *
 * **/