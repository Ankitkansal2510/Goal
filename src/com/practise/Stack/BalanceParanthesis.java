package com.practise.Stack;

import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String[] args) {
        String str="{[]}";
        boolean result=isBalanced(str);
        System.out.println(result);
    }

    public static  boolean isBalanced(String str)
    {
        Stack s=new Stack();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
            {
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty())
                {
                    return false;
                }
                else if(matching((char) s.peek(),str.charAt(i))==false)
                {
                    return false;
                }
                else{
                    s.pop();
                }
            }

        }
        return (s.isEmpty()==true);
    }

    public static boolean matching(char a,char b)
    {
        return ((a=='(' && b==')' ||
                a=='{' && b=='}' ||
                a=='[' && b==']'));
    }
}
