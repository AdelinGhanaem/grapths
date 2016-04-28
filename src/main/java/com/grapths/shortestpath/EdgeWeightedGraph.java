package com.grapths.shortestpath;

import com.grapths.DirectedEdge;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/21/16.
 */
public interface EdgeWeightedGraph<V> {


    /**
     * Adds an edge to
     * @param edge
     */
    void addEdge(DirectedEdge<V> edge);

    /**
     * Returns all edges that are pointed from the provided edge
     * @param edge
     * @return
     */
    Iterable<DirectedEdge<V>> pointedFrom(DirectedEdge<V> edge);


    int edgesNumber();

    int verticesNumber();





}
