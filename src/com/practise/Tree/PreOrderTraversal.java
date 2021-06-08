package com.practise.Tree;

public class PreOrderTraversal {

    Node root;
    public PreOrderTraversal()
    {
        root=null;
    }
    public void PreOder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(" " + root.key);
        PreOder(root.left);
        PreOder(root.right);
    }
   void  printPreOrderTraversal()
    {
        PreOder(root);
    }

    public static void main(String[] args) {
        PreOrderTraversal tree=new PreOrderTraversal();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);

        tree.printPreOrderTraversal();

    }
}
