package Java8.MethodReference.SecondExample;

import java.util.Arrays;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("z","a","c","b");
        list.sort((String s1,String s2)->s1.compareToIgnoreCase(s2));
        //the above lambda expression can be more simplified as mentioned below
       // list.sort((s1,s2)->s1.compareToIgnoreCase(s2));
        System.out.println(list);

        /**In the above example we have created the lambda
         * (s1,s2)->s1.compateToIgnoreCase(s2);
         *
         * We know instead of passing the code directly , we can use the method reference to pass the method name
         * **/

        List<String> listRefernc=  Arrays.asList("x","z","d","b");
        listRefernc.sort(String::compareToIgnoreCase);//passing the method name instead of code
        System.out.println(listRefernc);
    }
}
