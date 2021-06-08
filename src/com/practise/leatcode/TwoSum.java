package com.practise.leatcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=17;

        int result[]=findTwoSum(arr,target);;
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] findTwoSum(int arr[],int target)
    {
        Map<Integer,Integer> result=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int out=target-arr[i];
            if(result.containsKey(out))
            {
                return new int[]{result.get(out),i};
            }

            result.put(arr[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");

           }
}
