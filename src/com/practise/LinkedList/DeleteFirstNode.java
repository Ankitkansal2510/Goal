package com.practise.LinkedList;

public class DeleteFirstNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        head.next=first;
        first.next=second;
        second.next=third;

        printLinked(head);
     head=   deleteNode(head);
        System.out.println();
     printLinked(head);

    }
private static Node deleteNode(Node head)
{
    if(head==null)
    {
        return null;
    }
    else{
        head=head.next;
    }
    return head;
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
}
