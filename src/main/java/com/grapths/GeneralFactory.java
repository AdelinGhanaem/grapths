package com.grapths;

import com.grapths.dynamicconnectivity.IntegerQuickFind;
import com.grapths.dynamicconnectivity.UnionFind;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 5/3/16.
 */
public class GeneralFactory {


    static UnionFind<Integer> unionFind(String fileName) {


        File file = new File(fileName);

        try {
            FileInputStream stream = new FileInputStream(file);

            Scanner scanner = new Scanner(stream);

            int size = scanner.nextInt();
            UnionFind<Integer> unionFind = new IntegerQuickFind(size);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] strings = line.split(" ");

                int first = Integer.valueOf(strings[0]);
                int second = Integer.valueOf(strings[1]);
                if (unionFind.isConnected(first, second)) {
                    unionFind.union(first, second);
                }
            }
            return unionFind;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }
}
