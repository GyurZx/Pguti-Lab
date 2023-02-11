package org.example.LabaOne;

import org.example.LabaOne.myfirstpackage.MyFirstPackage;

public class MyFirstClass {
    public static void main(String[] s) {
        System.out.println("Hi world!");
        MyFirstPackage o = new MyFirstPackage();

        int arg1 = 3; // prosto eksperementil nad tem, chto rabotaet a chto net
        /* a to jaBu nihera ne znaiy */
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                o.setX(i);
                o.setY(j);
                System.out.print(o.sum());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public int MiFirstClass() {
        return 0;
    }
}