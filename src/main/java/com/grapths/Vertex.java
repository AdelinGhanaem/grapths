package com.grapths;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/27/16.
 */
public interface Vertex<V> {


    void mark();

    void unmark();

    boolean isMarked();

    V value();


}
