package com.practise.Graph;

/**
 *
 *  to find the dis
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweightedGraph {
    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
       // printBFS(adj);
        shortest(adj,v,0);
    }
    private static void shortest(ArrayList<ArrayList<Integer>> adj,int v,int s)
    {
        int dist[]=new int[v];
        dist[s]=0;
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[v];
        visited[s]=true;
        q.add(s);
        while(q.isEmpty()==false)
        {
            int u=q.poll();
            for(int x:adj.get(u))
            {
                if(visited[x]==false)
                {
                    dist[x]=dist[u]+1;
                    visited[x]=true;
                    q.add(x);
                }
            }
        }

        for(int i=0;i<dist.length;i++)
        {
            System.out.print(dist[i] + " ");
        }
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    private static void printBFS(ArrayList<ArrayList<Integer>> adj)
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
