package com.codechef;

public class ATM {
    public static void main(String[] args) {
        double result=calculateATM(42,120);
        System.out.println(result);
    }
    private static double calculateATM(double a ,double b)
    {
        double res=0;
        if(a>b)
        {
            return b;
        }

        else if( a%5!=0)
        {
            return b;
        }
        else{
             res=b-a;
            res=res-0.50;
        }
return res;
    }
}
