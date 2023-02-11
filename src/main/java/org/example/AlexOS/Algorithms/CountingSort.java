package org.example.AlexOS.Algorithms;

import java.util.Arrays;

public class CountingSort { // доделать
    public static void main(String[] args) {
        int[] array = {5, 32, 15, 4, 8, 3, 1};
        countingSort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        return output;
    }
}
/*Он принимает целочисленный массив в качестве входных данных и возвращает отсортированный массив.
Он использует три массива: один для подсчета частоты каждого элемента, один для хранения выходных
данных и один для отслеживания промежуточной суммы подсчета частоты. Алгоритм сначала подсчитывает
частоту каждого элемента во входном массиве, а затем изменяет массив счетчиков, чтобы сохранить
промежуточную сумму частоты. Наконец, он выполняет итерацию по входному массиву и помещает каждый
элемент в правильное положение в выходном массиве, используя массив count.*/