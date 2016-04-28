package com.grapths;


import java.util.function.Predicate;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/27/16.
 */
public interface GraphSearch<V extends Vertex> {

    /**
     * Given a graph finds all vertexes that fulfills the provided condition.
     * and returns and iterable of these vertexes.
     *
     * @param graph
     * @param source
     * @param predicate
     * @return
     */
    Iterable<V> find(Graph<V> graph, V source, Predicate<V> predicate);
}
