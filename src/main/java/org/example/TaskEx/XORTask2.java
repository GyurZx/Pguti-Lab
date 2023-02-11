package org.example.TaskEx;

public class XORTask2 {
    public static void main(String[] args) {
        int[] arr = new int[]{ 7 ,2 ,3 ,7 ,4 ,4 ,2 };

        int result = 0;
        for ( int i = 0; i < arr.length; i++ ) {
//          result ^= arr[i];
            result = result ^ arr[i];
        }
        System.out.println(result);
    }
}


//public class Task2 {
//    public static void main(String[] args) {
//        int[] num = {7, 2, 3, 7, 4, 4, 2};
//        printArr(num);
//        SelectionSort(num);
//        printArr(num);
//
//    }
//
//    public static void printArr(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void SelectionSort(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            int min = array[i];
//            int min_i = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < min) {
//                    min = array[j];
//                    min_i = j;
//                }
//            }
//            if (i != min_i) {
//                int temp = array[i];
//                array[i] = array[min_i];
//                array[min_i] = temp;
//            }
//        }
//    }
//}