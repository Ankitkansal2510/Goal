package com.practise.Stack;

import java.util.ArrayList;

class MyStackList{

    ArrayList<Integer> al=new ArrayList<>();

    void push(int x)
    {
        al.add(x);
    }

    public int pop(){
        int res=al.get(al.size()-1);
        al.remove(al.get(al.size()-1));
        return res;
    }

    public int peek(){
        return al.get(al.size()-1);
    }

    public int size(){
        return al.size();
    }

    public boolean isEmpty(){
        return al.isEmpty();
    }

}
public class StackusingArrayList {
    public static void main(String[] args) {


        MyStackList s = new MyStackList();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.peek());

    }
}
