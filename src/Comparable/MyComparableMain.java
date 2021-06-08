package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparableMain {
    public static void main(String[] args) {
        List<MyComparable> list=new ArrayList<>();
        list.add(new MyComparable(1,"ZAnkit"));
        list.add(new MyComparable(2,"AANKIT"));
        list.add(new MyComparable(3,"Bagga"));
        list.add(new MyComparable(4,"Dhanush"));
        list.add(new MyComparable(5,"Chaman"));
        Collections.sort(list);
       for(MyComparable name:list){
           System.out.print(name.getName() + " ");
       }

        Comparator<MyComparable> comaratorByNameComparator= new MyComaratorByName();
       Comparator<MyComparable> comaratorById=new MyComparatorById();
       Collections.sort(list,comaratorByNameComparator);
        System.out.print(String.format("%n%s%n","Sorting by Name"));
       for(MyComparable name:list){
           System.out.print(name + " ");
       }
        System.out.println(String.format("%n%s%n","Sorting by ID"));
       Collections.sort(list,comaratorById);
       for(MyComparable id:list){
           System.out.print(id + " ");
       }

    }
}
