# Fundamental Algorithms

## Non-Comparison Sorts
Non-comparison sorting algorithms: use other operations other than comparison to 
determine sorting order. The algorithms in this section sort in linear time; θ(n).


#### 1. [Counting Sort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/Counting.java)
**Counting Sorting** is a non-comparison sorting algorithm that relies on knowledge of the
input data set value ranges. It assumes that the input data set ranges from 0 to k. Counting Sort
then uses two additional arrays; an auxiliary (copy array) and an elementIndexArray that calculates
the correct position for every element in the original array. **NOTE:** counting
sort does not sort in place; since it requires these 2 additional arrays.
 
 **Runtime**: θ(n), when k = O(n)
 
 **Space Complexity:** θ(n)
 
 **Test Class:** [CountingSortTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/CountingSortTest.java)

 
#### 1. [Radix Sort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/Counting.java)

#### 1. [Bucket Sort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/Counting.java)