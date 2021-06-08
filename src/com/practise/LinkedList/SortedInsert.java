package com.practise.LinkedList;

public class SortedInsert {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node second=new Node(30);
        head.next=first;
        first.next=second;
        PrintNode.print(head);
      head=  insert(head,35);
        PrintNode.print(head);
    }

    public static Node insert(Node head,int data)
    {
        Node new_Node=new Node(data);
        if(head==null)
        {
            return new_Node;
        }

        if(head.data>data)
        {
            new_Node.next=head;
            head=new_Node;
            return head;
        }

        Node curr=head;
        while(curr.next!=null && curr.next.data<data)
        {
            curr=curr.next;
        }
        new_Node.next=curr.next;
        curr.next=new_Node;
        return head;
    }
}
