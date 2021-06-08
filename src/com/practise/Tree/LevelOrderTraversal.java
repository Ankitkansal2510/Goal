package com.practise.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;

public class LevelOrderTraversal {
    Node root;
    LevelOrderTraversal()
    {
        root=null;
    }

    void printLevel(Node root)
    {
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty())
       {
           Node tempNode=q.poll();
           System.out.print(" "+tempNode.key);
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

    void printLevelOrder()
    {
        printLevel(root);
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree=new LevelOrderTraversal();
        tree.root=new Node(30);
        tree.root.left=new Node(40);
        tree.root.right=new Node(60);
        tree.root.left.left=new Node(70);
        tree.root.left.left.left=new Node(80);

        tree.printLevelOrder();
    }
}
