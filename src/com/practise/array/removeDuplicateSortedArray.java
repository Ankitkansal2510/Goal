package com.practise.array;

public class removeDuplicateSortedArray {
    public static void main(String[] args) {
        int arr[]={10,10,20,20,30,40};

       int result= removeDuplicate(arr);
        System.out.println("new size of an array is : " + result);
        for(int i=0;i<result;i++)
        {
            System.out.println(arr[i]);
        }

    }

    public static int removeDuplicate(int arr[])
    {
        int res=1;
         for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[res-1])
            {
                arr[res]=arr[i];
                res++;
            }
        }
         return res;
    }
}
