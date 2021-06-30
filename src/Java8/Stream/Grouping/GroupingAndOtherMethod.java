package Java8.Stream.Grouping;

import java.util.*;

import static java.util.stream.Collectors.*;
/**
 * In the class Multilevel grouping we have passed more than groupingBy() method inside the collector
 *
 * We can also pass another factory method of class Collectors for example
 * we can club groupingBy with Counting
 *
 * In short we can pass any number of arguments as the second argument inside the groupingBy factory method
 *
 *
 * */
public class GroupingAndOtherMethod {
    public static void main(String[] args) {


        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction("INR", 550));
        list.add(new Transaction("JPY", 1000));
        list.add(new Transaction("US", 200));
        list.add(new Transaction("POUND", 550));
        list.add(new Transaction("US", 1000));
        list.add(new Transaction("INR", 200));
        list.add(new Transaction("CHZ", 1700));
        list.add(new Transaction("INR", 1500));

        Map<String,Long> result=list.stream().collect(groupingBy(Transaction::getCurrency,counting()));

        result.forEach((k,v)-> System.out.println(k + " " + v));

        //More example  to find highest amount in the Transaction but now classified as a transaction
        //the key would be result get from first level of grouping i.e Currency
        //the value to this map would be the highest amount of each transaction

        Map<String, Optional<Transaction>> result1=list.stream().collect(groupingBy(Transaction::getCurrency,
                maxBy(Comparator.comparingInt(Transaction::getAmount))));

        System.out.println("Another example");
        result1.forEach((k,v)-> System.out.println(k+ " " + v));

        /**
         * In above we are using Optional<Transation> because comparingInt return optional because in case there
         * is no amount in the list then instead of failing with nullpointerexception it will give Optional.Empty
         *
         * To overcome we use the collector return by the Collectors.collectingAndThen()
         *
         * collectingAndThen() takes two argument
         * 1.The collector to be adopted (like for example maxBy(comparingInt(Transaction::getAmount)
         * 2.The Transformation function (which is Option::get)
         * */

        Map<String,Transaction> resultwithoutOptioanl=list.stream().collect(
                groupingBy(Transaction::getCurrency,
                        collectingAndThen(maxBy(Comparator.comparingInt(Transaction::getAmount)),Optional::get)));
        System.out.println("Without Optional");
                resultwithoutOptioanl.forEach((k,v)-> System.out.println(k + " " +v));


                //Another example of summingInt

        Map<String,Integer> summing=list.stream().collect(groupingBy(Transaction::getCurrency,
                summingInt(Transaction::getAmount)));

        System.out.println("using Summing int along with groupingBy");
        summing.forEach((k,v)-> System.out.println(k + " " + v));

    }
}