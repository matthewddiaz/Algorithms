package searching;

/**
 * Created by matthewdiaz on 8/29/16.
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int element){
        return binarySearch(arr, element, 0 , arr.length - 1);
    }

    private static int binarySearch(int[] arr, int element, int low, int high){
        if(low > high){
            return -1;
        }

        int mid = (low + high)/2;
        int midVal = arr[mid];

        if(element == midVal){
            return mid;
        }else if(element > midVal){
            return binarySearch(arr, element, mid + 1, high);
        }else{
            return binarySearch(arr, element, 0, mid - 1);
        }
    }
}
