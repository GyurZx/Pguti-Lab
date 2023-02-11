package org.example.LabaTwo;

public class Flat {
    private int roomsAmount;
    private int flatSquares;

    private final int BASE_ROOM_AMOUNT = 2;
    private final int BASE_FLAT_SQUARE = 50;

    // Конструктор создаёт квартиру по умол. 2 комнаты, 50 площадь
    public Flat() {
        this.roomsAmount = BASE_ROOM_AMOUNT;
        this.flatSquares = BASE_FLAT_SQUARE;
    }

    // Конструктор принимает площадь пользователя и базовые 2 комнаты
    public Flat(int flatSquares) {
        this.roomsAmount = BASE_ROOM_AMOUNT;
        this.flatSquares = flatSquares;
    }

    // Конструктор принимает площадь и квартиры пользователя
    public Flat(int flatSquares, int roomsAmount) {
        this.roomsAmount = roomsAmount;
        this.flatSquares = flatSquares;
    }

    // Метод получения кол-ва комнат в квартире
    public int getRoomsAmount() {
        return roomsAmount;
    }

    // Метод изменения кол-ва комнат
    public void setRoomsAmount(int roomsAmount) {
        this.roomsAmount = roomsAmount;
    }

    // Метод получения площади в квартиры
    public int getFlatSquares() {
        return flatSquares;
    }

    // Метод изменения площади комнаты
    public void setFlatSquares(int flatSquares) {
        this.flatSquares = flatSquares;
    }
}

