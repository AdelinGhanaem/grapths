package com.grapths;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/28/16.
 */
public class DepthFirstPaths implements Path<Vertex> {

    private Map<Vertex, Vertex> path;
    private Vertex source;



    @Override
    public void build(Graph<Vertex> graph, Vertex source) {


        path = new HashMap<>(graph.verticesNumber());
        this.source = source;
        graph.reset();

        Stack<Vertex> stack = new Stack<>();
        stack.add(source);


        while (!stack.isEmpty()) {
            Vertex current = stack.pop();
            current.mark();
            graph.getAdjacent(current).forEachRemaining(x -> {
                if (!current.isMarked()) {
                    path.put(x, current);
                    stack.add(x);
                }
            });
        }
    }

    @Override
    public boolean hasPathTo(Vertex vertex) {

        Vertex current = path.get(vertex);
        if (current == null)
            return false;

        Stack<Vertex> vertexes = new Stack<>();
        vertexes.add(current);

        while (current != source) {
            current = path.get(current);
            if (current == null) {
                return false;
            }
        }


        return false;
    }

    @Override
    public Iterator<Vertex> pathTo(Vertex destination) {


        Vertex current = path.get(destination);

        if (current == null)
            return new Stack<Vertex>().iterator();


        Stack<Vertex> vertexes = new Stack<>();
        vertexes.add(current);

        while (current != source) {
            current = path.get(current);
            vertexes.add(current);
            if (current == null) {
                return new Stack<Vertex>().iterator();
            }
        }
        return vertexes.iterator();
    }
}
