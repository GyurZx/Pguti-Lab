package org.example.AlexOS.Algorithms;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {5, 32, 15, 4, 8, 3, 1};
        shellSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
/*Приведенный выше код сортирует массив целых чисел, используя алгоритм сортировки оболочки.
Алгоритм начинается с разделения массива на более мелкие подсписки, которые затем сортируются
с использованием варианта алгоритма сортировки вставками. Каждый подсписок имеет разрыв n/2, где
n — длина массива. Затем зазор делится на 2 на каждой итерации, пока не станет равным 1.
Таким образом, массив сортируется постепенно, уменьшая размер зазора.*/