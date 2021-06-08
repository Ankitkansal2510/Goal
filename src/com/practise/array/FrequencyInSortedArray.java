package com.practise.array;

public class FrequencyInSortedArray {
    public static void main(String[] args) {
        int arr[]={10,10,10,25,30,30};
        printFrequency(arr);
    }

    public static void printFrequency(int arr[])
    {
      int freq=1;int i=1;
      int n=arr.length;
      while(i<n)
      {
          while(i<n && arr[i]==arr[i-1])
          {
              freq++;
              i++;
          }
          System.out.println(arr[i-1] + " " + freq);
          i++;
          freq=1;
      }
    }
}
