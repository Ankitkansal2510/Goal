package com.practise.Stack;

class Node{
    int data;
    Node next;

    public Node(int d)
    {
        data=d;
        next=null;
    }
}

class StackLinked{

    Node head;
    int size=0;

    public void push(int x)
    {
        Node new_node = new Node(x);
        if(head==null) {
            head = new_node;
            size++;
        }
        else{
            new_node.next=head;
            head=new_node;
            size++;
        }
    }

    public int pop(){
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }

    public int peek(){
        return head.data;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return (head==null);
    }

}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackLinked s = new StackLinked();
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.peek());
    }
}
