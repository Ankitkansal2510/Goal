package com.practise.LinkedList;

public class InsertAtGivenPosition {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node second=new Node(30);
        Node third=new Node(40);
        head.next=first;
        first.next=second;
        second.next=third;
        printNode(head);
      head=  insertAtGivenPosition(head,2);
        System.out.println();
        printNode(head);
    }

    private static Node insertAtGivenPosition(Node head,int position)
    {
        Node new_node=new Node(15);
        Node previous=null;
        int count=0;
        Node curr=head;
        if(position==1)
        {
            new_node.next=head;
            head=new_node;
            return head;

        }
        else {
            while (curr != null) {
                count += 1;
                previous = curr;
                curr = curr.next;
                if (count == position-1) {
                    previous.next = new_node;
                    new_node.next = curr;
                }
            }
        }
        return head;
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
