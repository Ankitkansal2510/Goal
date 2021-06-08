package com.practise.array;

//Leader element in an array is an element who doesnt have any greater element towards its
//left
public class LeadersInArray {

    public static void main(String[] args) {
        int arr[]={7,10,4,3,6,5,2};
        findLeader(arr);
    }
    public static void findLeader(int arr[])
    {
        int curr_leader=arr[arr.length-1];
        System.out.print("Current leader is : " + curr_leader);

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>curr_leader)
            {
             curr_leader=arr[i];
                System.out.print (" " + curr_leader);
            }
        }
    }


}
