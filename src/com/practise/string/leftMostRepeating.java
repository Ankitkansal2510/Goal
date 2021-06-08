package com.practise.string;

public class leftMostRepeating {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        int index=getIndex(s1);
        System.out.println(index);
    }

    public static int getIndex(String s1)
    {
        int index=0;
        boolean visited[]=new boolean[256];
        for(int i=s1.length()-1;i>=0;i--)
        {
            if(visited[s1.charAt(i)])
            {
                index=i;
            }
            else{
                visited[s1.charAt(i)]=true;
            }
        }
        return index;
    }
}
