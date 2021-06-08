package com.practise.Graph;

import java.util.ArrayList;

/**
 *
 *
 * In DFS we first go to one vertex print it , then visit to its adjacent , then print the adjacent then
 * recursivly go to the adjacents adjacent and so on.This algo is for connected graph
 *
 */
public class DFS {
    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0, 1);
        addEdge(adj,0, 2);
        addEdge(adj,1, 2);
        addEdge(adj,2, 0);
        addEdge(adj,2, 3);
        addEdge(adj,3, 3);
        printDFS(adj,v,0);
    }

    private static void printDFS(ArrayList<ArrayList<Integer>> adj,int v,int s)
    {
        boolean visited[]=new boolean[v];
        DFSRec(adj,s,visited);
    }

    private static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean []visited)
    {
        visited[s]=true;
        System.out.print(s + " ");
        for(int x:adj.get(s))
        {
            if(visited[x]==false)
            {
                DFSRec(adj,x,visited);
            }
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
