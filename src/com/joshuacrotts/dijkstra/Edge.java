package com.joshuacrotts.dijkstra;

/**
 *
 * @author joshuacrotts
 */
public class Edge {

  /** Source vertex used in the edge. */
  private Vertex source;
  
  /** Destination vertex used in the edge. */
  private Vertex destination;
  
  /** Distance that this edge uses. */
  private double distance;

  protected Edge(Vertex src, Vertex dest) {
    this.source = src;
    this.destination = dest;
    this.distance = Edge.computeCartesianDistance(src, dest);
    src.adjacencyList.add(this);
  }
  
  protected Edge(Vertex src, Vertex dest, double distance) {
    this.source = src; 
    this.destination = dest;
    this.distance = distance;
    src.adjacencyList.add(this);
  }

  /**
   * Computes the cartesian distance from vertex src to vertex dest. 
   * This is generally used for testing purposes.
   * 
   * @param src source vertex.
   * @param dest destination vertex.
   * 
   * @return cartesian distance.
   */
  private static double computeCartesianDistance(Vertex src, Vertex dest) {
    return Math.sqrt((src.getX() - dest.getX()) * (src.getX() - dest.getX()) 
                   + (src.getY() - dest.getY()) * (src.getY() - dest.getY()));
  }
  
  public Vertex getSource() {
    return this.source;
  }
  
  public Vertex getDestination() {
    return this.destination;
  }
  
  public double getDistance() {
    return this.distance;
  }

  @Override
  public String toString() {
    return "Destination: " + destination + ", distance: " + distance;
  }
}
