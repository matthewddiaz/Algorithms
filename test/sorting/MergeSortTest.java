package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 2/15/17.
 */
class MergeSortTest {
    private MergeSort mergeSort;
    private int[] array = {15, 1, 16, 17, 11, 4, 20};


    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    void testMergeSort() {
        mergeSort.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}