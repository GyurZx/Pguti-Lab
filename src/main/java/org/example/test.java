package org.example;

public class test {
    public static void main(String[] args) {
        int[] arr = {5, 32, 15, 4, 8, 3, 1};
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
