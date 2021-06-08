package com.practise.DynamicProgramming;

public class Fibonnaci_Tabulation {
    public static void main(String[] args) {
        int n=8;
        System.out.println(getFibonnaci(n));
    }
    private static int getFibonnaci(int n)
    {
        int tabulation[]=new int[n+1];
        tabulation[0]=0;
        tabulation[1]=1;
        for(int i=2;i<=n;i++)
        {
            tabulation[i]=tabulation[i-1]+tabulation[i-2];
        }
        return tabulation[n];
    }
}
