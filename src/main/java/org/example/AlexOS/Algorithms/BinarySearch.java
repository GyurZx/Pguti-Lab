package org.example.AlexOS.Algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {11, 2, 9, 54, 7, 63, 17};
        int target = 7;
        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("Target not found in array.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
