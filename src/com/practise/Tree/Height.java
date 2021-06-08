package com.practise.Tree;

public class Height {
    Node root;

    public Height()
    {
        root=null;
    }

    public int getHeight(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }

    void printHeight()
    {
        int height=getHeight(root);
        System.out.println(height);
    }

    public static void main(String[] args) {
        Height tree=new Height();
        tree.root=new Node(30);
        tree.root.left=new Node(40);
        tree.root.right=new Node(60);
        tree.root.left.left=new Node(70);
        tree.root.left.left.left=new Node(80);

        tree.printHeight();
    }
}
