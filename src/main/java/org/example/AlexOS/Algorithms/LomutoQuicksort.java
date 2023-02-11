package org.example.AlexOS.Algorithms;
import java.util.Arrays;

public class LomutoQuicksort {
        public static void quicksort(int[] array, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(array, low, high);
                quicksort(array, low, pivotIndex);
                quicksort(array, pivotIndex + 1, high);
            }
        }

        public static int partition(int[] array, int low, int high) {
            int pivot = array[low];
            int i = low;
            for (int j = low + 1; j < high; j++) {
                if (array[j] <= pivot) {
                    i++;
                    swap(array, i, j);
                }
            }
            swap(array, low, i);
            return i;
        }

        public static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void main(String[] args) {
            int[] array = {921, 81, 7, 65, 5, 334, 3, 23, 1};
            quicksort(array, 0, array.length);
            System.out.println(Arrays.toString(array));
        }
}
// в некоторых случаях схема разделения Lomuto может быть менее эффективной, чем схема Hoare.
