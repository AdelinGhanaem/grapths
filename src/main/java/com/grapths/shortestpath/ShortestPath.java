package com.grapths.shortestpath;

import com.grapths.DirectedEdge;

/**
 * Given a a graph and a vertex this object represents a shortest path to some other graph
 * and its destination.
 * Created by adelin.ghanayem@cayetanogaming.com on 4/21/16.
 */
public interface ShortestPath <V> {

    double distTo(V vertex);

    Iterable<DirectedEdge<V>> pathTo(V vertex);
}
