package Java8.Stream.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMain {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Hello","World","Ankit");

        /**
         * In this example we will demonstrate the use of flat map
         * Suppose we want to print all the unique character for each word from the list
         * output we want: H e l l o w o r l d A n k i t
         *
         * one way if we thing that we can pass function split inside map method
         *
         * like
         *
         * list.stream().map(w->w.split("").collect(toList());
         *
         * but the problem with this approach is w->w.split return Stream(String[]) string of array
         * but we want stream
         *
         * so to overcome this problem is we need stream of character instead of stream of array
         * we can do this by using Arrays.stream() method so can we try below :
         * list.stream().mao(w->w.split("").map(Arrays::stream).collect(toList());
         *
         * The answer is NO!!!
         *
         * Because now this expresison will return stream of stream i.e stream<stream<String>>
         * but we need Stream<String>)
         *
         * ???????
         *
         * Ok so now FlatMap rescues us
         *
         * FLatmap method let you replace the value of stream with another stream and then concatenate
         * all the generated stream into a single stream i.e it return Stream<String>
         *
         * **/

        List<String> result=list.stream()
                .map(w->w.split(""))
                .flatMap(Arrays::stream)

                .collect(Collectors.toList());

        System.out.println(result);
        /*
         *Now if we want to print distinct character
         * */

        List<String> distinctResult=list.stream()
                .map(w->w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct Character : " + distinctResult) ;
    }
}
