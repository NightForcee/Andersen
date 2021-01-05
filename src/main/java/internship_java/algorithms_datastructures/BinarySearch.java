package internship_java.algorithms_datastructures;

public class BinarySearch {
    static int binarySearch(int[] sortedArray, int item) {
        int low, mid, high, guess;
        low = 0;
        high = sortedArray.length - 1;
        int result = -1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (sortedArray[mid] < item) {
                low = mid + 1;
            } else if (sortedArray[mid] > item) {
                high = mid - 1;
            } else if (sortedArray[mid] == item) {
                result = mid;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int myArray[] = new int[25];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        for (int count: myArray) {
            System.out.println(count);
        }
        System.out.println(binarySearch(myArray, 12));
        System.out.println(binarySearch(myArray, 4));
        System.out.println(binarySearch(myArray, 26));
    }
}
