package org.example.PracticeOfLectures.Animate;

public class Dog extends Pet implements int1, int2{ // а так можно, сразу и наследование и имплимент
    // expends Pet2 нет, т.к. нет множественного наследования
    // Но можно имплементировать множество интерфейсов
    public Dog(String name) {
        super(name);
    }

    // setName() ожно использоватеть теперь в этом классе тк protected из Pet

    // вот он и появился интерфейс который нужно реализовывать обязательно теперь
    @Override
    public void saySwath() {
        System.out.println("Гав");

    }
}
