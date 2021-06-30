package Java8.Stream.Collectors_More_Example;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
public class MaxMinCollectorsMain {
    public static void main(String[] args) {
        List<Dish> dishes=new ArrayList<>();
        dishes.add(new Dish("Burger",100));
        dishes.add(new Dish("Sandwhich",200));
        dishes.add(new Dish("Pizza",300));
        dishes.add(new Dish("Roll",400));

        //Now if we want to find maxiimum calorie dish and minimum calorie dish
        //There are two way , first is using the reduce function which will return the maximum calorie
        //Second way is to use the static method of the collectors class i.e counting
        Optional<Integer> max=dishes.stream().map(Dish::getCalories).reduce(Integer::max);
        //The above will return the maximum value
        System.out.println(max);


        //below is using the second way
//The below will return the dish name and the calorie of that item whose calorie is max
        Optional<Dish> maxCalorieDish= dishes.stream().max(Comparator.comparingInt(Dish::getCalories));
        //or
        Optional<Dish> maxCalorieDish1=dishes.stream().collect(maxBy(Comparator.comparingInt(Dish::getCalories)));

        System.out.println(maxCalorieDish);
        System.out.println(maxCalorieDish1);

        Optional<Dish> minCalorie=dishes.stream().min(Comparator.comparingInt(Dish::getCalories));
        //or
        Optional<Dish> minCalorie1=dishes.stream().collect(minBy(Comparator.comparingInt(Dish::getCalories)));

        System.out.println(minCalorie);
        System.out.println(minCalorie1);

        //Below will use to Summing

        int sum=dishes.stream().map(Dish::getCalories).reduce(0,(a,b)->a+b);
        System.out.println("Summing using reduce : " + sum);

        //another way of using the static method of collectors factory class

        int sumCollectors=dishes.stream().collect(summingInt(Dish::getCalories));
        System.out.println("Summing using static method of collectors class summingInt: " + sumCollectors);

        //another way of doing the above sum is

        int sumMaptoInt=dishes.stream().mapToInt(Dish::getCalories).sum();
        System.out.println("using maptoint : " + sumMaptoInt);


        //We can also find the average using the static method of the collectos class


        double average=dishes.stream().collect(averagingInt(Dish::getCalories));
        System.out.println("Average calorie of all the dishes is : " + average);

        /*So Far we have used multiple stream to find max, min sum ,average and count
        * Suppose if we want to get all this information and just in one step
        * then we can leverage the collector return by the summarizingInt
        *
        * as shown below
        *
        * **/

        IntSummaryStatistics statistics=dishes.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println(statistics);
    }
}
