package org.example.GitEx.OOP.Nasled;

public class CellPhone extends WirelessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }
}
