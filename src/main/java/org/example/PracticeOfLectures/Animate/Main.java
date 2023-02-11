package org.example.PracticeOfLectures.Animate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Jackson");
        // Class1 class1 = new Class1("Codes"); // нет конструктора
        // вот теперь его добавил и он ругается Class1 class1 = new Class1();
        // можно сделать несколько конструкторов и употреблять один из них
        // Class1 class1 = new Class1(3); например
        System.out.println(dog.getName());
        System.out.println(dog.getSecondName());
        // dog.saySwath();
        // method1(dog);
        dogSay(dog);

        Cat cat = new Cat();
        // cat.saySwath();
        // method1(cat);
        catSay(cat);
        // dogSay(cat) - нельзя, тк принимает dog, но метод method1 позволяет принимать любые входные
        // значит int упростит нам жизнь

        Dog[] dogs = new Dog[2];
        // используются List, т.к. они удобнее
        List<Dog> dogs1 = new ArrayList<>();
        // к нему есть кучу методов
        dogs1.hashCode();
        dogs1.clear(); // и т.д
        for (int i = 0; i < 10; i++) {
            dogs1.get(i);
        }
        for (Dog dogs2: dogs1) {
            
        }

    }
    // это всё одно и то же, но интерфейс упрощяет жизнь
    public static void dogSay(Dog dog) {
        dog.saySwath();
    }

    public static void catSay(Cat cat) {
        cat.saySwath();
    }

    public static void method1(int1 int1) {
        int1.saySwath();
    }
}
