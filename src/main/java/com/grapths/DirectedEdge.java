package com.grapths;

import com.grapths.Edge;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/21/16.
 */
public class DirectedEdge<V> extends Edge<V> {

    public DirectedEdge(V firstVertex, V secondVertex) {
        super(firstVertex, secondVertex);
    }


    public V from() {
        return getFirstVertex();
    }

    public V to() {
        return getSecondVertex();
    }
}
