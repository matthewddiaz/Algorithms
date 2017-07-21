# Fundamental Algorithms

## Graph Traversals

### 1) Breadth First Search

**Breadth First Search** traverses all vertices in a graph; first visiting those closest to source vertex **S**.
BFS - discovers all vertices at distance k from s before discovering any vertices at distance k+1.
 
**Note:** Level Order traversal in Binary Tree traversals is also a breadth first algorithm. 

Breadth First Search algorithms are usually implemented using a **Queue (FIFO)**.
   
**Note** BSF is important because Prim's MST algorithm and dijkstra's single-source shortest path
use similar ideas to those in BSF.

**Inputs:** 
1) **Graph G(V,E)** and 
2) source vertex **s**. 

Breadth first search explores edges of G to "discover" every vertex that is reachable from **s**. 
In doing so BFS creates a **"breadth-first tree"** which contains **s** as the root and all vertices reachable 
from **s**. The breadth-first tree is constructed using the predecessor attribute; every time a vertex **v** is 
discovered the vertex **u** which just discovered **v** becomes its predecessor. 

**Note** Breadth-first search does not always traversal all of the vertices in a graph given **s**, an example is a 
case where the graph is composed of several disjoint trees.

A breadth-first tree is important because it correct computes **shortest path distances** from source vertex **s** 
to any reachable vertex **v**. 
     
**shortest path** - is the path that contains the least number of edges to travel from **s** to **v**. The shortest 
path distance is the number of edges in the shortest path.
         
#### Breadth First Search Implementation          
          
##### [Breadth First Search](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/graphAlgorithms/graphTraversals/BreadthFirstSearch.java)
          
**public String breadthFirstSearch(List<Vertex>[] adjList, Vertex source)** 
1) Mark source **s** vertex as discovered and set its distance from itself to 0
2) Create a queue to maintain discovered (but not finished) vertices; insert **s**
3) While queue is not empty
   1) Remove front vertex **v** and obtain its list of adjacent vertices
   2) Iterate through each adjacent vertex **a**
        1) if vertex **a** is not discovered; mark **a** as discovered. Set its parent to vertex **v** and its 
           distance from source vertex **s** as one greater than **v**'s distance from source. Insert **a** to queue.
        2) if vertex **a** is discovered; advance to **v**'s  next adjacent vertex.    
           
**Test class:** [BreadthFirstSearchTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/graphAlgorithms/BreadthFirstSearchTest.java)           


### 2) Depth First Search
