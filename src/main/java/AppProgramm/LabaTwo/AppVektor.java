package AppProgramm.LabaTwo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppVektor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input vector length:");
        int length = Integer.parseInt(reader.readLine());

        Vektor vector = new Vektor(length);
        float[] array = new float[length];

        System.out.println("Input values line by line:");
        for (int i = 0; i < length; ++i) {
            vector.setVektor(i, Float.parseFloat(reader.readLine()));
        }

        System.out.println("Min: " + vector.linearSearchVektorMin());
        System.out.println("Max: " + vector.linearSearchVektorMax());
        System.out.println("Norm Evklid: " + vector.EvklidNormVektor());

        System.out.println("Before sort:");
        System.out.println(vector);
        vector.SelectionSortVektor();
        System.out.println("After sort:");
        System.out.println(vector);

        System.out.println("Multiple by:");
        vector.multVektor(Float.parseFloat(reader.readLine()));
        System.out.println("After multiple:");
        System.out.println(vector);

        System.out.println("Sum by self:");
        vector.sumVector(vector);
        System.out.println(vector);

        System.out.println("Scalar by self:");
        vector.skalyarVector(vector);
        System.out.println(vector);
    }
}
