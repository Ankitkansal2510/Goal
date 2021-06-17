package Java8.Stream.MoreStreamMethods;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class MoreStreamMethod {
    public static void main(String[] args) {
        /**
         * 1. Stream from values
         * we can create stream with explicit value  by using the static method Stream.of
         *
         **/

        Stream<String> firstExample=Stream.of("Java 8","Lambda","Stream");
        //Now we can perform uppercase on each word
        firstExample.map(String::toUpperCase).forEach(System.out::println);

        /**
         * 2. Stream from arrays
         *
         * We can create stream from array  using the static method Arrays.stream, which
         * takes an array as a paramter
         * **/

        int[] numbers={1,2,3,4,5};
        int secondExampleSum=Arrays.stream(numbers).sum();
        System.out.println("Stream form array : " + secondExampleSum);

        /**
         * Stream from files
         *
         * Java NIO API has been updated to take advantage of stream
         * you could use this method to find out the number of unique words in a file as follows:
         *
         * **/


            try(Stream<String> lines= Files.lines(Paths.get("D:\\Test.txt"), Charset.defaultCharset())){
               lines.flatMap(w->Arrays.stream(w.split(""))) //Stream are autocloseable
                                    .distinct()
                                    .forEach(System.out::println);
               //and if we want to print the count then instead of .forEach use the count()
            }
            catch (Exception e){
                e.printStackTrace();
            }


            /**
             * Streams from functions: creating infinite streams!
             *
             * The Streams API provides two static methods to generate a stream from a function:
             * Stream.iterate and Stream.generate.
             * These two operations let you create what we call an infinite stream: a stream
             * that doesn’t have a fixed size like when you create a stream from a fixed collection.
             * Streams produced by iterate and generate create values on demand given a function and
             * can therefore calculate values forever! It’s generally sensible to use limit(n) on
             * such streams to avoid printing an infinite number of values.
             *
             * */

        System.out.println("Infinite stream example of iterate");

        Stream.iterate(0,n->n+2)
                .limit(10) //if we dont use limit then it will keep running
                .forEach(System.out::println);

       //print series of fibonnaci tuples
        //The series of Fibonacci tuples is similar; you have a sequence of a number and its successor
        // in the series:(0, 1), (1, 1), (1, 2), (2, 3), (3, 5), (5, 8), (8, 13), (13, 21)....
        System.out.println("Printing fibonnaci tuplet");
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(20)
                .forEach(t-> System.out.println("(" + t[0] + "," + t[1] +")"));

        //print fibonnaci series

        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(20)
                .map(t->t[0])
                .forEach(t-> System.out.print(t + " "));


        //Generate method of stream
        System.out.println("Generating Random numbers");

        Stream.generate(Math::random).limit(20).forEach(System.out::println);
        //it will generate random between 0-1
    }
}
