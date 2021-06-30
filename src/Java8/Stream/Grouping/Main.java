package Java8.Stream.Grouping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * In this we will show groupingby method,using collect uptill now we used to convert the stream into list
 * Now we have interface Collections which hasv some static method which is mor generalised and which returns collectors
 * using this method we can apply more specific
 *
 * In this example we will group the transaction by curreny
 *
 * first method group is a before java 8 style which is little complex and involve nested loops
 *
 * in below we have using Collectos.groupingBy(Transation::getCurrency) -> this is very simple to read
 * and can be easily understand by anyone
 * **/
public class Main {

//below method is old way of doing
        private static Map<String,List<Transaction>> group(List<Transaction> transactions){
            Map<String , List<Transaction>> result=new HashMap<>();
        for(Transaction t:transactions)
        {
        String s=t.getCurrency();
        List<Transaction> transactionforCurrency=result.get(s);
        if(transactionforCurrency==null){
            transactionforCurrency=new ArrayList<>();
            result.put(s,transactionforCurrency);
        }
        transactionforCurrency.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Transaction> transactions =new ArrayList<>();
            transactions.add(new Transaction("INR",100));
            transactions.add(new Transaction("JPY",200));
            transactions.add(new Transaction("DOLLAR",100));
            transactions.add(new Transaction("INR",100));
            transactions.add(new Transaction("JPY",100));
            transactions.add(new Transaction("JPY",100));
            transactions.add(new Transaction("DOLLAR",100));
        Map<String,List<Transaction>> map1=group(transactions);
        for(Map.Entry<String,List<Transaction>> ma:map1.entrySet()){
            System.out.println(ma.getKey() + " " + ma.getValue());
        }

        //using power of functional programming
        Map<String,List<Transaction>> map=transactions.stream().collect(groupingBy(Transaction::getCurrency));
        for(Map.Entry<String,List<Transaction>> ma:map.entrySet()){
            System.out.println(ma.getKey() + " " + ma.getValue());
        }




    }
}
