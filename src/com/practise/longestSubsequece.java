package com.practise;

public class longestSubsequece {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="bdgek";
        int m=s1.length();
        int n=s2.length();
        findLongestCommonSubsequence(s1,s2,m,n);
    }
    private static void findLongestCommonSubsequence(String x,String y, int m, int n)
    {
        int [][] l=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                    l[i][j]=0;
                else if (x.charAt(i-1)==y.charAt(j-1))
                    l[i][j]=l[i-1][j-1]+1;
                else
                    l[i][j]=Math.max(l[i-1][j],l[i][j-1]);
            }
        }

        int startIndex=l[m][n];
        int temp=startIndex;
        char [] lcs=new char[startIndex+1];
        int i=m;
        int j=n;

        while(i>0 && j>0)
        {
            if(x.charAt(i-1)==y.charAt(j-1))
            {
                lcs[startIndex-1]=x.charAt(i-1);
                i--;
                j--;
                startIndex--;
            }
            else if(l[i-1][j]>l[i][j-1])
                i--;
            else
                j--;

        }

        for(int k=0;k<temp;k++)
        {
            System.out.print(lcs[k]);
        }
    }
}
