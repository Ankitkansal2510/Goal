package Java8.Stream.Grouping;


import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors.*;

import static java.util.stream.Collectors.groupingBy;


/**
 * In the previous example (Main.java class within same package) we have used the static grouping method of collectors class
 * to group the transaction by currency for that we have use method reference
 *
 * Lets suppose we want to group by Risk then we cannot use method reference as the Transaction class didnt provide
 * the helper method to achieve this ,in this case we can use pass the lambda as an argument to the grouping method.
 *
 * **/



public class GroupingUsingLambdaExample {

    public static void main(String[] args) {
        List<Transaction> list=new ArrayList<>();
        list.add(new Transaction("INR",550));
        list.add(new Transaction("JPY",1000));
        list.add(new Transaction("US",200));
        list.add(new Transaction("POUND",550));
        list.add(new Transaction("US",1000));
        list.add(new Transaction("INR",200));
        list.add(new Transaction("CHZ",1700));
        list.add(new Transaction("INR",1500));

        //grouping my transaction
        Map<String,List<Transaction>> groupbyCurrency=list.stream()
                                .collect(groupingBy(Transaction::getCurrency));
        for(Map.Entry<String,List<Transaction>> result:groupbyCurrency.entrySet())
        {
            System.out.println(result.getKey() + " " + result.getValue());
        }

        /**
         * Now lets suppose if we want to groupt it by risk for example
         * amount>1000 =higher risk
         * amount>500 and <1000 medium risk
         * amount<500 lower risk
         *
         * This we cannot do using method reference groupingBy(Transaction::SomeMethod) as Transaction class doesnt
         * provide any helper method to achieve this .So how would we do it?
         *
         * For this we can pass the lambda inside as a parameter inside the groupingBy
         *
         * */

        Map<Risk,List<Transaction>> groupByRisk=
                    list.stream().collect(groupingBy(d->{
                        if(d.getAmount()<500)return Risk.LOWER;
                        else if(d.getAmount()>500 && d.getAmount()<1000) return Risk.MEDIUM;
                        else return Risk.HIGH;
                    }));
        System.out.println("Grouping by Risk");
         groupByRisk.forEach((k,v)-> System.out.println(k + " " + v));
    }
}
