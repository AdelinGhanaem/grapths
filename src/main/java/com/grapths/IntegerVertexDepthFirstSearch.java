package com.grapths;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;

/**
 *
 * Created by adelin.ghanayem@cayetanogaming.com on 4/27/16.
 */
public class IntegerVertexDepthFirstSearch implements GraphSearch<Vertex> {


    public Iterable<Vertex> find(Graph<Vertex> graph, Vertex source, Predicate<Vertex> predicate) {

        Stack<Vertex> stack = new Stack<Vertex>();
        stack.add(source);

        List<Vertex> result = new ArrayList<Vertex>(graph.verticesNumber());
        while (!stack.isEmpty()) {
            Vertex current = stack.pop();
            current.mark();
            Iterable<Vertex> adjacentTo = graph.getAdjacent(current);
            adjacentTo.forEach(x -> {
                if (!x.isMarked()) {
                    stack.add(x);
                }
            });

            if (predicate != null && predicate.test(current)) {
                result.add(current);
            }

        }
        return result;
    }
}
