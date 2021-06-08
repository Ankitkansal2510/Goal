package com.practise.Tree;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineByLine {
    Node root;
    LevelOrderLineByLine()
    {
        root=null;
    }

    void levelOrderTraverLine(Node root)
    {
       if(root==null)
       {
           return;
       }
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       q.add(null);
       while(q.size()>1)
       {
           Node tempNode=q.poll();
           if(tempNode==null)
           {
               System.out.println();
               q.add(null);
               continue;
           }
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

    }

    void print()
    {
        levelOrderTraverLine(root);
    }
    public static void main(String[] args) {
        LevelOrderLineByLine tree=new LevelOrderLineByLine();
        tree.root=new Node(30);
        tree.root.left=new Node(40);
        tree.root.right=new Node(60);
        tree.root.left.left=new Node(70);
        tree.root.left.right=new Node(75);
        tree.root.left.left.left=new Node(80);

        tree.print();
    }
}
