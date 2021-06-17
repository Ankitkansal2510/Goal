package Java8.Stream.Quiz.firstQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Given two lists of numbers, how would you return all pairs of numbers?
 *  For example, given a list [1, 2, 3] and a list [3, 4]
 *  you should return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)].
 *  For simplicity, you can represent a pair as an array with two elements.
 *
 * **/
public class PairNumber {

    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<int[]> result = list1.stream()
                .flatMap(i -> list2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        for (int[] ints : result) {
            System.out.print(Arrays.toString(ints) + " ");
        }

        System.out.println();
        /*
         * How would you extend the previous example to return only pairs whose sum is divisible by 3?
         * For example, (2, 4) and (3, 3) are valid.
         * */

        List<int[]> sumResult=list1.stream()
                                    .flatMap(i->list2.stream()
                                                    .filter(j->(i+j)%3==0)
                                                    .map(j->new int[]{i,j})
                                            )
                                     .collect(Collectors.toList());

        for(int[] ints:sumResult){
            System.out.print(Arrays.toString(ints) + " ");
        }

    }
}