package Java8.Stream.Collectors_More_Example;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;

public class CountingCollectorMain {
    public static void main(String[] args) {
        List<Dish> dishes=new ArrayList<>();
        dishes.add(new Dish("Burger",100));
        dishes.add(new Dish("Sandwhich",200));
        dishes.add(new Dish("Pizza",300));
        dishes.add(new Dish("Roll",400));

        long howManyDishes=dishes.stream().collect(counting());
        System.out.println("The total number of dishes : " + howManyDishes);
        //Or we can write further reduce above method as written below
        long countDishes=dishes.stream().count();
        System.out.println(countDishes);

        /*WE can write in both way but counting collectors is especially useful when combining with multiple
        * Collectors**/



    }
}
