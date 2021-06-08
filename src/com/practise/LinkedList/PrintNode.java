package com.practise.LinkedList;

public class PrintNode {
    public static void  print(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data + " ");
           curr=curr.next;
        }
        System.out.println();
    }
}
