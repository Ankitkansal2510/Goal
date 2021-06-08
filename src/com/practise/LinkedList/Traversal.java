package com.practise.LinkedList;

public class Traversal {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node second=new Node(30);
        Node third=new Node(40);
        head.next=first;
        first.next=second;
        second.next=third;

        TraverseLinkedList(head);
    }

    private static void TraverseLinkedList(Node head)
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else{
            while(curr!=null)
            {
                System.out.println(curr.data);
                curr=curr.next;
            }
        }
    }
}
