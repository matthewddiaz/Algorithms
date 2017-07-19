# Fundamental Algorithms

## Greedy Algorithms

### Definitions

Optimization algorithms go through a sequence of steps with a set of choices at each step. For most problems using Dynamic 
Programming is an overkill. There are many cases were choosing the optimal local choice leads to the optimal global solution.
  
A **greedy algorithm** always chooses the best possible choice at that moment.
    
**NOTE:** Greedy algorithms do not always yield the optimal solution. 
     
Greedy algorithms work for a variety of problems that range from Minimum Spanning Tree to Shortest Path algorithm.
 
### Study Case 1: [Activity-Selection problem](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/greedyAlgorithms/ActivitySelection.java)
 
**Problem:** Given a set of Activities from {A1..An} determine the max size set of mutually compatible activities.
Each set has two attributes startTime (s) and endTime (f). **Note:** Two activities (x and y) are compatible if
x.s > y.f or x.f < y.s
     
The given input is a set of activities {A1..An} sorted in non-decreasing order with respect to the attribute endTime.
     
In this problem intuition tells us that choosing the greedy choice; that is the activity that has the earliest
endTime, will lead us to the optimal solution. This is because choosing the activity that ends the earliest will create
a larger remaining time frame for more activities to be compatible.

**Test Class:** [ActivitySelectionTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/greedyAlgorithms/ActivitySelectionTest.java)
