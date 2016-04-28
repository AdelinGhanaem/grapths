package com.grapths;

import java.util.Iterator;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/27/16.
 */
public interface Path<V extends Vertex> {


    void build(Graph<Vertex> graph, Vertex source);

    boolean hasPathTo(Vertex vertex);

    Iterator<Vertex> pathTo(Vertex source);

}
