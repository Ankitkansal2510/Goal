package com.practise.leatcode;

/**
 *
 *
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2]
 *
 * we will use two pointer approach here.say i and j
 * if arr[j]==value  we wont do anything ,if arr[j]!=val , we will assign arr[i]=arr[j] and increement both
 *
 */
public class removeElement {
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val=3;
       int count=removeElem(nums,val);
        System.out.print("[");
       for(int i=0;i<count;i++)
       {
           System.out.print(nums[i] + " ");
       }
        System.out.print("]");
    }

    private static int removeElem(int arr[],int val)
    {
       int i=0;
       for(int j=0;j<arr.length;j++)
       {
           if(arr[j]!=val)
           {
             arr[i]=arr[j];
             i++;
           }
       }
       return i;
    }
}
