package Java8.Stream.Partitioning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

/***
 * In this demo we will partition the numbers on the basis of prime or not
 *
 *
 *
 * */
public class PartitionByPrimeOrNonPrime {
    public static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(
                        partitioningBy(candidate -> isPrime(candidate)));
    }

    public static void main(String[] args) {
       Map<Boolean,List<Integer>> result=partitionPrimes(50);
       result.forEach((k,v)-> System.out.println(k + " " +v));


     
    }
}
