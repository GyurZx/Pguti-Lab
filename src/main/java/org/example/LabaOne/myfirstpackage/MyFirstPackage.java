package org.example.LabaOne.myfirstpackage;

public class MyFirstPackage {
    private int x;
    private int y;

    public MyFirstPackage() {
        this.x = x;
        this.y = y;
    }
    // Задание x
    public void setX(int value) {
        this.x = value;
    }
    // Вернуть x
    public int getX() {
        return x;
    }
    // Задание y
    public void setY(int value) {
        this.y = value;
    }
    // Вернуть y
    public int getY() {
        return y;
    }
    // Вернуть сумму x + y
    public int sum() {
        return this.x + this.y;
    }
}