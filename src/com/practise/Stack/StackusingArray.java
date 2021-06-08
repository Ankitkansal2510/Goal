package com.practise.Stack;

/**
 *
 * This program is used to create sack using array
 *
 *
 */
class MyStack
{
    int cap;
    int top;
    int arr[];

    public MyStack(int c)
    {
        top=-1;
        cap=c;
        arr=new int[c];
    }

    public void push(int x) throws Exception {
        if(top==cap-1)
        {
            throw  new Exception("Stack is full");
        }
        top++;
        arr[top]=x;
    }

    public int pop() throws Exception {
        if(top==-1){
            throw new Exception("Stack is empty");
        }
        int res=arr[top];
        top--;
        return res;
    }

    public int size()
    {
        return top+1;
    }

    public boolean isEmpty()
    {
        return (top==-1);
    }
    public int peek() throws Exception {
        if(top==-1)
        {
            throw new Exception("STack is empty");
        }
        return arr[top];
    }
}
public class StackusingArray {
    public static void main(String[] args) throws Exception {
        MyStack s=new MyStack(3);
        s.push(10);
        s.push(20);
        System.out.println("size of the stack is : " + s.size());
        System.out.println("Pop element from the sack is : "+ s.pop());
    }
}
