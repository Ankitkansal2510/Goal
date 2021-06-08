package com.practise.LinkedList;

public class DeleteLastNode {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node two=new Node(30);
        Node third=new Node(40);

        head.next=first;
        first.next=two;
        two.next=third;
        printNode(head);
        deleteLastNode(head);
        System.out.println();
        printNode(head);
    }
    private static void deleteLastNode(Node head)
    {
        while(head.next.next!=null)
        {
            head=head.next;
        }
        head.next=null;
    }
    private static void printNode(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
}
