package com.practise.Stack;

import java.util.Stack;

public class SpanOFArray {
    public static void main(String[] args) {
        int arr[]={30,20,25,28,27,29};
        printSpan(arr);
    }
    public static void printSpan(int arr[])
    {
        int span=0;
        Stack<Integer> s=new Stack<>();
        s.push(0);
        System.out.print(1 + " ");
        for(int i=1;i<arr.length;i++)
        {
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }
}
