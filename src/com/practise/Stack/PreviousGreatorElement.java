package com.practise.Stack;

import java.util.Stack;

/**
 *
 *
 * if there is no previous greator element then print -1 else print the preious greator element
 */
public class PreviousGreatorElement {
    public static void main(String[] args) {
        int arr[]={15,10,18,12,4,6,2,8};
        printPreviousGreator(arr);
    }

    public static void printPreviousGreator(int arr[]) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.print(-1 + " ");
        for (int i = 1; i < arr.length; i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            int previous=s.isEmpty()?-1:arr[s.peek()];
            System.out.print(previous + " ");
            s.push(i);
        }
    }
}
