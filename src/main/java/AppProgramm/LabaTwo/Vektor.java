package AppProgramm.LabaTwo;

import java.util.Arrays;

public class Vektor {
    private float[] arr;

    public Vektor(int length) {
        arr = new float[length];
    }

    public float getVektor(int value) {
        return arr[value];
    }

    // измение значение я массиве
    public float setVektor(int value, float num) {
        return arr[value] = num;
    }

    // получение длины вектора
    public float getLengthVektor() {
        return arr.length;
    }

    // линейный поиск меньшего элемента
    public float linearSearchVektorMin() {
        float min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
    // линейный поиск большего элемента
    public float linearSearchVektorMax() {
        float max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                return max = arr[i];
            }
        }
        return max;
    }
    // Сортировка вставками
    public void SelectionSortVektor() {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            float temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    // Нахождение Евклид нормы
    public double EvklidNormVektor() {
        float norm = 0;
        for (float item : arr) {
            norm += item * item;
        }
        return Math.sqrt(norm);
    }

    // Умножение ветора на число
    public void multVektor(float value) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] *= value;
        }
    }

    public void sumVector(Vektor vector) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] += vector.getVektor(i);
        }
    }

    public void skalyarVector(Vektor vector) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] *= vector.getVektor(i);
        }
    }

    public String toString() {
        return Arrays.toString(arr);
    }
}

