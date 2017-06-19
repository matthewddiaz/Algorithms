# Fundamental Algorithms

## Dynamic Programming

### Terminology

**Dynamic Programming (DP)** - usually applies to **optimization** problems in which a set of choices are taken to 
arrive to an **optimal solution**. 

**Note** - DP problems may have multiple optimal solutions.

**optimal solution** - each solution has a value, the one that produces the (min or max) value is the optimal solution.

**Note:** as these choices are made sub-problems of the same form often arise. Dynamic programming solves each sub-problem
once and stores the value in a table. When that same sub-problem reappears it's value is referenced from the table thus
avoiding the need to recompute that sub-problem.

Storing solutions and then looking them up when they reappear can reduce the time complexity of an algorithm from exponential
to polynomial time.

**Note** dynamic programming is an example of **time-memory trade-off** in that it uses additional memory to save computation
time. 

### Dynamic Programming Paradigm vs Divide And Conqueror Paradigm

**Dynamic Programming (DP)** and **Divide and Conqueror (DC)** both solve problems by combining the solutions to sub-problems.

The difference is that **DC** partitions the problem into **disjoint** sub-problems.   

Dynamic Programming applies to problems where sub-problems are not **disjoint**, that is they overlap. Sub-problems
in this case share sub-sub-problems. Using **DC** on these problems will cause more work to be done; by repeatedly 
solving the same sub-sub-problem.

### Sequence for developing DP algorithms

1) Characterize the structure of an optimal solution
2) Recursively define the value of an optimal solution
3) Compute the value of an optimal solution
4) Construct an optimal solution from computed info

**Note** steps 1-3 will produce the value of an optimal solution. Step 4 is only necessary if the actual solution, steps
taken to reach optimal value, is required. This may require additional storage info in step 3.

### Two Approaches to implement a Dynamic Programming approach

1) **Top-Down with Memoization** - write the procedure recursively in a natural manner, & save the result of each 
sub-problem (in an array or hash table). The procedure first checks if the sub-problem has previously been solved, if so 
it returns the saved value; else it computes it and stores it. 

Th recursive procedure has been "memoized" - it remembers previously computed results.

2) **Bottom-Up Method** - typically depends on the natural notion of "size" of the sub-problem, such that solving any 
sub-problem depends only on solving smaller sized sub-problems. Therefore we sort the subproblems by size and solve them 
in order from smallest to the size of the original problem.  








