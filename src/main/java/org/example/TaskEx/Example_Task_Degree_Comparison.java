package org.example.TaskEx;

import java.lang.Math;

public class Example_Task_Degree_Comparison {
    public static int comparePowers(int[] number1, int[] number2) {
        int a = number2[0];
        int b = number2[1];
        int c = number1[0];
        int d = number1[1];
        return (int) Math.signum(d * Math.log((double) a / c) + (b - d) * Math.log(a));
    }
}
// ln(a^b/c^d)