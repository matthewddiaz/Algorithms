package com.matthewddiaz.algorithms.graphAlgorithms.graphTraversals;

import com.matthewddiaz.datastructures.graphs.Graph;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * Created by matthewdiaz on 5/17/17.
 */
public class BreadthFirstSearch {

    public static String breadFirstSearch(List<Graph.Vertex>[] adjList, Graph.Vertex source){
        source.setDistance(0);
        source.setVisit_state(1);

        Queue<Graph.Vertex> queue = new ArrayDeque<>();
        queue.add(source);

        StringBuffer graphBFS = new StringBuffer();
        while(!queue.isEmpty()){
            Graph.Vertex currentVertex = queue.remove();
            graphBFS.append(currentVertex.toString() + "\n");
            List<Graph.Vertex> currentVertexAdjVertices = adjList[currentVertex.getId()];
            for(Graph.Vertex adjVertex : currentVertexAdjVertices){
                if(adjVertex.getVisit_state() == 0){
                    adjVertex.setVisit_state(1);
                    adjVertex.setDistance(currentVertex.getDistance() + 1);
                    adjVertex.setParent(currentVertex);
                    queue.add(adjVertex);
                }
                currentVertex.setVisit_state(2);
            }
        }
        return graphBFS.toString();
    }


    public static String shortestDistance(Graph.Vertex source, Graph.Vertex destination){
        if(source.equals(destination)){
            return source.getId() + "";
        }else if(destination.getParent() == null){
            return "NO PATH";
        }else{
            return shortestDistance(source, destination.getParent()) + " " + destination.getId();
        }
    }
}
