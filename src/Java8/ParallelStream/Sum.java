package Java8.ParallelStream;

import Java8.Function.Function;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * In this we first use the sum of first n natural number in sequential then we see how to execute them in parallel.
 *
 * **/
public class Sum {
    //the below method measureSumPerf is used to calucluate the total time take by a method to execute a task
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

    public static long parallelSum(Long n)
    {
        return Stream.iterate(1L,i->i+1)
                    .limit(n)
                    .parallel()
                    .reduce(0L,Long::sum);
    }

    public static long sequentialSum(Long n)
    {
        return Stream.iterate(1L,i->i+1)
                .limit(n)
                .parallel()
                .reduce(0L,Long::sum);
    }

    public static long iterative(Long n){
        long sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

    public static long rangeClosed(long n){
        return LongStream.rangeClosed(1,n).parallel().reduce(0L,Long::sum);
    }

    public static void main(String[] args) {

        System.out.println("Iterative sum done in: " +
                measureSumPerf(Sum::iterative, 10_000_000) + " msecs");

        System.out.println();

        System.out.println("Sequential sum done in: " +
                measureSumPerf(Sum::sequentialSum, 10_000_000) + " msecs");

        System.out.println();

        System.out.println("parallel sum done in: " +
                measureSumPerf(Sum::parallelSum, 10_000_000) + " msecs");
/**
 * Here we have observerd that normal iterative approach using for loop gives the best result in terms of performance
 *
 * Even better than using parallelStream() .Why?
 *
 * The reason being is
 *
 * 1.Stream.iterate() method generated boxed object , so it need to unboxed to a number before they can be added
 * 2.iterate is difficult to divide into independent chunks for parallel processing
 *
 *
 * So while choosing parallelStream() we need to make sure the reduce operation method should be appropiate for parallel Stream
 * Like the Stream.iterate operator is not appropiate for parallel stream as it reduces the performance
 *
 *
 * So for this case we can use the method LongStream.rangeClosed() to make parallel process efficient
 *
 * why?
 *
 * because of the following reason
 *
 * 1. First it works on the primitive type so we need not to unbox every element before applying the sum operation
 * 2.using rangeClosed(1,n)  it become easy to split into smaller chunks for example
 *
 * 1-5, 6-10,11-15
 *
 * After using parallel() on rangeClosed see the magic the time which sequential sum is taking is 182 msec and
 * longStream.rangeClosed() completed in 0 msec Wooah   !!!
 *
 * This mean that choosing the right data structure and then making it work parallel gives the best performance
 *
 *
 * But if we use mutable shared data along with parallel then we broke consistency
 * **/
        System.out.println();
        System.out.println(" LonStream.rangeClosed sum done in: " +
                measureSumPerf(Sum::rangeClosed, 10_000_000) + " msecs");

    }
}
