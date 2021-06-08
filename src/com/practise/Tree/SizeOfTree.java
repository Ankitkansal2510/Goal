package com.practise.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTree {
    Node root;
    public SizeOfTree()
    {
        root=null;
    }

    void sizeFirstMethod(Node root)
    {
        int count=0;
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node tempNode= q.poll();
            count++;
            System.out.print(" " + tempNode.key);
            if(tempNode.left!=null)
            {
                q.add(tempNode.left);
            }
            if(tempNode.right!=null)
            {
                q.add(tempNode.right);
            }
        }
        System.out.println(" The size of the tree is : " + count) ;
    }
int sizeSecondMethod(Node root)
{
    if(root==null)
    {
        return 0;
    }
    else
    {
        return 1+sizeSecondMethod(root.left)+sizeSecondMethod(root.right);
    }
}
   void  printSize()
    {
        sizeFirstMethod(root);
        int size=sizeSecondMethod(root);
        System.out.println();
        System.out.println("The size of the tree using second method is : " + size);
    }

    public static void main(String[] args) {
        SizeOfTree tree=new SizeOfTree();
        tree.root=new Node(10);
        tree.root.left=new Node(80);
        tree.root.right=new Node(70);
        tree.root.left.left=new Node(30);
        tree.root.left.right=new Node(40);


        tree.printSize();
    }
}
