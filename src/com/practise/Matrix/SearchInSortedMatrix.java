package com.practise.Matrix;

/**
 *
 * start from top right corner,
 * if x is same print
 * if x is smaller then move left
 * if x is greator more down
 *
 *
 */
public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        findPosition(arr,29);
    }
    private static void findPosition(int arr[][],int target)
    {
        int i=0,j=arr[0].length-1;

        while(i<arr.length && j>=0)
        {
            if(arr[i][j]==target)
            {
            System.out.println("Found at postition at " + i + " " +j + " " + arr[i][j]);
            }

            if(target<arr[i][j])
            {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not found");
    }

}
