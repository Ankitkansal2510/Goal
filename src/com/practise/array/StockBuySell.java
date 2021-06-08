package com.practise.array;

/**
 * you can buy and sell stock multiple times to gain the max profit
 *
 *
 *
 */
public class StockBuySell {
    public static void main(String[] args) {
        int arr[]={1,5,3,8,12};
        System.out.println(findmaxprofit(arr));
    }

    public static int findmaxprofit(int arr[])
    {
        int profit=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit=profit+(arr[i]-arr[i-1]);
            }

        }
        return profit;
    }
}
