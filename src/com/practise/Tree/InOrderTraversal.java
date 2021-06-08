package com.practise.Tree;

public class InOrderTraversal {
    Node root;
    public InOrderTraversal()
    {
        root=null;
    }

    void inOrderTraversal(Node root)
    {

        if(root==null)
        {
            return ;
        }
        inOrderTraversal(root.left);
        System.out.println(root.key);
        inOrderTraversal(root.right);
    }
    void printInorder()
    {
        inOrderTraversal(root);
    }
    public static void main(String[] args) {
        InOrderTraversal tree=new InOrderTraversal();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);

        tree.printInorder();


    }
}
