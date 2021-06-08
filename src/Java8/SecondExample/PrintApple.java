package Java8.SecondExample;

import Java8.firstExample.Apple;
import Java8.SecondExample.Predicate;

import java.util.ArrayList;
import java.util.List;

public class PrintApple {

    public static void preetyPrintApple(List<Apple> inventory, Predicate<Apple> p){

      for(Apple apple:inventory){
          String output=p.appleInfo(apple);
          System.out.print(String.format("%s ",output));
      }
        System.out.println();

    }

    public static void main(String[] args) {
        List<Apple> appleList=new ArrayList<>();
        appleList.add(new Apple("Green",150));
        appleList.add(new Apple("Red",100));
        appleList.add(new Apple("Blue",120));
        appleList.add(new Apple("Green",350));

        preetyPrintApple(appleList,(Apple a)->a.getColour());
        preetyPrintApple(appleList,(Apple a)->"An apple of " + String.valueOf(a.getWeight()) + "g");
    }
}
