package com.practise.leatcode;

/****
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 */
public class SearchInsertPosition {
    public static void main(String[] args) {

        int arr[]={1};
        int target=2;
        int index=findInsert(arr,target);
        System.out.println(index);
    }
    private static int findInsert(int arr[],int target)
    {
        int index=0;
        for( int i=1;i<arr.length;i++)
        {
            if(arr[i]==target || (target>arr[i-1] && target<arr[i]) )
            {
                index=i;
                break;
            }

        }
        if(target>arr[arr.length-1])
        {
            index=arr.length;
        }

       return index;
    }
}
