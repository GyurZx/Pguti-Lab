package org.example.AlexOS.Algorithms;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void merge(int[] arr, int l, int m, int r) {
        int i = l;
        int j = m + 1;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                int temp = arr[j];
                for (int k = j - 1; k >= i; k--) {
                    arr[k + 1] = arr[k];
                }
                arr[i] = temp;
                i++;
                m++;
                j++;
            }
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
