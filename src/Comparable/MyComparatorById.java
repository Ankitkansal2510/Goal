package Comparable;

import java.util.Comparator;

public class MyComparatorById implements Comparator<MyComparable> {

    public int compare(MyComparable m1,MyComparable m2){

        if(m1.getId()>m2.getId()){
            return 1;
        }
        else if (m1.getId()<m2.getId()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
