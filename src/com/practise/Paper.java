package com.practise;

public class Paper {
    public static void main(String[] args) {
        int arr[]={12,2,5,4,6};
        int h_index=findSignature(arr);
        System.out.println(h_index);
    }

    private static int findSignature(int arr[])
    {
        int count=0;
        int result=0;
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;i<arr.length;j++)
            {
                if(arr[j]>=i+1)
                {
                    //flag=true;

                    if(count==i+1){
                        flag=true;
                    break;
                    }
                }
            }
            if(flag==true)
            {
                result=i;
            }
        }
        return result;
    }
}
