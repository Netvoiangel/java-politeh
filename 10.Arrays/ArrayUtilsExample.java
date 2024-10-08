import java.util.Arrays;

public class ArrayUtilsExample {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};
        
        String arrayString = Arrays.toString(array);
        System.out.println("toString: " + arrayString); 
        
        Arrays.sort(array); 
        System.out.println("Sorted array: " + Arrays.toString(array)); 

        int index = Arrays.binarySearch(array, 5);
        System.out.println("Index of 5: " + index); 

        int[] array2 = {1, 2, 3, 5, 8};
        boolean areEqual = Arrays.equals(array, array2);
        System.out.println("Arrays equal: " + areEqual); 

        int[] array3 = {1, 2, 3, 5, 8};
        int comparisonResult = Arrays.compare(array, array3);
        System.out.println("Comparison result: " + comparisonResult); 
    }
}
