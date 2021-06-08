package com.practise.leatcode;

public class lengthLastWord {
    public static void main(String[] args) {
        String str="Hello world Ank";
        int length=getLength(str);
        System.out.println(length);
    }

    public static int getLength(String str)
    {
        int length=0;
        for(int i=str.length()-1;i>0;i--)
        {
            if (str.charAt(i) != ' ')
            {
                length=length+1;
            }
            else
            {
                length=0;
            }
        }

        return length;
    }
}

