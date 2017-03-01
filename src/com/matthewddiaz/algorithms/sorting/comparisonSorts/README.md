#Fundamental Algorithms

## Comparison Sorts

#### 1. [HeapSort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/comparisonSorts/HeapSort.java)
**HeapSort** is an in-place comparison sorting algorithm that
realizes on a MaxHeap and its method maxHeapify to sort.

- **Runtime**: θ(nlg(n))
- **Space Complexity**  θ(1)

#### 2. [MergeSort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/comparisonSorts/MergeSort.java)
**MergeSort** is a divide and conqueror comparison sorting algorithm.
MergeSort does not sort in place and requires O(n) space. 

Divide and Conqueror procedure

1) **Divide** - Divide array A of size n into 2 equal halves of size n/2 A[0, midPoint] 
    and A[midPoint, n].
2) **Conqueror** - Recursively call mergeSort on the 2 subarrays. 
    When subarrays is small enough sort them using brute force comparison.
3) **Combine** - Merge the 2 sorted subarrays to produce the answer.

**Runtime**: θ(nlg(n))
#### 3. [QuickSort](https://github.com/matthewddiaz/Algorithms/blob/master/src/com/matthewddiaz/algorithms/sorting/comparisonSorts/QuickSort.java)
**QuickSort** is an in-place divide and conqueror comparison sorting algorithm.
Note: the the time complexity of this algorithm depends on the pivot
element, thus to ensure a good comparison pivot the index of the pivot 
is randomly selected from the range [start, end]

1) **Divide** - Partition array A of size n into two parts around a pivot element
A[start,pivotIndex - 1] and A[pivotIndex + 1, end].
    1) **NOTE:** Either of the subarrays could be empty
    2) All elements in left subarray are smaller than pivot and all elements
    in the right subarray are larger than or equal to the pivot element
2) **Conqueror** - Sort the 2 subarrays by recursively calling quicksort on
      A[start,pivotIndex - 1] and A[pivotIndex + 1, end].
3) **Combine** - Nothing; since subarrays are already sorted and pivot was sorted on itself.

**Runtime**: 
1) Worst Case time: θ(n^2)
2) Expected time: θ(nlg(n))

