package com.practise.string;

public class Anagram {
    public static final int CHAR=256;
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        boolean result=isAnagram(s1,s2);
        System.out.println(result);
    }
    public static boolean isAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int count[]=new int[CHAR];
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i=0;i<CHAR;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
