package org.example.AlexOS.Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 32, 15, 4, 8, 3, 1};
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
/*В этом примере алгоритм сортировки выбором перебирает весь массив
и на каждой итерации находит наименьший элемент из оставшейся несортированной
части массива и заменяет его текущей позицией. Этот процесс повторяется
до тех пор, пока весь массив не будет отсортирован.*/