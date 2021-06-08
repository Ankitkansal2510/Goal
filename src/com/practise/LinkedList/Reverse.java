package com.practise.LinkedList;

 class Reverse {
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
         head=reverse(head);
        PrintNode.print(head);
    }

    private static Node reverse(Node head)
    {
        Node curr=head;
        Node previous=null;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=previous;
            previous=curr;
            curr=next;
        }
        return previous;
    }
}
