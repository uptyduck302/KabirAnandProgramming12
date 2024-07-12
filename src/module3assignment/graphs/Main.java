package module3assignment.graphs;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Node root = buildGraph("src/module3assignment/graphs/tree.txt");
            bfs(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Node buildGraph(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        Map<Integer, Node> nodes = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            int parentValue = Integer.parseInt(parts[0]);
            int childValue = Integer.parseInt(parts[1]);
            nodes.putIfAbsent(parentValue, new Node(parentValue));
            nodes.putIfAbsent(childValue, new Node(childValue));
            nodes.get(parentValue).children.add(nodes.get(childValue));
        }
        br.close();
        return nodes.get(1); // Assuming 1 is the root node
    }

    public static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.value + " ");
            for (Node child : node.children) {
                if (!visited.contains(child)) {
                    queue.add(child);
                    visited.add(child);
                }
            }
        }
    }
}
