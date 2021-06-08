package com.practise.Tree;

public class PrintNodeAtKDistance {
    Node root;
    PrintNodeAtKDistance()
    {
        root=null;
    }

    void printNode(Node root,int k)
    {
        if(root==null)
        {
            return ;
        }
        if(k==0)
        {
            System.out.print (" " + root.key);
        }
        else
        {
            printNode(root.left,k-1);
            printNode(root.right,k-1);
        }
    }
    void printNode()
    {
        printNode(root,2);
    }
    public static void main(String[] args) {
        PrintNodeAtKDistance tree=new PrintNodeAtKDistance();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.right=new Node(70);

        tree.printNode();
    }

}
