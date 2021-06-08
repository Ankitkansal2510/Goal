package com.practise.LinkedList;

public class middleL {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node second=new Node(30);
        Node third=new Node(40);
      //  Node four=new Node(50);
        head.next=first;
        first.next=second;
        second.next=third;
        //third.next=four;

        PrintNode.print(head);
        getMiddle(head);
    }

    public static void getMiddle(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);

    }
}
