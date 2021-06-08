package com.practise.array;

public class largestElement {

    public static void main(String[] args) {
        int arr[]={10,20,30,50,40,70};
        int largest=findLargest(arr);
        System.out.println(largest);
    }

    public static int findLargest(int arr[])
    {
        int largest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
}
