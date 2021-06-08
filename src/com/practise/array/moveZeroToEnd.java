package com.practise.array;

public class moveZeroToEnd {

    public static void main(String[] args) {
        int arr[]={10,20,0,0,0,30,0,40};
        movezeroend(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void movezeroend(int arr[])
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }
}
