package com.grapths.dynamicconnectivity;

import java.util.Objects;

/**
 * This implementation is O(1) for find() but O(N) for connect() operation.
 * <p>
 * Created by adelin.ghanayem@cayetanogaming.com on 5/3/16.
 */
public class IntegerQuickFind implements UnionFind<Integer> {


    private int[] id;
    private int count;

    public IntegerQuickFind(int size) {
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
        count = size;
    }

    @Override
    public void union(Integer first, Integer second) {

        int fistId = id[first];
        int secondId = id[second];


        if (fistId != secondId) {

            for (int i = 0; i < id.length; i++) {
                if (id[i] == fistId) {
                    id[i] = secondId;
                }
            }
            count--;
        }


    }

    @Override
    public Integer find(Integer integer) {
        return id[integer];
    }

    @Override
    public boolean isConnected(Integer first, Integer second) {
        return Objects.equals(find(first), find(second));
    }

    @Override
    public int count() {
        return count;
    }
}
