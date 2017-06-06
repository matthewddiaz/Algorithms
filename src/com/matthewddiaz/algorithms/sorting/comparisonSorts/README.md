# Fundamental Algorithms

## Comparison Sorts
Comparison sorting algorithms all share one property: the sorted
order is determined only by comparison between the input elements.

NOTE: CLRS 3rd edition 8.1 proves that comparison based sorting algorithms 
have a lower bound of **nlg(n)** and thus HeapSort and MergeSort are asymptotically optimal. 

#### 1. [HeapSort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/comparisonSorts/HeapSort.java)
**HeapSort** is an in-place comparison sorting algorithm that
relies on a MaxHeap data structure and its method maxHeapify to sort.

Procedure:
1) Convert the input array into a max heap.
2) For every element (E) in the heap from [(A.length - 1), 1]  
    1) Swap the first element in the heap A[0] with E
    2) Decrement the heapSize by 1
    3) Perform max heap's maxHeapify() on the first element to ensure max heap's property.

**Runtime**: θ(nlg(n))

**Space Complexity:** θ(1)

**Test Class:** [HeapSortTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/sorting/comparisonSorts/HeapSortTest.java)

#### 2. [MergeSort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/comparisonSorts/MergeSort.java)
**MergeSort** is a divide and conqueror comparison sorting algorithm.
MergeSort does not sort in place and requires O(n) space. 

Divide and Conqueror procedure:
1) **Divide** - Divide array A of size n into 2 equal halves of size n/2 A[0, midPoint] 
    and A[midPoint + 1, n].
2) **Conqueror** - Recursively call mergeSort on the 2 subarrays. 
    When the subarrays are small enough sort them using brute force comparison.
3) **Combine** - Merge the 2 sorted subarrays to produce the answer.

**Runtime**: θ(nlg(n))

**Space Complexity:** θ(n)

**Test Class:** [MergeSortTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/sorting/comparisonSorts/MergeSortTest.java)


#### 3. [QuickSort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/comparisonSorts/QuickSort.java)
**QuickSort** is an in-place divide and conqueror comparison sorting algorithm.
Note: The time complexity of this algorithm depends on the pivot
element, thus to ensure a good comparison pivot the index of the pivot 
is randomly selected from the range [start, end]

Divide and Conqueror procedure:
1) **Divide** - Partition array A of size n into two parts around a pivot element
A[start,pivotIndex - 1] and A[pivotIndex + 1, end].
    1) All elements smaller than the pivot element get placed in the left subarray and all elements
    larger than or equal to the pivot element get placed in the right subarray.
        1) **NOTE:** One of the two subarrays may potentially be empty; this will happen when the pivot element 
        is either the largest or smallest element in the range from [start, end]. (This is the worst case scenario)
2) **Conqueror** - Sort the 2 subarrays by recursively calling quicksort on
      A[start, pivotIndex - 1] and A[pivotIndex + 1, end].
3) **Combine** - Nothing; since subarrays are already sorted and pivot was sorted on itself.

**Runtime**: 
1) Worst Case time: θ(n^2)

2) Expected time: θ(nlg(n))

**Space Complexity:** θ(1)

**Test Class:** [QuickSortTest](https://github.com/matthewddiaz/Algorithms/blob/master/test/com/matthewddiaz/algorithms/sorting/comparisonSorts/QuickSortTest.java)



