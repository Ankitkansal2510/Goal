package Java8.MethodReference.FirstExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MethodReferenceFirst {
/**
 * Method reference can be seen as shorthand for the lambda calling only a specifi method
 *
 * **/
    public
    interface Consumer<T>{
        void accept(T t);
    }
    public static <T> void  print(T t,Consumer<T> c){
     c.accept(t);
    }
    public  static <T> void printStatic(T t){
        System.out.println(t);
    }
    public  <T> void printInstance(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        MethodReferenceFirst m=new MethodReferenceFirst();
        print(10,(Integer i)-> System.out.println(i));//This is the way of calling lamda(passing the code to the method print which accepts the predicate
        print(20,MethodReferenceFirst::printStatic);//Calling static method , so before :: directly can use class Name
        print(30,m::printInstance);//Calling instance method so using reference variable before ::
    }
}
