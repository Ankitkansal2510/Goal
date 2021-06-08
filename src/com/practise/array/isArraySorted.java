package com.practise.array;

public class isArraySorted {
    public static void main(String[] args) {
        int arr[]={10,20,13};

        boolean isSorted=isArraySort(arr);
        System.out.println(isSorted);
    }

    public static boolean isArraySort(int arr[])
    {
        boolean result=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                result=true;
            }
            else
            {
                result=false;
                break;
            }
        }
        return result;
    }
}
