package com.practise.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 *
 * This program is a bfs implementation when the source is not given and graphs are disconnected
 */
public class GrpahBFSDisconnected {

    public static void main(String[] args) {
        int v=7;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
        addEdge(adj,4,5);
        addEdge(adj,4,6);
       // printGraph(adj);
        BFSDIS(adj,v);
    }
    private static void printGraph(ArrayList<ArrayList<Integer>> adj)
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
    private static void addEdge(ArrayList<ArrayList<Integer>> adj , int v, int u)
    {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    private static void BFSDIS(ArrayList<ArrayList<Integer>> adj,int v)
    {
        boolean visited[]=new boolean[v+1];
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                BFS(adj,i,visited);
            }
        }
    }

    private static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
    {
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(q.isEmpty()==false)
        {
            int u=q.poll();
            System.out.print(u + " ");
            for(int x:adj.get(u))
            {
                if(visited[x]==false)
                {
                    visited[x]=true;
                    q.add(x);
                }
            }
        }

    }

}
