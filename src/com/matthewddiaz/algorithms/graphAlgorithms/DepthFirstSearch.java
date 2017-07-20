package com.matthewddiaz.algorithms.graphAlgorithms;

import com.matthewddiaz.datastructures.graphs.Graph;

import java.util.List;

/**
 * Created by matthewdiaz on 5/18/17.
 */
public class DepthFirstSearch {
    static int timeStamp;

    public static void depthFirstSearch(Graph graph){
        timeStamp = 0;
        List<Graph.Vertex>[] adjacencyList = graph.createAdjacencyList();
        //visit every undiscovered vertex in G.vertexSet
        for(Graph.Vertex vertex : graph.getVertexSet()){
            if(vertex.getVisit_state() == 0){
                dfsVisit(adjacencyList, vertex);
            }
        }
    }

    private static void dfsVisit(List<Graph.Vertex>[] adjList, Graph.Vertex currentVertex){
        //current vertex is discovered
        timeStamp = timeStamp + 1;

        System.out.print("(" + currentVertex.getId() + " ");
        currentVertex.setDiscoveredTimeStamp(timeStamp);
        currentVertex.setVisit_state(1);

        //visit every vertex adjacent to currentVertex that has not been discovered yet
        for(Graph.Vertex adjacentVertex : adjList[currentVertex.getId()]){
            if(adjacentVertex.getVisit_state() == 0){
                adjacentVertex.setParent(currentVertex);
                dfsVisit(adjList, adjacentVertex);
            }
        }
        //finished with current vertex
        currentVertex.setVisit_state(2);
        timeStamp = timeStamp + 1;
        currentVertex.setFinishedTimeStamp(timeStamp);
        System.out.print(" " + currentVertex.getId() + ")");
    }
}
