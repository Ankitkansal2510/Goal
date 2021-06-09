package Java8.Consmer;

import java.util.Arrays;
import java.util.List;

public class ConsumerMain {

    /**
     * Consumer Functional interface accepts an Object as argument but it didnt retur anythin
     * It is used to accept the object , it contain one method i.e public void accept(T t)
     *
     * */
    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T i:list){
            consumer.accept(i);
        }
    }
    public static void main(String[] args) {

        forEach(Arrays.asList(1,2,3,4,5),(Integer i)-> System.out.print(i + " "));
        System.out.println();
        forEach(Arrays.asList("a","b","c","d"),(String s)-> System.out.print(s + " "));

    }
}
