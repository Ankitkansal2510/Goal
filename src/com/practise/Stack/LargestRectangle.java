package com.practise.Stack;

import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) {
        int arr[]={6,2,5,4,1,5,6};
        int result=findRectangleLArgestArea(arr);
        System.out.println(result);
    }

    public static int findRectangleLArgestArea(int arr[])
    {
        Stack<Integer> s=new Stack<>();
        int res=0,tp=0,curr=0;
        for(int i=0;i<arr.length;i++)
        {
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i])
            {
                tp=s.pop();
                curr=arr[tp]*(s.isEmpty()?i:(i-s.peek()-1));
                res=Math.max(curr,res);
            }
            s.push(i);
        }
        while(s.isEmpty())
        {
            tp=s.pop();
            curr=arr[tp]*(s.isEmpty()?arr.length:arr.length-s.peek()-1);
            res=Math.max(curr,res);
        }
        return  res;
    }
}
