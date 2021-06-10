package Java8.Stream.thirdExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class thirdExample {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","ab","cc","ab");
        long count=list.stream().filter(d->d.length()>1).distinct().count();
        System.out.println(count);
//filter,distinct are intermediate operation as they return the stream but count returns a long value it is
        //termial operation


        /**
         Streams are lazy because intermediate operations are not evaluated until terminal operation is invoked.
         Each intermediate operation creates a new stream, stores the provided operation/function and
         return the new stream.
         The pipeline accumulates these newly created streams.
         The time when terminal operation is called, traversal of streams begins and the associated
         function is performed one by one.
         **/

        List<String> list1=Arrays.asList("a","b","ab","cc","ab");
        List<String> list2= list1.stream()
                            .filter(x->{
                                System.out.print(x.length() + " " );
                                return x.length()>1;
                            })
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list2);

    }
}
