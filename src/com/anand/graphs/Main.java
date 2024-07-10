package com.anand.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static ArrayList<Node> graph;

    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
    }

    private static void BFS() {
        if (graph.isEmpty()) {
            return;
        }

        // Create a queue for BFS
        Queue<Node> queue = new LinkedList<>();
        // Mark all nodes as not visited
        boolean[] visited = new boolean[graph.size()];

        // Start with the first node
        Node startNode = graph.get(0);
        queue.add(startNode);
        visited[startNode.getKey() - 1] = true; // Assuming keys start from 1

        while (!queue.isEmpty()) {
            // Dequeue a node from the queue
            Node node = queue.poll();
            System.out.println("Visited node: " + node.getKey());

            // Get all adjacent nodes of the dequeued node
            for (int adj : node.getNodes()) {
                if (!visited[adj - 1]) { // Assuming keys start from 1
                    visited[adj - 1] = true;
                    queue.add(graph.get(adj - 1));
                }
            }
        }
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        int edgeCount = 0;
        // Specify the path to tree.txt correctly
        Scanner scan = new Scanner(new File("src/com/anand/graphs/tree.txt"));
        while (scan.hasNext()) {
            String line = scan.nextLine();
            edgeCount += parseLine(line);
        }
        System.out.println("Number of nodes: " + graph.size());
        System.out.println("Number of edges: " + edgeCount);
    }

    private static int parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> nodes = new ArrayList<>();
        for (int i = 1; i < keys.length; i++) {
            nodes.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, nodes));
        return keys.length - 1; // Return the number of edges added for this node
    }
}
