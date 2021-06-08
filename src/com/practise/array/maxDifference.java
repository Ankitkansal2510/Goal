package com.practise.array;

public class maxDifference {
    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1};
        System.out.println(maxDiffer(arr));
    }

    public static int maxDiffer(int arr[])
    {
        int res=arr[1]-arr[0];
        int minVal=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            res= Math.max(res,arr[i]-minVal);
            minVal=Math.min(minVal,arr[i]);
        }
        return res;
    }
}
