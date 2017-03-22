# Fundamental Algorithms

## Non-Comparison Sorts
Non-comparison sorting algorithms: use other operations other than comparison to 
determine sorting order. The algorithms in this section sort in linear time; θ(n).


#### 1. [Counting Sort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/CountingSort.java)
**Counting Sorting** is a non-comparison sorting algorithm that relies on knowledge of the
input data set value ranges. It assumes that the input data set ranges from 0 to k. Counting Sort
then uses two additional arrays; an auxiliary (copy array) and an elementIndexArray that calculates
the correct position for every element in the original array. This algorithm performs best when input data
value range is positive and small and the input data also contains lots of repeating data. 
 
 **NOTE:** counting
sort does not sort in place; since it requires these 2 additional arrays.
 
 **Runtime**: θ(n), when k = O(n)
 
 **Space Complexity:** θ(n)
 
 **Test Class:** [CountingSortTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/CountingSortTest.java)

 
#### 2. [Radix Sort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/RadixSort.java)
**Radix Sort** is a non-comparison sorting algorithm that sorts d-digit input data sets. 
 Radix sort assumes that all the numbers in the data set are positive and that each digit of the 
 input data set ranges from [0, 9]. Radix Sort sorts the input data from the least significant digit column to the 
 most significant digit column. Column ranges from [1, d]. 
 
 Radix Sort uses [Digit Counting Sort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/DigitCountingSort.java) 
 to sort the input data set on each column. Digit Counting Sort algorithm is a slight modification from Counting Sort in that the element that is stored
 in elementIndexArray is not the actual number but the current digit of the number.

 **Runtime**: θ(n), when k = O(n) and d is constant
 
 **Space Complexity:** θ(n)
 
 **Test Class:** [RadixSortTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/RadixSortTest.java)

#### 3. [Bucket Sort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/BucketSort.java)
**Bucket Sort** is a non-comparison sorting algorithm that sorts input data sets whose values ranges from [0,1]. Bucket Sort makes the assumption that the 
input data is randomly selected from a process that uniformly and independently distributes the input data. For an n input data set Bucket Sort creates n buckets
 each of size (1/n). Therefore the buckets ranges from [0, n-1]. Since bucket sort makes the assumption on the input data; the each individual bucket should contain 
 very little elements; because elements should be equally distributed between the buckets. The algorithm then sorts each bucket individually and the sorted input data 
 set is the result of traversing the buckets in order from 0 to n - 1.
 **NOTE:** Bucket Sort relies on an array of linkedList of size n-1 to maintain all of the buckets! 
 
**Average case runtime:**: O(n)
 
 **Space Complexity:** θ(n)
 
 **Test Class:** [BucketSortTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/sorting/nonComparisonSorts/BucketSortTest.java)