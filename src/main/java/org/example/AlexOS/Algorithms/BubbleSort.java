package org.example.AlexOS.Algorithms;

public class BubbleSort {
    public static void main(String[] s) {
        int[] arr = {5, 32, 15, 4, 8, 3, 1};
        int length = arr.length;
        while(length!=0) {
            int max_index = 0;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                max_index = i;
            }
        }
        length = max_index;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

/*
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }*/
        /*Эта реализация использует вложенные циклы for для многократного повторения массива.
        На каждой итерации он сравнивает соседние элементы и меняет их местами,
        если они находятся в неправильном порядке. Этот процесс продолжается до тех пор,
        пока весь массив не будет отсортирован. Обратите внимание,
        что пузырьковая сортировка — это неэффективный алгоритм сортировки со временной сложностью O(n^2)
        в среднем и в худшем случае.*/

        /*Квантовые вычисления — это тип вычислений, использующий принципы квантовой физики
        для выполнения операций с данными. В классических вычислениях данные хранятся в виде
        двоичных цифр (битов), которые могут иметь значение либо 0, либо 1. В квантовых
        вычислениях данные хранятся в квантовых битах или кубитах, которые могут одновременно
        находиться в нескольких состояниях. Это позволяет квантовым компьютерам выполнять
        определенные виды вычислений намного быстрее, чем классические компьютеры.
        Некоторые примеры потенциального использования квантовых вычислений включают взлом кодов шифрования,
        моделирование сложных систем и оптимизацию крупномасштабных систем, таких как логистические сети.*/