package org.example.AlexOS.Algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 32, 15, 4, 8, 3, 1};
        for (int i = 1; i < array.length; i++) {
            int sorted = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > sorted) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = sorted;
        }
        for(int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}
/*В этом примере алгоритм сортировки вставками принимает в качестве
входных данных массив целых чисел и сортирует его в порядке возрастания,
многократно вставляя следующий элемент в правильное положение в отсортированной
части массива. Внешний цикл for перебирает массив, начиная со второго элемента,
а внутренний цикл while сравнивает текущий элемент с элементами в отсортированной
части массива и сдвигает их вправо до тех пор, пока не будет найдена
правильная позиция для текущего элемента.*/