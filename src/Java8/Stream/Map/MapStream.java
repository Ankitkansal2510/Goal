package Java8.Stream.Map;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *stream support a method map which takes a function as the argument .The function is applied to each element
 * ,mapping it to new element
 * **/

 class Dish{
    private final String name;
    private final Integer calorie;

    public Dish(String name, Integer calorie) {
        this.name = name;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public Integer getCalorie() {
        return calorie;
    }
}
public class MapStream {
     /**
      * Below Interface CustomMap and static method Name is created for the custom implementation of
      * the map method provided by stream
      * But in actual we need not to do as we can use direct method map(function) provided by string
      *
      * **/
     public interface CustomMap<T,R>{
         R map(T t);
     }
     public static <T,R> List<R> Name(List<T> list,CustomMap<T,R> mapname){
         List<R> result=new ArrayList<>();
         for(T t:list){
             result.add(mapname.map(t));
         }
         return result;
    }
    public static void main(String[] args) {
        List<Dish> dishList=new ArrayList<>();
        dishList.add((new Dish("Butter chicken",300)));
        dishList.add((new Dish("Ice cream",500)));
        dishList.add((new Dish("Mutton",230)));
        dishList.add((new Dish("Kadhai Paneer",100)));
        /***
         *If we want to extract the name of the Dish in the stream then we can use the method method ,
         *and pass the getName method to extract the name
         * */

        List<String> dishName=dishList.stream().map(Dish::getName).collect(Collectors.toList());
        System.out.println("using Stream map method " + dishName);
        //OR
       // List<String> dishName1=Name(dishList,d->d.getName());
        List<String> dishName1=Name(dishList,Dish::getName);//using custom implementation of map

        System.out.println("using custom Map method : " + dishName1);


        /**
         * Now suppose we want to get the length of the each word in the list
         * **/

        List<String> bookName= Arrays.asList("Java","Docker","Computer Networks");
        List<Integer> lengthWord=bookName.stream().map(String::length).collect(Collectors.toList());
      //  List<Integer> lengthWord=bookName.stream().map(d->d.length()).collect(Collectors.toList());
        System.out.println("Length of each word: " + lengthWord);

        /**
         * Now in the previous example of Dish ,If we want to return the length
         * of the name of the each dish then how would be doing it
         * ????????????
         *
         * We can chain multiple map method
         *
         * like firstly we can extract the each name from it and then find out the length of the each word
         *
         * **/
        List<Integer> dishNameLength=dishList.stream()
                                             .map(Dish::getName)
                                              .map(String::length).collect(Collectors.toList());
        System.out.println("Length of each word of the dishName: " + dishNameLength);
        List<String> bookName1= Arrays.asList("Java","Docker","Computer Networks");
        List<String[]> y=bookName1.stream().map(x->x.split("")).collect(Collectors.toList());
        System.out.println(y);
    }
}
