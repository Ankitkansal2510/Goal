package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Sort implements Comparable<Sort>
{
    String name;
    public Sort(String name)
    {
        this.name=name;
    }
    @Override
    public int compareTo(Sort o) {
        return this.name.compareTo(o.name);
    }

}
public class A2 {

    public static void main(String[] args) {
        List<Sort> list=new ArrayList<>();
        list.add(new Sort("Ankit"));
        list.add(new Sort("kansal"));
        list.add(new Sort("Ba"));

        Collections.sort(list);
      for(int i=0;i>list.size();i++){
          System.out.println(list.get(i));
      }
    }
}
