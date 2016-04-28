package com.grapths;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/27/16.
 */
public class Edge<V> {

    private V firstVertex;
    private V secondVertex;

    public Edge(V firstVertex, V secondVertex) {
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
    }

    public V getFirstVertex() {
        return firstVertex;
    }

    public V getSecondVertex() {
        return secondVertex;
    }
}
