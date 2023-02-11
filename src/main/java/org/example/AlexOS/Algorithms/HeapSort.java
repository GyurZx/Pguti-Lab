package org.example.AlexOS.Algorithms;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {5, 32, 15, 4, 8, 3, 1};
        heapSort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void heapSort(int[] arr) {
        // Build max heap
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        // Extract elements one by one
        for (int i = arr.length - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
/* Приведенный выше код принимает массив целых чисел в качестве входных данных и сортирует его в порядке возрастания,
используя алгоритм сортировки кучей. Метод heapSortсначала строит максимальную кучу из входного массива,
а затем многократно извлекает корневой элемент (самый большой элемент) и помещает его в конец массива,
уменьшая размер кучи на 1 на каждой итерации. Этот heapifyметод используется для поддержания свойства
максимальной кучи, которое гарантирует, что самый большой элемент всегда находится в корне кучи.*/
