package com.practise.Graph;

import java.util.ArrayList;

public class DetectCycleUndirectedGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 6;
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 4);
        addEdge(adj, 4, 5);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        boolean result = detecCycle(adj, v);
        System.out.println(result);
    }

    private static boolean detecCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false)
                if (detecCycleRec(adj, i, visited, -1) == true)
                    return true;
        }
        return false;
    }

    private static boolean detecCycleRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        for (int x : adj.get(s)) {
            if (visited[x] == false) {
                if (detecCycleRec(adj, x, visited, s) == true) {
                    return true;
                } else if (x != parent) {
                    return true;
                }
            }
        }
        return false;
    }


    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
