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

## Elements of Dynamic Programming

### Two Components that an Optimization problem must have in order for DP to apply.

#### 1) Optimal Substructure
A problem contains **optimal substructure** if an optimal solution to the problem is produced from optimal solutions 
to sub-problems.

Common pattern in discovering optimal substructure:
1) Solution consists of making a choice.
2) You assume that for the given problem you are given a choice that leads to an optimal solution.
3) Given this choice you determine which sub-problems lead to the optimal solution and also characterize the resulting 
space of the sub-problems. 
4) Prove that solutions of sub-problems used within an optimal solution to the problem must themselves be optimal

**Note:** Problems must have independent sub-problems for DP to work. Two sub-problems are independent if the solution to one 
sub-problem does not effect the solution of another sub-problem of the same problem.  

#### 2) Overlapping Sub-problems

An optimization problem contains **overlapping sub-problems** when a recursive algorithm revisits the same problem 
repeatedly while solving the problem. 

This hopefully means that the total number of unique sub-problems is small, polynomial with respect to the size
of the problem.
 
**Note:** DP works well on problems that contain sub-problems that are **overlapping** and are **independent**. 

## Classic Dynamic Programming Problems

### 1. Longest Common Subsequence

**Problem:** Given two Strings **str1** and **str2** return the length of the longest Common Subsequence (LCS).

**Bottom-Up Solution:** [Longest Common Subsequence Bottom-Up](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/dynamicProgramming/LongestCommonSubsequenceBottomUp.java) 

**Bottom-Up Test Class:** [Longest Common Subsequence Bottom-Up Test](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/dynamicProgramming/LongestCommonSubsequenceBottomUpTest.java)


**Top-Down Solution:** [Longest Common Subsequence Top-Down](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/dynamicProgramming/LongestCommonSubsequenceTopDown.java) 

**Top-Down Test Class:** [Longest Common Subsequence Top-Down Test](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/dynamicProgramming/LongestCommonSubsequenceTopDownTest.java)



### 2. [Matrix Chain Order](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/dynamicProgramming/MatrixChainOrder.java)

**Problem:** Given an array of matrices determine the min number of matrix multiplications required to multiply
all of the matrices. Give the order matrices that would produce an optimal solution.

**Test class:** [Matrix Chain Order Test](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/dynamicProgramming/MatrixChainOrderTest.java)



### 3. Rod Cutting Problem 

**Problem:** Given a rod of length **N** and an **array** of prices for the price of the cut at an index from 0 to N,
return the max profit for the rod. 

**Bottom-Up Solution:** [Rod Cutting Bottom-Up](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/dynamicProgramming/RodCuttingProblemBottomUp.java) 

**Bottom-Up Test Class:** [Rod Cutting Bottom-Up Test](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/dynamicProgramming/RodCuttingProblemBottomUpTest.java)


**Top-Down Solution:** [Rod Cutting Top-Down](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/dynamicProgramming/RodCuttingProblemTopDown.java) 

**Top-Down Test Class:** [Rod Cutting Top-Down Test](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/dynamicProgramming/RodCuttingProblemTopDownTest.java)

