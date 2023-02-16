package AppProgramm.LabaOne;

import AppProgramm.LabaOne.MyFirstClass.SecondClass;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        SecondClass o = new SecondClass();

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                o.setFirstNum(i);
                o.setSecondNum(j);
                System.out.print(o.sum() + " ");
            }
            System.out.println();
        }
    }
}


