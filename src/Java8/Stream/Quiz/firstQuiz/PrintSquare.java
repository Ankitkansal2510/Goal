package Java8.Stream.Quiz.firstQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of numbers, how would you return a list of the square of each number?
 * For example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25].
 *
 * **/
public class PrintSquare {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        List<Integer> result=list.stream()
                                 .map(i->i*i)
                                 .collect(Collectors.toList());

        System.out.println("Square of number is : " + result);
    }
}
