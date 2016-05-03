package com.grapths.dynamicconnectivity;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 5/3/16.
 */
public class QuickUnionInteger extends AbstractIntegerUnionFind {

    public QuickUnionInteger(int size) {
        super(size);
    }

    @Override
    public void union(Integer first, Integer second) {

        int firstId = id[first];
        int secondId = id[second];
        if (firstId != secondId) {
            id[firstId] = secondId;
        }
        count--;

    }

    @Override
    public Integer find(Integer integer) {


        while (integer != id[integer]) {
            integer = id[integer];
        }
        return integer;
    }

    @Override
    public boolean isConnected(Integer first, Integer second) {
        return false;
    }
}
