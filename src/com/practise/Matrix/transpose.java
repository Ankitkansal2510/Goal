package com.practise.Matrix;

public class transpose {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Transpose(arr);
        printMatrix(arr);
    }
    private static void Transpose(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[i].length;j++)
            {

                swap(arr,i,j);
            }
        }
    }

    private static void printMatrix(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    private static void swap(int arr[][],int i, int j) {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}

