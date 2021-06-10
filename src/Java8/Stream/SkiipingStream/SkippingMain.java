package Java8.Stream.SkiipingStream;

import java.util.Arrays;
import java.util.List;

public class SkippingMain {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        /**
         * After filtering even elements stream only left with 2,4,6, elements , then
         * we applied skip(2) , meaning first two element i.e 2,4 will be  discarded and there is only
         * 1 element left in the stream which is 6
         *
         * **/
        list.stream().filter(i->i%2==0).skip(2).forEach(System.out::println);
        //OR inside the forEach we are using method Referencing , instead of method Referencing we can
        //pass lamda as well like forEach(i->System.out.println(i);

        /**skip(n) method returns a stream that discard first n elements
         * if a stream has fewer than n elements than it returns empty stream
         *
         * **/
    }
}
