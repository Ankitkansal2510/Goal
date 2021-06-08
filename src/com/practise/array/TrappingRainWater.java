package com.practise.array;

//The idea is to pre compute the highest bar on the left and the right side,then using the pre compute value we
//will calculate the minimum water stored between two bar
public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]=   {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getWater(arr));
    }
    private static int getWater(int arr[])
    {
       int n=arr.length;
       int lMax[]=new int[n];
       int rMax[]=new int[n];
       int result=0;
       lMax[0]=arr[0];
       for(int i=1;i<n;i++)
       {
           lMax[i]=Math.max(arr[i],lMax[i-1]);
       }
       rMax[n-1]=arr[n-1];
       for(int i=n-2;i>=0;i--)
       {
           rMax[i]=Math.max(arr[i],rMax[i+1]);
       }

       for(int i=1;i<n-1;i++)
       {
           result+=Math.min(lMax[i],rMax[i])-arr[i];
       }
       return result;
    }
}
