package com.practise.string;

/**
 *
 * check if a string is a subsequence of another
 *
 * s=ABCD
 * s2=AD
 *
 *
 */
public class Subsequence {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "AD";
        boolean result = isSubsequence(s1, s2);
        System.out.println(result);
    }
public static boolean isSubsequence(String s1,String s2)
{
    int j=0;
    int n=s1.length();
    int m=s2.length();
    for(int i=0;i<n && j<m ;i++)
    {
        if(s2.charAt(j)==s1.charAt(i))
        {
            j++;
        }
    }
    return (j==m);
}
}
