package com.practise.Graph;

/**
 *
 *
 * The below BFS implementation will not work if we havent give the source and the graphs
 * are disconnected
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(5);
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0, 1);
        addEdge(adj,0, 2);
        addEdge(adj,1, 2);
        addEdge(adj,2, 0);
        addEdge(adj,2, 3);
        addEdge(adj,3, 3);
      //  printEdge(adj);
        printBFS(adj,5,2);
    }

    private static void printBFS(ArrayList<ArrayList<Integer>> adj,int v, int s)
    {
        boolean isVisited[]=new boolean[v+1];
        isVisited[s]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        while(q.isEmpty()==false)
        {
            int u=q.poll();
            System.out.println(u);
            for(int x:adj.get(u))
            {
        if(isVisited[x]==false)
        {
            isVisited[x]=true;
            q.add(x);
        }
            }
        }
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private static void printEdge(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j) + " " );
            }
            System.out.println();
        }
    }
}
