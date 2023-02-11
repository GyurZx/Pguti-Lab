package org.example.GitEx.OOP.Incaps;

public class SomePhone {

    private int year;
    private String company;
    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }
    private void openConnection(){ // private
        //findComutator
        //openNewConnection...
    }
    public void call() { // pub
        openConnection();
        System.out.println("Вызываю номер");
    }

    public void ring() {
        System.out.println("Дзынь-дзынь");
    }

}
