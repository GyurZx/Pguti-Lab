package org.example.AlexOS.Algorithms;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = {5, 32, 15, 4, 8, 3, 1};
        radixSort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void radixSort(int[] arr) {
        // Find the maximum number to know the number of digits
        int max = Arrays.stream(arr).max().getAsInt();
        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; max/exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // output array
        int[] count = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;

        // Change count[i] so that count[i] now contains actual
        // position of this digit in output[]
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
/*В этом примере массив целых чисел сортируется с помощью сортировки по основанию.
Поразрядная сортировка работает путем сортировки элементов на основе их отдельных цифр,
начиная с младшей значащей цифры и продвигаясь к самой значащей цифре. В этом примере
алгоритм сортировки подсчетом используется для сортировки цифр в каждой итерации.*/