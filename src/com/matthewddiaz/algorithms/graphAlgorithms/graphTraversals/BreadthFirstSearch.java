package com.matthewddiaz.algorithms.graphAlgorithms.graphTraversals;

import com.matthewddiaz.datastructures.graphs.Graph;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * Created by matthewdiaz on 5/17/17.
 */
public class BreadthFirstSearch {

    /**
     * NOTE: the breadth-first tree is constructed as a byproduct (BF tree helps in searching for shortest paths)
     * @param adjList graph representation; adjacency list
     * @param source source vertex; starting point
     * @return a String of the vertices visited in the order that they are discovered by the breadth first search
     */
    public static String breadFirstSearch(List<Graph.Vertex>[] adjList, Graph.Vertex source){
        //set source vertex as visited and its distance from itself is 0.
        source.setDistance(0);
        source.setVisit_state(1);

        Queue<Graph.Vertex> queue = new ArrayDeque<>();
        //inserting source into queue
        queue.add(source);

        StringBuffer graphBFS = new StringBuffer();
        //algorithm ends when all vertices in the graph have been visited
        while(!queue.isEmpty()){
            //removing the discovered vertex from queue
            Graph.Vertex currentVertex = queue.remove();
            graphBFS.append(currentVertex.toString() + "\n");

            //obtain the list of the current vertex adjacent vertices
            List<Graph.Vertex> currentVertexAdjVertices = adjList[currentVertex.getId()];

            for(Graph.Vertex adjVertex : currentVertexAdjVertices){
                //if adjacent vertex has not been discovered
                if(adjVertex.getVisit_state() == 0){
                    //mark adjacent vertex as discovered
                    adjVertex.setVisit_state(1);

                    //set its distance from source vertex as one more than currentVertex
                    adjVertex.setDistance(currentVertex.getDistance() + 1);

                    //set currentVertex as the parent of the adjacent vertex
                    adjVertex.setParent(currentVertex);

                    //add the discovered vertex to the queue
                    queue.add(adjVertex);
                }
                //current vertex is finished; all of its adjacent vertices have been visited.
                currentVertex.setVisit_state(2);
            }
        }
        return graphBFS.toString();
    }

    /**
     * NOTE: This only works if the Breadth First Tree has been previous created;
     * that is the breadth first search algorithm has been performed on the graph.
     * @param source starting vertex
     * @param destination end vertex
     * @return shortest distance from source vertex to destination vertex. If no path exist
     * the algorithm returns "No Path"
     */
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
