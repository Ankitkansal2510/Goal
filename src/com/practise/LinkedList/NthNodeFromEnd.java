package com.practise.LinkedList;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node two=new Node(30);
        Node third=new Node(40);
        Node fourth=new Node(50);
        head.next=first;
        first.next=two;
        two.next=third;
        third.next=fourth;
        PrintNode.print(head);
        getNode(head,3);
    }

    private static void getNode(Node head,int nodefromEnd)
    {
        Node curr=head;
        int length=0;
        int n=0;
        while(curr!=null)
        {
            length+=1;
            curr=curr.next;
        }
        curr=head;
        n=length-nodefromEnd+1;
        //System.out.println(length);
        int i=1;
        while(i!=n)
        {
            curr=curr.next;
            i++;
        }
        System.out.println(curr.data);
    }
}
