package com.practise.array;

public class leftRotateAnArrayOne {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        rotateArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void rotateArray(int arr[])
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
