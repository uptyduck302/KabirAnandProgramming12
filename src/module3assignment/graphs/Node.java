package module3assignment.graphs;

import java.util.LinkedList;
import java.util.List;

public class Node {
    public int value;
    public List<Node> children;

    public Node(int value) {
        this.value = value;
        this.children = new LinkedList<>();
    }
}
