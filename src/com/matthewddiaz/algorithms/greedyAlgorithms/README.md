# Fundamental Algorithms

## Greedy Algorithms

### Definitions

Optimization algorithms go through a sequence of steps with a set of choices at each step. For most problems using Dynamic 
Programming is an overkill. There are many cases were choosing the optimal local choice leads to the optimal global solution.
  
A **greedy algorithm** always chooses the best possible choice at that moment.
    
**NOTE:** Greedy algorithms do not always yield the optimal solution. 
     
Greedy algorithms work for a variety of problems that range from Minimum Spanning Tree to Shortest Path algorithm.

### Elements of the greedy strategy

Steps of designing a greedy algorithm

1) Cast the optimization problem as one in which making a choice leads to only one possible sub-problem.

2) Prove that there always is a optimal solution takes the greedy option, therefore making the greedy choice always safe.

3) Demonstrate optimal substructure; that is choosing the greedy choice produces an optimal solution to sub-problems. 

### Greedy Choice Property 
 
**Greedy Choice Property:** when one can assemble a globally optimal solution by making locally optimal (greedy) choices.
That is one takes the result that looks best for the current problem; without check results of previous sub-problems.

Note: In contrast Dynamic Programming differs that the choice that taken at each step depends on the solutions to
sub-problems. That is dynamic programming first solves the sub-problems of for step and then makes a choice; greedy 
algorithms first make a choice and then solves the sub-problems.

### Optimal Substructure

A problem exhibits **Optimal Substructure:** if the optimal solution to the problem contains optimal solutions to subproblems.  
In a greedy algorithm optimal substructure exists if the greedy choice plus an optimal solution to the sub-problem always produces an 
optimal solution.

### Greedy Algorithm Case Studies

#### Case Study 1: [Activity-Selection problem](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/greedyAlgorithms/ActivitySelection.java)
 
**Problem:** Given a set of Activities from {A1..An} determine the max size set of mutually compatible activities.
Each set has two attributes startTime (s) and endTime (f). **Note:** Two activities (x and y) are compatible if
x.s > y.f or x.f < y.s
     
The given input is a set of activities {A1..An} sorted in non-decreasing order with respect to the attribute endTime.
     
In this problem intuition tells us that choosing the greedy choice; that is the activity that has the earliest
endTime, will lead us to the optimal solution. This is because choosing the activity that ends the earliest will create
a larger remaining time frame for more activities to be compatible.

**Test Class:** [ActivitySelectionTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/greedyAlgorithms/ActivitySelectionTest.java)



#### Case Study 2: [Fractional Knapsack Problem](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/greedyAlgorithms/FractionalKnapsackProblem.java)

**Problem:** Given n items determine the items that would generate the most profit given a max Weight. Each item has a
value and a weight. In this particular case of the Knapsack problem one may take fractions of an item. The smallest faction
one may take is 1 unit which is (Value/Weight).

**Test Class:** [FractionalKnapsackProblemTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/greedyAlgorithms/FractionalKnapsackProblemTest.java)

