package com.matthewddiaz.algorithms.graphAlgorithms;

import com.matthewddiaz.datastructures.graphs.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/20/17.
 */
class BreadthFirstSearchTest {
    @Test
    void breadFirstSearch() {
        Graph undirectedGraph = GraphFactory.createSimpleUnDirectedGraph();
        List<Graph.Vertex>[] adjacencyList = undirectedGraph.createAdjacencyList();
        Graph.Vertex source = undirectedGraph.getVertex(0);
        String graphBFSString = BreadthFirstSearch.breadFirstSearch(adjacencyList, source);
        System.out.println(graphBFSString);
    }


    @Test
    void shortestDistance() {
        Graph undirectedGraph = GraphFactory.createSimpleUnDirectedGraph();
        List<Graph.Vertex>[] adjacencyList = undirectedGraph.createAdjacencyList();
        Graph.Vertex source = undirectedGraph.getVertex(0);
        BreadthFirstSearch.breadFirstSearch(adjacencyList, source);

        for(Graph.Vertex vertex : undirectedGraph.getVertexSet()){
            System.out.println("Vertex " + vertex.getId() + ": shortest path from source " + source.getId() + " is:" +
                    BreadthFirstSearch.shortestDistance(source,vertex));
        }
    }

}