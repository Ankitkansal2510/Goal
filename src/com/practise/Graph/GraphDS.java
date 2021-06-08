package com.practise.Graph;

import java.util.ArrayList;

/**
 *
 * Graph can be represented as matrix or adjacent list,adjacent list is more efficient than matrix
 * representation ,in the below example we will use adjancey list to represent the Graph
 *
 *
 */
public class GraphDS {
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(v);
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        printEdge(adj);
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void printEdge(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
