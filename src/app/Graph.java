package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private final Map<Integer, List<Integer>> graph;

    public Graph() {
        graph = new HashMap<>();
    }

    public void addVertex(int vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        if (graph.containsKey(source) && graph.containsKey(destination)) {
            if (!graph.get(source).contains(destination)) {
                graph.get(source).add(destination);
            }
            if (!graph.get(destination).contains(source)) {
                graph.get(destination).add(source);
            }
        }
    }

    public void removeVertex(int vertex) {
        if (graph.containsKey(vertex)) {
            for (int neighbor : graph.get(vertex)) {
                graph.get(neighbor).remove(Integer.valueOf(vertex));
            }
            graph.remove(vertex);
        }
    }

    public void removeEdge(int source, int destination) {
        if (graph.containsKey(source) && graph.containsKey(destination)) {
            graph.get(source).remove(Integer.valueOf(destination));
            graph.get(destination).remove(Integer.valueOf(source));
        }
    }

    public boolean hasVertex(int vertex) {
        return graph.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return graph.containsKey(source) && graph.get(source).contains(destination);
    }

    @Override
    public String toString() {
        return graph.toString();
    }
}
