package com.joshuacrotts.dijkstra;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author joshuacrotts
 */
public class Vertex implements Comparable<Vertex> {

  /** Adjacency list of edges that connect to this vertex.*/
  protected List<Edge> adjacencyList;
  
  /** Vertex used in dijkstra algorithm to find the linking one.*/
  protected Vertex previousVertex;
  
  /** Distance from the source vertex that this vertex is. */
  protected double distanceFromSource = Double.MAX_VALUE;
  
  /** Identifier of this vertex. */
  private int id;
  
  /** X-coordinate of this vertex in the cartesian system. */
  private int x;
  
  /** Y-coordinate of this vertex in the cartesian system. */
  private int y;

  public Vertex(int id, int x, int y) {
    this.id = id;
    this.x = x;
    this.y = y;
    this.previousVertex = null;
    this.adjacencyList = new LinkedList<>();
  }
  
  public Vertex(int id) {
    this(id, 0, 0);
  }

  @Override
  public int compareTo(Vertex v) {
    return Double.compare(v.distanceFromSource, this.distanceFromSource);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }

    if (this == o) {
      return true;
    }

    Vertex otherVertex = (Vertex) o;
    return this.id == otherVertex.id;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + Objects.hashCode(this.id);
    hash = 59 * hash + this.x;
    hash = 59 * hash + this.y;
    return hash;
  }

  @Override
  public String toString() {
    return "ID=" + this.id + ": (x=" + this.x + ", y=" + this.y + ")";
  }
  
  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getID() {
    return this.id;
  }
  
  public List<Edge> getAdjacencyList() {
    return this.adjacencyList;
  }
}
