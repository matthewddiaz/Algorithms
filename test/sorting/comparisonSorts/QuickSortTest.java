package sorting.comparisonSorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 2/18/17.
 */
class QuickSortTest {

    private int[] array = {15, 1, 16, 17, 11, 4, 10};

    @Test
    void quickSort() {
        QuickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}