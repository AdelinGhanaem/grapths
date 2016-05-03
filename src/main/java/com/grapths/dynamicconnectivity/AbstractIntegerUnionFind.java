package com.grapths.dynamicconnectivity;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 5/3/16.
 */
public abstract class AbstractIntegerUnionFind implements UnionFind<Integer>{

    protected int[] id;
    protected int count;

    public AbstractIntegerUnionFind(int size) {

        id = new int[size];

        for (int i = 0; i < size; i++) {
            id[i] = i;
        }

        count = size;
    }
    @Override
    public abstract void union(Integer first, Integer second);

    @Override
    public abstract Integer find(Integer integer);

    @Override
    public abstract boolean isConnected(Integer first, Integer second);

    @Override
    public int count() {
        return 0;
    }
}
