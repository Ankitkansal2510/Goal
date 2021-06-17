package Java8.Stream.findFirst;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * given a list of numbers, finds the first square that’s divisible by 3:
 *
 * findFirst(),findMany(),anyMatch, allMatch, and noneMatch
 *
 * all these method act as a short circuit meaning  some operation dont need to process
 * whole element to produce result. As soon as any condition matches it will stop .
**/
public class findFirstMain {
    public static void main(String[] args) {

        List<Integer>  list= Arrays.asList(1,2,3,4,5);
        Optional<Integer> result=list.stream()
                                    .map(i->i*i)
                                    .filter(i->i%3==0)
                                    .findFirst();

        System.out.println(result);

        /**
         *we have three differenet list , which all get stored in one and then using flatmao we will produce
         * single stream
         * **/
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        List<Integer> res=listOfListofInts.stream()
             .flatMap(List::stream).collect(Collectors.toList());
        System.out.println(res);


    }
}
