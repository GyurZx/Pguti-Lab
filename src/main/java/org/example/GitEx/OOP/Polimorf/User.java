package org.example.GitEx.OOP.Polimorf;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone) {
    // вот он полиморфизм - использование в коде абстактного типа AbstractPhone phone!
        phone.call(number);
    }
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);
        User user = new User("Андрей");
        user.callAnotherUser(224466,firstPhone);
        // Вращайте ручку
        //Сообщите номер абонента, сэр
        user.callAnotherUser(224466,phone);
        //Вызываю номер 224466
        user.callAnotherUser(224466,videoPhone);
        //Подключаю видеоканал для абонента 224466
    }
}
