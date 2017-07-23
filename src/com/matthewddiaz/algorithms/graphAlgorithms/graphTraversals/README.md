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

Note: The breadth-first tree is also called the **predecessor sub-graph** of G.

**sub-graph** - Graph G'(V,E) is a subgraph of graph G(V,E) if G' vertex set is a sub-set of G vertex set and
G' edge set is a sub-set of G edge set.

**Note** Breadth-first search does not always traversal all of the vertices in a graph given **s**, an example is a 
case where the graph is composed of several disjoint trees.

A breadth-first tree is important because it correct computes **shortest path distances** from source vertex **s** 
to any reachable vertex **v**. 
     
**shortest path** - is the path that contains the least number of edges to travel from **s** to **v**. The shortest 
path distance is the number of edges in the shortest path.
         
#### Breadth First Search Implementation: [Breadth First Search](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/graphAlgorithms/graphTraversals/BreadthFirstSearch.java)
          
**public String breadthFirstSearch(List<Vertex>[] adjList, Vertex source)** 
1) Mark source **s** vertex as discovered and set its distance from itself to 0
2) Create a queue to maintain discovered (but not finished) vertices; insert **s**
3) While queue is not empty
   1) Remove front vertex **v** and obtain its list of adjacent vertices
   2) Iterate through each adjacent vertex **a**
        1) if vertex **a** is not discovered; mark **a** as discovered. Set its parent to vertex **v** and its 
           distance from source vertex **s** as one greater than **v**'s distance from source. Insert **a** to queue.
        2) if vertex **a** is discovered; advance to **v**'s  next adjacent vertex.    
   3) Set **v**'s state to finished after all of its adjacent vertices have been discovered.        
**Test class:** [BreadthFirstSearchTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/graphAlgorithms/BreadthFirstSearchTest.java)           


### 2) Depth First Search

**Depth First Search** as the name implies the algorithm searches "deeper" in the graph whenever possible. 
The alg explores edges out of the most recently discovered vertex **v** that still has unexplored edges leaving it. Once
all of v's edges have been explored, the search "backtracks" ti explore edges leaving the vertex from which v was
discovered.

**Note** that in DFS the algorithm stops when all vertices in graph **G** has been discovered.
 
**Note:** Pre-Order, Post-Order, and In-Order traversal in Binary Tree traversals are all breadth first algorithm. 
 
Breadth First Search algorithms are usually implemented recursively.

**Note** the predecessor subgraph that forms during depth first search differs from the subgraph that is formed 
from BFS in that it forms a **depth-first forest**, comprising several depth-first trees.

#### Properties of depth-first search

1) DFS forms a forest of trees for the predecessor subgraph.

2) Parenthesis structure - if one adds a opening brace **(** at the time that vertex **u** is discovered and a closing
brace **)** at the time that vertex **u** is finished; then the history of discoveries and finishes make a well-formed 
expression in the sense that the parenthesis are properly nested.

#### Depth First Search Implementation: [Depth First Search](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/graphAlgorithms/graphTraversals/DepthFirstSearch.java)


**public void depthFirstSearch(Graph<V,E> graph)** -
1) Obtain adjacency list  **adjList** of input graph.
2) For each vertex in graph g that has not been discovered yet call helper method **DFSVisit(adjList, currentVertex)**
3) In helper method DFSVisit perform the following
    1) Mark currentVertex **c** as discovered
    2) Iterate through its adjacent vertices;
        1) if adjacent vertex **a** has not been discovered
            1) set it's parent to **c** and
            2) and call DFSVisit on vertex **a**
    3)  Once all of **c** adjacent vertices have been discovered; mark **c** as finished       

**test class:** [DepthFirstSearchTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/graphAlgorithms/DepthFirstSearchTest.java)

### BFS vs DFS

The in the text BFS is shown as being limited to only 1 source whereas DFS may search from multiple sources. Conceptually
BFS could proceed from multiple sources and DFS could be limited to 1 source. The text shows us this way to reflect how 
these searches are typically used.

BFS usually serves to find shortest path distance from a given source.

DFS is often a subroutine in another algorithm.
 
 
 




