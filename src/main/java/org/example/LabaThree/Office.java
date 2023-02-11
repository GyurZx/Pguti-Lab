package org.example.LabaThree;

public class Office {

    private int OfficeRoomsAmount;
    private int OfficeSquares;

    private final int BASE_OFFICE_ROOM_AMOUNT = 2;
    private final int BASE_OFFICE_SQUARE = 50;

    // Конструктор создаёт квартиру по умол. 2 комнаты, 50 площадь
    public Office() {
        this.OfficeRoomsAmount = BASE_OFFICE_ROOM_AMOUNT;
        this.OfficeSquares = BASE_OFFICE_SQUARE;
    }

    // Конструктор принимает площадь пользователя и базовые 2 комнаты
    public Office(int OfficeSquares) {
        this.OfficeRoomsAmount = BASE_OFFICE_ROOM_AMOUNT;
        this.OfficeSquares = OfficeSquares;
    }

    // Конструктор принимает площадь и квартиры пользователя
    public Office(int OfficeSquares, int OfficeRoomsAmount) {
        this.OfficeRoomsAmount = OfficeRoomsAmount;
        this.OfficeSquares = OfficeSquares;
    }

    // Метод получения кол-ва комнат в квартире
    public int getOfficeRoomsAmount() {
        return OfficeRoomsAmount;
    }

    // Метод изменения кол-ва комнат
    public void setOfficeRoomsAmount(int OfficeRoomsAmount) {
        this.OfficeRoomsAmount = OfficeRoomsAmount;
    }

    // Метод получения площади в квартиры
    public int getOfficeSquares() {
        return OfficeSquares;
    }

    // Метод изменения площади комнаты
    public void setOfficeSquares(int OfficeSquares) {
        this.OfficeSquares = OfficeSquares;
    }
}
