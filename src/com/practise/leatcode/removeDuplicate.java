package com.practise.leatcode;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int count=removedup(arr);
        System.out.println(count);
    }
    private static int removedup(int arr[])
    {
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[count-1]!=arr[i])
            {
               arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
}
