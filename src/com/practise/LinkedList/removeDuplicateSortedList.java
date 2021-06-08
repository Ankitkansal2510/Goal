package com.practise.LinkedList;

public class removeDuplicateSortedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node two=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(30);
        Node five=new Node(30);
        head.next=first;
        first.next=two;
        two.next=third;
        third.next=fourth;
        fourth.next=five;
        PrintNode.print(head);
      removeDuplicate(head);
        PrintNode.print(head);
    }
    private static void removeDuplicate(Node head)
    {
        Node curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data==curr.next.data)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
       // return head;
    }
}
