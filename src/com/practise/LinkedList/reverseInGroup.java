package com.practise.LinkedList;

import java.rmi.UnexpectedException;

public class reverseInGroup {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node two=new Node(30);
        Node third=new Node(35);
        Node fourth=new Node(40);
        Node five=new Node(45);
        head.next=first;
        first.next=two;
        two.next=third;
        third.next=fourth;
        fourth.next=five;
        PrintNode.print(head);
        head=reverseGroup(head,3);
        PrintNode.print(head);
    }

    private static Node reverseGroup(Node head,int k)
    {
        Node curr=head;
        Node next=null;
        Node previous=null;
        int count=0;
        while(curr!=null && count<k)
        {
            next=curr.next;
            curr.next=previous;
            previous=curr;
            curr=next;
            count++;
        }

        if(next!=null)
        {
            head.next=reverseGroup(next,k);
        }
        return  previous;
    }
}
