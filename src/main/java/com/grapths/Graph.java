package com.grapths;

import java.util.Iterator;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/27/16.
 */
public interface Graph<V extends Vertex> {


    int verticesNumber();

    int edgesNumber();

    <E extends Edge<V>> void addEdge(E edge);

     Iterator<V> getAdjacent(V e);

    int degree(V edge);

    int maxDegree();

    int avgDegree();

    int numberOfSelfLoops();

    /**
     * Sets all vertexes to be unmarked
     *
     * @return
     */
    int reset();


}
