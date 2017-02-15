import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 2/14/17.
 */
class BinarySearchTest {
    private int[] arr1 = {10, 14, 15, 16};
    private int[] arr2 = {-1, 0, 1, 19, 20, 100, 150};

    @org.junit.jupiter.api.Test
    void testArrayOfEvenLength() {
        int expectedAnswer = 3;
        int actualAnswer = BinarySearch.binarySearch(arr1,16);
        assertEquals(expectedAnswer, actualAnswer);
    }

    @org.junit.jupiter.api.Test
    void testArrayOfOddLength() {
        int expectedAnswer = 4;
        int actualAnswer = BinarySearch.binarySearch(arr2,20);
        assertEquals(expectedAnswer, actualAnswer);
    }

    @org.junit.jupiter.api.Test
    void testElementNotInArray() {
        int expectedAnswer = -1;
        int actualAnswer = BinarySearch.binarySearch(arr1,11);
        assertEquals(expectedAnswer, actualAnswer);
    }
}