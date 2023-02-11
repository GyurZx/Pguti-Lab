package org.example.LabaThree;

import org.example.LabaTwo.DwellingFloor;
import org.example.LabaTwo.Flat;

public class OfficeBuilding {
    private OfficeFloor[] floors;

    // Конструктор может принимать кол-во этажей и массив квартир по этажам
    public OfficeBuilding(int count, Office[] offices) {
        floors = new OfficeFloor[count];
    }

    // Конструктор может принимать массив этажей дома
    public OfficeBuilding(OfficeFloor[] floors) {
        this.floors = floors;
    }

    // Создание метода получения кол-во этажей дома
    public int getAmountFloorOnBuilds() {

        return floors.length;
    }

    public int getOfficesOnFloorsOnBuilds() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getAmountOfficeOnFloor();
        }
        return sum;
    }

    public int getOfficesSquaresOnFloorsOnBuilds() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getSquareOfficeOnFloor();
        }
        return sum;
    }

    public int getOfficesRoomsOnFloorsOnBuilds() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getTotalOfficeRoom();
        }
        return sum;
    }

    public OfficeFloor[] getArrayFloors() {
        return floors;
    }

    public OfficeFloor getFloors(int number) {
        return floors[number];
    }

    // метод изменения объекта квартиры по ее номеру в доме и ссылке на объект квартиры
    public void changeFloors(int number, OfficeFloor floor) {
        floors[number] = floor;
    }

    // метод добавления квартиры в дом по будущему номеру квартиры в доме (т.е. в парам. указ номер кот должны иметь
    // квартиры после вставки) и ссылке на объект квартиры (кол этажей в доме при этом не увел.)

    public Office getFlat(int number) {
        int count = 0;
        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getArrayOffices().length;
            if(number <= count) {
                return floors[i].getOffices(number - (count - floors[i].getArrayOffices().length));
            }
        }
        return null;
    }

    public void changeOffice(int number, Office flat) {
        int count = 0;
        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getArrayOffices().length;
            if(number <= count) {
                floors[i].getArrayOffices()[number - (count - floors[i].getArrayOffices().length)] = flat;
            }
        }
    }

    // метод удаления квартиры по ее номеру в доме
    public void deleteOffice(int number, int i) { // Apache Commons Lang removeElement() ArrayUtils.removeElement(array, 2)
        // System.out.println(Arrays.toString(MyArrayUtils.remove(numbers, 2)));
    }

    public static int[] removeOffice(int[] values, int index) {
        // Создаем пустой массив размером на один меньше чем исходный
        // так как мы удаляем один элемент
        int[] result = new int[values.length - 1];

        for (int i = 0; i < values.length; i++) {
            if (i != index) { // Копируем все кроме index
                // Элементы стоящие дальше index смещаются влево
                int newIndex = i < index ? i : i - 1;
                result[newIndex] = values[i];
            }
        }

        return result;
    }

    // ГетБестСпейс самой большой по площади квартиры дома
    // метод получения отсортированого по убыванию площадей массив квартир
}
