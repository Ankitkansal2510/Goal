package Java8.firstExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Locale.filter;

public class LambaPractise  {
/**
* Here below filterApple can only accept Apples , here we can go at one more level of abstraction
 * and make it generic so that the same method can be used for banana, etc
* */
    public static List<Apple> filterApple(List<Apple> inventory,Predicate<Apple> p){
        List<Apple> result=new ArrayList<>();
        for(Apple apple:inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    /**Below method is alternativ to above filterApple method , the difference is
     * below method will be more generic
     *
     * **/
    public static <T> List<T> genericFilterApple(List<T> list,Predicate<T> p){
        List<T> result=new ArrayList<>();
        for(T e:list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Apple> list=new ArrayList<>();
        list.add(new Apple("Green",150));
        list.add(new Apple("Green",140));
        list.add(new Apple("Red",160));
        list.add(new Apple("Green",170));

/**
 * In the below two filter calls we are passing method (isGreenApple and isHeavyApple ) as a value to another
 * method filterApple, but it is also annoying as isGreenApple and isHEavyApple is a short method and can
 * be used twice or thrice maximum,
 *
 * Java has a solution to this as well using lmabda
 * **/
        List<Apple> greenApple=filterApple(list,Apple::isGreenApple);
        List<Apple> isHeavyApple=filterApple(list,Apple::isHeavyApple);


        /**
         * the above two method calls can be used as below
         *
         * **/

        List<Apple> LambdaGreenApple=filterApple(list,(Apple a)->"green".equalsIgnoreCase(a.getColour()));
        List<Apple> LambdaHeavyApple=filterApple(list,(Apple a)->a.getWeight()>150);


        System.out.println(greenApple);
        System.out.println(isHeavyApple);

        System.out.println();
        System.out.println(LambdaGreenApple);
        System.out.println(LambdaHeavyApple);

        //one way of writing comparator is using the anonymous class which is verbose but with java 8
        Comparator<Apple> comparator=new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };

       // Comparator<Apple> byweight=(Apple a1,Apple a2)->a1.getWeight().compareTo(a2.getWeight());
        Collections.sort(list,comparator);
        System.out.println("Sorting the list element in ascending order");
        Collections.sort(list,(Apple a1,Apple a2)->a2.getWeight().compareTo(a1.getWeight()));
        System.out.println();
        System.out.println("Sorting the list element in the descending order");
        System.out.println(list);
    }
}
