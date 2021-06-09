package Java8.Function;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.ToIntFunction;

public class FunctionMainClass {

    /**
     *Fuction<T,R> functional interface contains one abstract method which take two object as an argument and return one
     * e.x It take T and R is an argument and return R ,
     * We used this lambda when we want to map the infomration on the input to the output
     * example mapping of string to its length
     *
     * */

    public static <T,R> List<R> map(List<T> list,Function<T,R> f){
        List<R> result=new ArrayList<>();
        for(T s:list)
        {
            result.add(f.apply(s));
        }
        return result;
    }

    public static <T,R,U> U operation(T a1, R a2, Java8.Function.BiFunction<T,R,U> biFunction){
        U result=biFunction.apply(a1,a2);
        return result;
    }

    public static <T,R,U> List<U> operation1(List<T> a1, List<R> a2, Java8.Function.BiFunction<T,R,U> biFunction){
        List<U> result=new ArrayList<>();
        for(int i=0;i<a1.size();i++) {
            result.add(biFunction.apply(a1.get(i), a2.get(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Ankit",20);
        map.put("Kansal",30);

        List<Integer> output=map(Arrays.asList("Hello","Ankit","How are you"),(String s)->s.length());
        System.out.println(output);


        ToIntFunction<Double> ob = a -> (int)(a * 10);
        System.out.println(ob.applyAsInt(3.02323));
      /*  BiFunction<Integer, Integer, Integer> c3 =  This BiFunction is already available in java api
                (Integer a1, Integer a2) -> a1*a2;*/
        System.out.println("Self created biFunction to perform opration in Two integer");
         //The type of below line lamda function is BiFunction,
        //the type of lambda function is deduced to a a context the lambda function is used
        System.out.println(operation(10.2,10.2,(Double i1,Double i2)->i1*i2));
        System.out.println(operation(10,10,(Integer i1,Integer i2)->i1*i2));
        System.out.println("Self created biFunction to perform opration in Two Lsit of type integer");
        List<Integer> biFunctionList=operation1(Arrays.asList(5,6,7,8),Arrays.asList(2,3,4,5),
                (Integer i1,Integer i2)->i1+i2);
        System.out.println(biFunctionList);

        // Applying the above function
        // using applyAsInt()

    }
}
