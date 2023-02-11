package org.example.AlexOS.Algorithms;

public class HoaraQuicksort { // QuickSort
    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quicksort(array, low, pivot);
            quicksort(array, pivot + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            if (i >= j) {
                return j;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
/* Это основная форма быстрой сортировки с использованием схемы разделов Хоара.
Это алгоритм «разделяй и властвуй», который многократно разбивает входной массив вокруг
опорного элемента таким образом, что все элементы меньше опорного находятся в одном разделе,
а все элементы больше опорного находятся в другом разделе. Затем поворотный элемент находится
в своей конечной позиции в отсортированном массиве. Процесс разбиения выполняется на месте, что
означает, что для него не требуется дополнительное хранилище. Затем алгоритм рекурсивно
сортирует левый и правый разделы.*/
