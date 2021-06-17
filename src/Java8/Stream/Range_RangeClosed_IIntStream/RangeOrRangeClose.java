package Java8.Stream.Range_RangeClosed_IIntStream;

import java.util.stream.IntStream;

public class RangeOrRangeClose {

    public static void main(String[] args) {
        /**
         * . Numeric ranges
         *
         * Suppose if we want to print all the numbers between some ranges like between 1 to 100 .
         *
         * Java 8 introduces static method avaiable on IntStream and LongStream to help generate such ranges
         * range and rangeClosed method
         * Both the method take starting value and the ending value
         * range is exclusive
         * whereas rangeClosed is inclusive
         *
         *
         *
         * **/
       IntStream.rangeClosed(1,100).forEach(System.out::println);

        //now if we want to print even number between 1 to 50
        System.out.println("Even number between 1-50");
        IntStream.rangeClosed(1,50).filter(n->n%2==0).forEach(System.out::println);


        IntStream maxEvenNumber=IntStream.rangeClosed(1,20).filter(n->n%2==0);
        System.out.println("The maximum of all even number between 1-20 is : " + maxEvenNumber.max());

        IntStream countEvenNumber=IntStream.rangeClosed(1,50).filter(n->n%2==0);

        //rangeClosed is inclusive meaning it will consider second parameter value as well
        System.out.println("The count of all even number between 1-50 is : " + countEvenNumber.count());

        //ange is exclusive meaning it will not consider the second paramter

        IntStream countEvenInclusive=IntStream.range(1,50).filter(n->n%2==0);
        System.out.println("Inclusive Range output : " + countEvenInclusive.count());


    }
}
