package Java8.Stream.Quiz.SecondQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        /**
         * Problem 1:
         *
         * Find all transactions in the year 2011 and sort them by value (small to high).
         *
         * **/

        List<Transaction> solution1=transactions.stream()
                                        .filter(a->(a.getYear()==2011))
                                        .sorted((i,j)-> i.getValue().compareTo(j.getValue()))
                                        .collect(Collectors.toList());

        System.out.println("All sorted transaction in the year 2011 are : " + solution1);

        /**
         * Problem 2 :
         *
         * What are all the unique cities where the traders work?
         *
         * **/

        List<String> traderUniqueCity=transactions.stream()
                                                        .map(a->a.getTrader().getCity())
                                                        .distinct()
                                                        .collect(Collectors.toList());

        System.out.println("Unique city in which Trader work : " + traderUniqueCity);

        /**
         *
         * Problem 3 :
         * Find all traders from Cambridge and sort them by name.
         *
         * */

        List<Trader> traderFromCambridge=transactions.stream()
                                                     .map(Transaction::getTrader)
                                                     .filter(d->d.getCity().equals("Cambridge"))
                                                     .sorted((a,b)->a.getName().compareTo(b.getName()))
                                                     .collect(Collectors.toList());



        System.out.println("Trader from Cambridge and sorted by name: " + traderFromCambridge);

        /**
         * Problem 4 :
         * Return a string of all traders’ names sorted alphabetically.
         * **/

        String traderNameSorted=transactions.stream()
                                .map(d->d.getTrader().getName())
                                .sorted()
                                .reduce("",(a,b)->a+b + " ");

        System.out.println("All traders sorted alphabetically " + traderNameSorted);

        /**
         * Problem 5:
         * Are any traders based in Milan?
         *
         * */

        boolean traderMilan=transactions.stream()
                .anyMatch(d->d.getTrader().getCity().equalsIgnoreCase("Milan"));

        System.out.println("Any trader based in Milan : " + traderMilan);

        /**
         * Problem 6 :
         *
         * Print all transactions’ values from the traders living in Cambridge.
         *
         * **/

        List<Integer> transactionValue=transactions.stream()
                            .filter(d->d.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                            .map(d->d.getValue())
                            .collect(Collectors.toList());
        //or another solution of problem 6 is :
        transactions.stream().filter(d->"Cambridge".equalsIgnoreCase(d.getTrader().getCity()))
                            .map(Transaction::getValue)
                            .forEach(System.out::println);

        System.out.println("Transaction value of trader living in Cambride : " + transactionValue);

        /**
         * Probelm 7 :
         *
         * What’s the highest value of all the transactions?
         *
         * **/

        int maxTranValue=transactions.stream().map(d->d.getValue())
                                              .reduce(0,Integer::max);

        System.out.println("Highest value of all transaction : " + maxTranValue);

        /**
         * Problem 8 :
         *
         * Find the transaction with the smallest value.
         *
         * */

        Optional<Integer> minTransValue=transactions.stream().map(d->d.getValue()).reduce(Integer::min);
        System.out.println("Minimum transaction value : " + minTransValue);
    }
}
