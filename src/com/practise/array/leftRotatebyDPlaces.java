package com.practise.array;

public class leftRotatebyDPlaces {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        leftRotatebyDPlace(arr,2);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void leftRotatebyDPlace(int arr[],int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr, int low, int high) {

        while (low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }


    }
}

