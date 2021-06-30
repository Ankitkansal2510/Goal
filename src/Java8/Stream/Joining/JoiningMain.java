package Java8.Stream.Joining;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;
/**
 * This is the example of joining()
 *
 * The collector returned by the static cmethod joining() of class Collectors concatenate all the string resulting
 * from invoking toString method on the each object in the stream
 *
 * **/
public class JoiningMain {
    public static void main(String[] args) {
        List<Dish> dishes=new ArrayList<>();
        dishes.add(new Dish("Burger",100));
        dishes.add(new Dish("Sandwhich",400));
        dishes.add(new Dish("Pizza",300));
        dishes.add(new Dish("Roll",200));

        /*
        *In this statement we are using mao to first get the dishname and then applying joining on the dish name
        *we are using map because in the Dish class we have not created the tostring() method which will return string
        * If we would create the toString method in the Dish class and returned only name , then we need not to use
        * map() method to return the dish name we can simply use collect for example
        * dishes.stream().collect(joining());
        * **/
        String concateDishName=dishes.stream().map(Dish::getName).collect(joining());
        System.out.println(concateDishName);

        /**
         * The output printed from above is not readable as it just concatenate all the string
         * we have overloaded joining() method which accepts delimeter as an argumenr
         * for example if we want to concatenate all the strings with comma seperated value then we can do like below
         * */

        String join=dishes.stream().map(Dish::getName).collect(joining(", "));
        System.out.println(join);
    }
}
