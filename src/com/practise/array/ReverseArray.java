package com.practise.array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={25,30,40,50};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void reverseArray(int arr[])
    {
       int start=0;
       int end=arr.length;
        while(start<end)
        {
            int temp=arr[end-1];
            arr[end-1]=arr[start];
            arr[start]=temp;
            end--;
            start++;
        }
    }
}
