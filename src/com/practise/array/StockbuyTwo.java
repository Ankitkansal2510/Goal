package com.practise.array;

/**
 *
 *
 * you can only buy and sell stock once
 */
public class StockbuyTwo {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(getMaxProfit(arr));
    }

    public static int getMaxProfit(int arr[])
    {
       int minPrice=arr[0];
       int maxProfit=0;

       for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<minPrice)
            {
                minPrice=arr[i];
            }
            else if(arr[i]-minPrice>maxProfit)
            {
                maxProfit=arr[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
