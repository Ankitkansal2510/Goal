package Java8.Stream.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * In this we will use Reduce method of stream
 * It is used to process all the elements of the stream and produce a single result
 *
 * it takes two parameters T Reduce(initial value,binary operator<T> to combine two values and prouce
 * a single result
 *
 * Also we can remove initial value from reduce , but in that case it gives returns optional Object
 *
 * Option<Integer> result=reduce(BinaryOperator)
 *
 * It returns optional object because suppose in case there is not value in stream on which operation
 * can be performed , and we have also not provided any initial value so in this case it wont throw null
 * pointer exception
 * */
public class SumReduceExample {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        int result=list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Using lambda expressin: " + result);

        /**
         * Also we can use  method referencing here , In java 8 Integer has sum method
         * which takes two parameter and return a sum
         * **/


        int result2=list.stream().reduce(0,Integer::sum);
        System.out.println("Using method referencing expression : " + result2);

        /**
         * Also we can avoid assing initial value or the first paramter form the reduce
         * but in that case it returns the Optional object
         *
         * **/

        Optional<Integer> result3=list.stream().reduce((a,b)->a+b);

        System.out.println("Removing first argument from the reduce method : " + result3);

    }
}
