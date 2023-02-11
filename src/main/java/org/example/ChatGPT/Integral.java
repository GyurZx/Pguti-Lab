package org.example.ChatGPT;

import java.util.function.DoubleFunction;

public class Integral {
    public static double integrate(DoubleFunction<Double> f, double a, double b, int n) {
        double dx = (b - a) / n;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double x = a + i * dx;
            sum += f.apply(x) + f.apply(x + dx);
        }

        return sum * dx / 2;
    }

    public static void main(String[] args) {
        // Example usage
        double result = integrate(x -> x * x, 0, 1, 1000000);
        System.out.println("Result: " + result);
    }
}