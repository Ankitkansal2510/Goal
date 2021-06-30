package Java8.Stream.Partitioning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * In the we will demonstrate the use of the static method partitioningBy of the factory class Collectors
 *
 * partitionby() takes predicate as an argument
 *
 * It will return a map whose key is Boolean
 *
 * for example if we want to to seperate the dish by veg or non veg then we can use partitongBy function
 *

 *
 * **/
public class PartitionMain {
    public static void main(String[] args) {
        List<Dish> dish=new ArrayList<>();
        dish.add(new Dish("Fish",200,false));
        dish.add(new Dish("Chicken",200,false));
        dish.add(new Dish("Fries",200,true));
        dish.add(new Dish("Sandwhich",200,true));
        dish.add(new Dish("Mutton",200,false));
        dish.add(new Dish("Aloo",200,true));
        dish.add(new Dish("Kadai Chicken",200,false));
        dish.add(new Dish("Kadai Chicken",300,false));

        Map<Boolean,List<Dish>> result=dish.stream().collect(Collectors.partitioningBy(Dish::isVegerterian));
        List<String> l1=dish.stream().map(Dish::getName).collect(Collectors.toList());
        result.forEach((k,v)-> System.out.println(k + " "+ v));

        /***
         * Like a groupingBy , partitionBy will also take n number of collector as an argument for example\
         *
         * It has overloaded method which takes second collector as an argument
         *
         */



        Map<Boolean ,Map<String,List<Dish>>> result1=dish.stream().collect(Collectors.partitioningBy(Dish::isVegerterian,
                Collectors.groupingBy(Dish::getName)));
        System.out.println("Passing 2nd argument as a parameter of the partitionby function ");
        result1.forEach((k,v)-> System.out.println(k + " " +v));

    }
}
