package Comparable;

import java.util.Comparator;

public class MyComaratorByName implements Comparator<MyComparable> {
    public int compare(MyComparable m1,MyComparable m2){
        int result=m1.getName().compareTo(m2.getName());
        if(result>0){
            return 1;
        }
        else if(result<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
