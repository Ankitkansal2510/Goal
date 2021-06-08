package com.practise;
class Node{

    int data;
    Node left;
    Node right;

    Node(int x)
    {
        data=x;
        left=right=null;
    }
}
public class heightTree {
    Node root;
    private  int getHeight(Node root){
        if(root==null){
            return 0;
        }

       else
            return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
    public static void main(String[] args) {
        heightTree tree=new heightTree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        System.out.println("Height of the tree is : " + tree.getHeight(tree.root));
    }

}
