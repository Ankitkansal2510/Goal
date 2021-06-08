package com.practise.LinkedList;

public class InsertAtBegining {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node second=new Node(30);
        head.next=first;
        first.next=second;
        printLinked(head);
      head=  insertAtBeg(head,5);
        System.out.println("printing after insertion");
        printLinked(head);
    }
    private static void printLinked(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }

    private static Node insertAtBeg(Node head,int data)
    {
        Node new_Node=new Node(data);
        if(head==null)
        {
            new_Node=head;
        }
        else{
            new_Node.next=head;
            head=new_Node;
        }
        return head;
    }
}
