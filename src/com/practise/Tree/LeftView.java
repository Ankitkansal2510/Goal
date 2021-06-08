package com.practise.Tree;

public class LeftView {
    Node root;
    int maxLevel=0;
    void printLeft(Node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(maxLevel<level)
        {
            System.out.print(" " + root.key);
            maxLevel=level;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);

    }
    void print()
    {
        printLeft(root,1);
    }

    public static void main(String[] args) {
        LeftView tree=new LeftView();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.right=new Node(60);
        tree.print();
    }
}
