package com.practise.array;

/**
 *
 * Sort an array such that all 0 will be in starting , then followed by 1 and then followed by 2
 *
 */
public class SortArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,0,0,1,2};
        int high=arr.length-1;
        int low=0,mid=0;
        sortArray(arr,low ,mid,high);
      for(int i=0;i< arr.length;i++)
      {
          System.out.print(arr[i] + " ");
      }
    }
    private static void sortArray(int arr[],int low,int mid,int high)
    {
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                ++low;
                ++mid;
            }
            else if(arr[mid]==2)
            {
                swap(arr,mid,high);
                --high;
            }
            else{
                ++mid;
            }
        }
    }
    private static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
