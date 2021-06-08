package com.practise.Matrix;

/**
 *
 *
 * Rotate a matrix by 90 degree anticlock wise
 *
 */
public class RotateMAtrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,},{4,5,6,},{7,8,9}};
        RotateMatrixAnticlock90(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void RotateMatrixAnticlock90(int arr[][])
    {
        //First we will transpose the matrix
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[i].length;j++)
            {
                swap(arr,i,j);
            }

        }

        //Once we found the transpose of a matrix then we will simply reverse the matrix by column

        for(int i=0;i<arr.length;i++)
        {
            int low=0,high=arr.length-1;
            while(low<high)
            {
                swapReverse(arr,low,high,i);
                low++;
                high--;
            }
        }
    }

    private static void swapReverse(int arr[][],int low,int high,int i)
    {
        int temp=arr[low][i];
        arr[low][i]=arr[high][i];
        arr[high][i]=temp;
    }

    private static void swap(int arr[][],int i,int j)
    {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}
