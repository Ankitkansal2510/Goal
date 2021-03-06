package Java8.Stream.DictinctStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctMain {

     interface Predicate<T>{
        boolean test(T t);
    }

    public static <T> List<T> even(List<T> list,Predicate<T> p){
         List<T> result=new ArrayList<>();
         for(T s:list){
             if(p.test(s)){
                 result.add(s);
             }
         }
         return result;
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,2,4);
        List<Integer> output=even(list,i->i%2==0);
        output.stream().distinct().forEach(System.out::println);
/**
 * Here in above , I have created my custom predicate which will act as a predicate.
 * But There is a perdefined filter method which is provided by the Stream ,so we ca directly leverage that
 *
 * For leveraging the predefined Stream filter method , we need not to create interface,nor custom
 * Predeicate
 * Just need to call filter method on the stream like we did below
 *
 *
 *
 *
 */
        System.out.println("Below output is generated by using the predefined methods");
   list.stream().filter(i->i%2==0).distinct().forEach(System.out::println);
        System.out.println();
        /**
         * Stream supports a method distinct that returns a unique element  according to the
         * HashCode and the Equal method of the Object produced by the Stream.
         * **/

    }
}
