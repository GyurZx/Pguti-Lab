package org.example.LabaTwo;

import java.util.Arrays;

public class Dwelling {

    private DwellingFloor[] floors;

    // Конструктор может принимать кол-во этажей и массив квартир по этажам
    public Dwelling(int count, Flat[] flats) {
        floors = new DwellingFloor[count];
    }

    // Конструктор может принимать массив этажей дома
    public Dwelling(DwellingFloor[] floors) {

        this.floors = floors;
    }

    // Создание метода получения кол-во этажей дома
    public int getAmountFloorOnBuilds() {

        return floors.length;
    }

    public int getFlatsOnFloorsOnBuilds() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getAmountFlatOnFloor();
        }
        return sum;
    }

    public int getFlatsSquaresOnFloorsOnBuilds() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getSquareFlatOnFloor();
        }
        return sum;
    }

    public int getFlatsRoomsOnFloorsOnBuilds() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getTotalRoom();
        }
        return sum;
    }

    public DwellingFloor[] getArrayFloors() {
            return floors;
    }

    public DwellingFloor getFloors(int number) {
        return floors[number];
    }

    // метод изменения объекта квартиры по ее номеру в доме и ссылке на объект квартиры
    public void changeFloors(int number, DwellingFloor floor) {
        floors[number] = floor;
    }

    // метод добавления квартиры в дом по будущему номеру квартиры в доме (т.е. в парам. указ номер кот должны иметь
    // квартиры после вставки) и ссылке на объект квартиры (кол этажей в доме при этом не увел.)
    public Flat getFlat(int number) {
        int count = 0;
        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getArrayFlats().length;
            if(number <= count) {
                return floors[i].getFlats(number - (count - floors[i].getArrayFlats().length));
            }
        }
        return null;
    }
    public void changeFlat(int number, Flat flat) {
        int count = 0;
        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getArrayFlats().length;
            if(number <= count) {
                floors[i].getArrayFlats()[number - (count - floors[i].getArrayFlats().length)] = flat;
            }
        }
    }

    // метод удаления квартиры по ее номеру в доме
    public void deleteFlat(int number, int i) { // Apache Commons Lang removeElement() ArrayUtils.removeElement(array, 2)
        // System.out.println(Arrays.toString(MyArrayUtils.remove(numbers, 2)));
    }

    public static int[] remove(int[] values, int index) {
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
