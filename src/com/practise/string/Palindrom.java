package com.practise.string;

public class Palindrom {
    public static void main(String[] args) {
        String s ="NAMANA";
        boolean result=isPalindrom(s);
        System.out.println(result);
    }
    public static boolean isPalindrom(String s)
    {
       int start=0;
       int end=s.length()-1;
       while(start<end)
       {
           if(s.charAt(start)!=s.charAt(end))
           {
            return   false;
           }
           start++;
           end--;
       }
       return true;

    }
}
