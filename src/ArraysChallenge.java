import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysChallenge {
        public static int[] getIntegers(int size) {
            int[] toSort = new int[size];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < size; i++) {
                toSort[i] = scanner.nextInt(); // no extra prints
            }
            return toSort; // return directly, no printing
        }

        public static void printArray(int[] arrayToPrint) {
            for (int i = 0; i < arrayToPrint.length; i++) {
                System.out.println("Element " + i + " contents " + arrayToPrint[i]);
            }
        }

        public static int[] sortIntegers(int[] arrayToSort) {
            int[] sorted = Arrays.copyOf(arrayToSort, arrayToSort.length);
            Arrays.sort(sorted);
            // reverse
            for (int i = 0; i < sorted.length / 2; i++) {
                int temp = sorted[i];
                sorted[i] = sorted[sorted.length - 1 - i];
                sorted[sorted.length - 1 - i] = temp;
            }
            return sorted;
        }

}