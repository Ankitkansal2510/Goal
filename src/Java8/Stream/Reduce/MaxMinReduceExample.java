package Java8.Stream.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //This program will demonstrate how to find maximum and minimum

        int maxMethodRef= list.stream().reduce(0,Integer::max);
        int maxLambda=list.stream().reduce(0,(a,b)->a>b?a:b);
        Optional<Integer> maxOptional=list.stream().reduce(Integer::max);
        Optional<Integer> minValue=list.stream().reduce(Integer::min);

        System.out.println("Using method reference : " + maxMethodRef);
        System.out.println("using lamnda expression : " + maxLambda);
        System.out.println("using maxOptional expression : " + maxOptional);
        System.out.println("Minimum value : " + minValue);
        //Simi


    }
}
