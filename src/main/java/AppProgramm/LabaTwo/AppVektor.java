package AppProgramm.LabaTwo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppVektor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину вектора:");
        int length = Integer.parseInt(reader.readLine());

        Vektor vector = new Vektor(length);
        float[] array = new float[length];

        System.out.println("Введите значение вектора:");
        for (int i = 0; i < length; ++i) {
            vector.setVektor(i, Float.parseFloat(reader.readLine()));
        }

        System.out.println("Максимум: " + vector.linearSearchVektorMax());
        System.out.println("Минимальное: " + vector.linearSearchVektorMin());
        System.out.println("Евклидова норма: " + vector.EvklidNormVektor());

        System.out.println("До сортировки вставками:");
        System.out.println(vector);
        vector.SelectionSortVektor();
        System.out.println("После сортировки:");
        System.out.println(vector);

        System.out.println("Умножение ветора на самоИсебя:");
        vector.multVektor(Float.parseFloat(reader.readLine()));
        System.out.println("Результат:");
        System.out.println(vector);

        System.out.println("Сумма вектора:");
        vector.sumVector(vector);
        System.out.println(vector);

        System.out.println("Скаляр:");
        vector.skalyarVector(vector);
        System.out.println(vector);
    }
}
