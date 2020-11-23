package com.joshuacrotts.dijkstra;

public class DijkstraTester {

  public static void main(String[] args) {
    Dijkstra dijkstra = new Dijkstra();
    
    Vertex v0 = new Vertex(0);
    Vertex v1 = new Vertex(1);
    Vertex v2 = new Vertex(2);
    Vertex v3 = new Vertex(3);
    Vertex v4 = new Vertex(4);
    Vertex v5 = new Vertex(5);
    Vertex v6 = new Vertex(6);
    Vertex v7 = new Vertex(7);
    Vertex v8 = new Vertex(8);
    
    dijkstra.addEdge(v0, v1, 4, true);
    dijkstra.addEdge(v0, v7, 4, true);
    dijkstra.addEdge(v1, v7, 8, true);
    dijkstra.addEdge(v1, v2, 8, true);
    dijkstra.addEdge(v1, v7, 11, true);
    dijkstra.addEdge(v2, v3, 7, true);
    dijkstra.addEdge(v2, v5, 4, true);
    dijkstra.addEdge(v2, v8, 2, true);
    dijkstra.addEdge(v3, v4, 9, true);
    dijkstra.addEdge(v3, v5, 14, true);
    dijkstra.addEdge(v4, v5, 10, true);
    dijkstra.addEdge(v6, v5, 2, true);
    dijkstra.addEdge(v6, v8, 6, true);
    dijkstra.addEdge(v6, v7, 1, true);
    dijkstra.addEdge(v7, v8, 7, true);
    
    dijkstra.printGraph();
    
    dijkstra.removeVertex(v2);
    System.out.println("------------------");
    dijkstra.printGraph();
    
    dijkstra.computeDijkstra(v0);
    for (Vertex v : dijkstra.getDijkstraPath(v4)) {
      System.out.println(v);
    };
  }
}
