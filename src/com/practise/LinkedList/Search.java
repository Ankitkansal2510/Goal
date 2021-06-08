package com.practise.LinkedList;

public class Search {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node first=new Node(20);
        Node second=new Node(30);
        Node third=new Node(40);
        head.next=first;
        first.next=second;
        second.next=third;
        PrintNode.print(head);
        search(head,20);
    }

    private static void search(Node head,int data)
    {
        Node curr=head;
        int count=0;
        if(curr==null)
        {
            System.out.println("Linked list is null");
        }
        else{
            while(curr!=null)
            {
                if(curr.data==data)
                {
                    System.out.println(count+1);
                    break;
                }
                else{
                    curr=curr.next;
                    count+=1;
                }
            }
        }
    }
}
