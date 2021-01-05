package internship_java.algorithms_datastructures;

import java.util.Arrays;

public class QuickSort {
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    static void quickSort(int array[], int left, int right) {
        int index = 0;
        if (array.length == 2) {
            swap(array, 0, array.length - 1);
        }
        if (array.length > 2) {
            index = partition(array, left, right);
            if (left < index - 1) {
                quickSort(array, left, right - 1);
            }
            if (index < right) {
                quickSort(array, index, right);
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {6, 7, 8, 5, 4, 3, 2, 1, 9, 10, 13, 12};
        int[] mySecondArray = {9, 2};
        int[] myThirdArray = {2};
        quickSort(myArray, 0, myArray.length - 1);
        quickSort(mySecondArray, 0, myArray.length - 1);
        quickSort(myThirdArray, 0, myArray.length - 1);

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(mySecondArray));
        System.out.println(Arrays.toString(myThirdArray));
    }
}



