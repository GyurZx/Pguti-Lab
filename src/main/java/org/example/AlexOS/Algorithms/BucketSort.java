package org.example.AlexOS.Algorithms;

import java.util.ArrayList;

public class BucketSort {
        public static void sort(int[] arr) {
            // Find the maximum value in arr[]
            int maxVal = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
            // Initialize the bucket array
            ArrayList<Integer>[] bucket = new ArrayList[maxVal + 1];
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new ArrayList<Integer>();
            }
            // Add elements to the bucket
            for (int i = 0; i < arr.length; i++) {
                bucket[arr[i]].add(arr[i]);
            }
            // Sort each bucket and concatenate all buckets
            int k = 0;
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i].size() > 0) {
                    for (int j = 0; j < bucket[i].size(); j++) {
                        arr[k++] = bucket[i].get(j);
                    }
                }
            }
        }
        public static void main(String[] args) {
            int[] arr = {414, 3, 2, 16, 53, 6, 71, 8, 9, 10};
            sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}

/* Это простая реализация алгоритма Bucket Sort.
Он работает, создавая массив «сегментов», а затем помещая каждый элемент входного
массива в соответствующий сегмент. Затем он сортирует каждое ведро и объединяет
отсортированные ведра обратно в исходный массив. Временная сложность этого алгоритма
составляет O(n) в лучшем и среднем случае и O(n^2) в худшем случае, когда распределение
элементов неравномерно. */
