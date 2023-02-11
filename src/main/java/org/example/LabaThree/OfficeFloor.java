package org.example.LabaThree;

import org.example.LabaThree.Office;

public class OfficeFloor {

    private Office[] offices;

    //конструктор принимающий кол-во квартир на этаже
    public OfficeFloor(int count) {
        offices = new Office[count];
    }

    //конструктор принимающий массив квартир этажа
    public OfficeFloor(Office[] offices) {
        this.offices = offices;
    }

    //метод получения кол-ва квартир на этаже
    public int getAmountOfficeOnFloor() {
        return offices.length;
    }
    //метод получения общей площади квартир этажа
    public int getSquareOfficeOnFloor() {
        int sum = 0;
        for (int i = 0; i < offices.length; i++) {
            sum += offices[i].getOfficeSquares();
        }
        return sum;
    }
    //метод получения общего количества комнат этажа
    public int getTotalOfficeRoom() {
        int sum = 0;
        for (int i = 0; i < offices.length; i++) {
            sum += offices[i].getOfficeSquares();
        }
        return sum;
    }
    //метод получения массива квартир этажа
    public Office[] getArrayOffices() {
        return offices;
    }

    public Office getOffices(int number) {
        return offices[number];
    }

    /*public void changeOffice(int number, Office flat) {
        int count = 0;
        for (int i = 0; i < offices.length; i++) {
            count += offices[i].getArrayOffices().length;
            if(number <= count) {
                offices[i].getArrayOffices()[number - (count - offices[i].getArrayOffices().length)] = flat;
            }

        }
    }*/

    public Office getBestSpaceOffice() {
        int max = 0;
        Office bestOffice = offices[0];


        for (int i = 0; i < offices.length; i++) {
            if (offices[i].getOfficeSquares() > max) {
                max = offices[i].getOfficeSquares();
                bestOffice = offices[i];
            }
        }
        return bestOffice;
    }
}
