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

### Dynamic Programming Paradigm vs Divide And Conqueror Paradigm

**Dynamic Programming (DP)** and **Divide and Conqueror (DC)** both solve problems by combining the solutions to sub-problems.

The difference is that **DC** partitions the problem into **disjoint** sub-problems.   

Dynamic Programming applies to problems where sub-problems are not **disjoint**, that is they overlap. Sub-problems
in this case share sub-sub-problems. Using **DC** on these problems will cause more work to be done; by repeatedly 
solving the same sub-sub-problem.






