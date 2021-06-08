package com.practise.Tree;

public class maximumInBinaryTeam {
    Node root;

    int findMaximum(Node root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            return Math.max(root.key,Math.max(findMaximum(root.left),findMaximum(root.right)));
        }
    }

    public void getMax()
    {
        int max=findMaximum(root);
        System.out.println("The maximum is : " +max);
    }

    public static void main(String[] args) {
        maximumInBinaryTeam tree=new maximumInBinaryTeam();
        tree.root=new Node(10);
        tree.root.left=new Node(100);
        tree.root.right=new Node(70);
        tree.root.left.left=new Node(30);
        tree.root.left.right=new Node(90);

        tree.getMax();
    }
}
