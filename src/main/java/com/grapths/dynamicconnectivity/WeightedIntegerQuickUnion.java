package com.grapths.dynamicconnectivity;

import java.util.Objects;

/**
 * Here this algorithm provides a logarithmitic performance.
 * Created by adelin.ghanayem@cayetanogaming.com on 5/3/16.
 */
public class WeightedIntegerQuickUnion extends AbstractIntegerUnionFind {


    private int componentsSize[];


    public WeightedIntegerQuickUnion(int size) {
        super(size);
        componentsSize = new int[size];
        for (int i = 0; i < componentsSize.length; i++) {
            componentsSize[i] = 1;
        }
    }

    @Override
    public void union(Integer first, Integer second) {

        int firstId = find(first);
        int secondId = find(second);

        if (componentsSize[first] < componentsSize[second]) {
            id[first] = secondId;
            componentsSize[second] += componentsSize[first];
        } else {
            id[secondId] = firstId;
            componentsSize[first] += componentsSize[second];
        }
    }

    @Override
    public Integer find(Integer integer) {
        while (integer != id[integer]) integer = id[integer];
        return integer;
    }

    @Override
    public boolean isConnected(Integer first, Integer second) {
        return Objects.equals(find(first), find(second));
    }
}
