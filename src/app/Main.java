package app;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();

        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);

        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Graph after adding vertices and edges:");
        System.out.println(g);

        System.out.println("Has vertex 1: " + g.hasVertex(1));
        System.out.println("Has vertex 4: " + g.hasVertex(4));
        System.out.println("Has edge between 1 and 2: " + g.hasEdge(1, 2));
        System.out.println("Has edge between 1 and 3: " + g.hasEdge(1, 3));

        g.removeEdge(1, 2);
        System.out.println("Graph after removing edge between 1 and 2:");
        System.out.println(g);

        g.removeVertex(2);
        System.out.println("Graph after removing vertex 2:");
        System.out.println(g);
    }
}
