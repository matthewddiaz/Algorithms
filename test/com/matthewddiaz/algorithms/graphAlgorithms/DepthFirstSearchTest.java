package com.matthewddiaz.algorithms.graphAlgorithms;

import com.matthewddiaz.algorithms.graphAlgorithms.graphTraversals.DepthFirstSearch;
import com.matthewddiaz.datastructures.graphs.*;
import org.junit.jupiter.api.Test;

/**
 * Created by matthewdiaz on 7/20/17.
 */
class DepthFirstSearchTest {
    @Test
    void depthFirstSearch() {
        //create directed graph
        Graph directedGraph = GraphFactory.createSimpleDirectedGraph();
        DepthFirstSearch.depthFirstSearch(directedGraph);
    }

}