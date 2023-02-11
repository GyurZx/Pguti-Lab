package org.example.AlexOS.Algorithms;

import java.util.Arrays;

public class IterativeMergeSort {
        public static void merge(int[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;

            int[] L = new int[n1];
            int[] R = new int[n2];

            for (int i = 0; i < n1; i++) {
                L[i] = arr[l + i];
            }
            for (int j = 0; j < n2; j++) {
                R[j] = arr[m + 1 + j];
            }

            int i = 0;
            int j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        public static void sort(int[] arr) {
            int n = arr.length;
            for (int currentSize = 1; currentSize <= n - 1; currentSize = 2 * currentSize) {
                for (int leftStart = 0; leftStart < n; leftStart += 2 * currentSize) {
                    int mid = leftStart + currentSize - 1;
                    int rightEnd = Math.min(leftStart + 2 * currentSize - 1, n - 1);
                    merge(arr, leftStart, mid, rightEnd);
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {38, 27, 43, 3, 9, 82, 10};
            sort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
}

