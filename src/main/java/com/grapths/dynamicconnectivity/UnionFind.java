package com.grapths.dynamicconnectivity;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 5/3/16.
 */
public interface UnionFind<T> {

    /**
     * add connection between first and second
     * @param first
     * @param second
     */
    void union(T first, T second);

    /**
     * component identifier for t ( 0 to N-1 )
     * @param t
     * @return
     */
    T find(T t);

    /**
     * return true if first and second are in the same component
     * @param first
     * @param second
     * @return
     */
    boolean isConnected(T first,T second);

    /**
     * number of components
     * @return
     */
    int count();



}
