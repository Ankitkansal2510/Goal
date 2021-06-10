package Java8.Stream.secondExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Author Ankit kansal
 * In this example we will demonstrate the concept that stream can be only traversed once like iterators
 * If we want to traverse it again then we need to again construct the stream from the collections.
 * If we try to travers the stream more than one time then we will get exception
 * java.lang.IllegalStateException: stream has already been operated upon or closed
 * **/
public class StreamSecond {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","d","er","bb","cb","dd"                                                                                    );
        Stream<String> s=list.stream();

        s.forEach(System.out::println); // OR  s.forEach((x)-> System.out.println(x));

        //Now if we again try to consume the stream after first time we will get an error
        //Above we have consumed the stream and now it is close , and now if we want to consume it again
        //we will get an runtime excpetion java.lang.IllegalStateException: stream has already been operated upon or closed
        s.forEach(System.out::println);
    }
}
