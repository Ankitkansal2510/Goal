package com.practise.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {


        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        head.next=first;
        first.next=second;

        printNode(head);
       insertAtEnd(head,40);
        System.out.println(" " );
        printNode(head);

    }
    private static void insertAtEnd(Node head,int data)
    {
        Node new_Node=new Node(data);
        Node curr=head;
        if(curr==null)
        {
            curr=new_Node;
        }
        else
        {
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=new_Node;
        }
    }
    public static void printNode(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
}
