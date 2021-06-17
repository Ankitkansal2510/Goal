package Java8.Stream.mapToInt;

import java.util.ArrayList;
import java.util.List;

public class MapToInt {

    public static void main(String[] args) {
        List<Dish> list=new ArrayList<>();
        list.add(new Dish(100,"Burger"));
        list.add(new Dish(200,"Pizza"));
        list.add(new Dish(300,"Sanwhich"));
        list.add(new Dish(400,"CheeseRoll"));

        /**
         * Lets print the sum of calories
         * */

        int sum=list.stream().map(Dish::getCalorie).reduce(0,Integer::sum);
        System.out.println(sum);

        /**
         *
         * The problem with above code is insidious unboxing.Behind scene each integer needs to be unboxed
         * to primitive before performing the summation
         *
         * Solution:
         *
         * Java 8 introduces three specialised interface to tackle this issue:
         * IntStrea,DoubleStream,LongStream
         *that respectively specialised the element of stream to be int,long and double
         * and therefore avoid hidden boxing cost
         *
         * The most common method use to convert a stream to specialised versions are
         * mapToInt,mapToLong,mapToDouble
         *
         * These method worked excatly as map but it return a specialised stream instead of
         * Stream<T>
         * **/

        int totalCalori=list.stream()
                .mapToInt(Dish::getCalorie)
                .sum();

        System.out.println("Map to int sum " + totalCalori);

        /**
         * Here, the method mapToInt extracts all the calories from each dish (represented as an Integer) and
         * returns an IntStream as the result (rather than a Stream<Integer>).
         * You can then call the sum method defined on the IntStream interface to calculate the sum of calories!
         * Note that if the stream were empty, sum would return 0 by default.
         * IntStream also supports other convenience methods such as max, min, and average.
         * */
    }
}
