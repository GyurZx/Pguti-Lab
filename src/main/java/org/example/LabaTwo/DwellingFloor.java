package org.example.LabaTwo;

public class DwellingFloor {

    private Flat[] flats;

    //конструктор принимающий кол-во квартир на этаже
    public DwellingFloor(int count) {
        flats = new Flat[count];
    }

    //конструктор принимающий массив квартир этажа
    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

    //метод получения кол-ва квартир на этаже
    public int getAmountFlatOnFloor() {
        return flats.length;
    }
    //метод получения общей площади квартир этажа
    public int getSquareFlatOnFloor() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getFlatSquares();
        }
        return sum;
    }
    //метод получения общего количества комнат этажа
    public int getTotalRoom() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getFlatSquares();
        }
        return sum;
    }
    //метод получения массива квартир этажа
    public Flat[] getArrayFlats() {
        return flats;
    }

    public Flat getFlats(int number) {
        return flats[number];
    }
/*
    public void changeFlats(int number, Flat flat) {
        int count = 0;
        for (int i = 0; i < flats.length; i++) {
            count += flats[i].getArrayFlats().length;
            if(number <= count) {
                flats[i].getArrayFlats()[number - (count - flats[i].getArrayFlats().length)] = flat;
            }

        }
    }
*/
    public Flat getBestSpace() {
        int max = 0;
        Flat bestFlat = flats[0];


        for (int i = 0; i < flats.length; i++) {
            if (flats[i].getFlatSquares() > max) {
                max = flats[i].getFlatSquares();
                bestFlat = flats[i];
            }
        }
        return bestFlat;
    }
}
/*
import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class DwellingFloorTest {

    private Flat[] flats;

    @BeforeEach
    void setUp() {
        flats = Zapolnenie(5);
    }

    @Test
    public void testOtherConstructor() {
        DwellingFloor floor = new DwellingFloor(5);
        assertEquals(5,floor.getArrayFlats().length);

    }

    @Test
    public void testOtherConstructor2() {
        Flat[] flats = new Flat[5];
        DwellingFloor floor = new DwellingFloor(flats);
        assertEquals(5,floor.getArrayFlats().length);

    }

    @Test
    void getAmountFlatOnFloor() {
        DwellingFloor floor = new DwellingFloor(5);
        assertEquals(5,floor.getAmountFlatOnFloor());
    }

    @Test
    void getSquareFlatOnFloor() {

        DwellingFloor floor = new DwellingFloor(flats);
        assertEquals(250,floor.getSquareFlatOnFloor());

    }

    @Test
    void getTotalRoom() {
        DwellingFloor floor = new DwellingFloor(flats);
        assertEquals(10,floor.getTotalRoom());

    }

    @Test
    void getArrayFlats() {
        DwellingFloor floor = new DwellingFloor(flats);
        assertEquals(flats,floor.getArrayFlats());

    }

    @Test
    void getFlatsByNumber() {
        DwellingFloor floor = new DwellingFloor(flats);
        assertEquals(flats[1],floor.getFlatsByNumber(1));
    }

    @Test
    void changeFlatByNumber() {
        DwellingFloor floor = new DwellingFloor(flats);
        Flat newFlat = new Flat(100,4);
        Flat oldFlat = floor.getArrayFlats()[3];
        floor.changeFlatByNumber(3,newFlat);

        assertNotEquals(floor.getArrayFlats()[3].getSpace(), oldFlat.getSpace());
        assertNotEquals(floor.getArrayFlats()[3].getRooms(), oldFlat.getRooms());

    }



    @Test
    void addFlatByFutureNumber() {
        DwellingFloor floor = new DwellingFloor(flats);
        Flat newFlat = new Flat(100,4);
        floor.addFlatByFutureNumberOnFloor(8,newFlat);
        assertEquals(newFlat.getSpace(),floor.getArrayFlats()[7].getSpace());
        assertEquals(newFlat.getRooms(),floor.getArrayFlats()[7].getRooms());

    }

    @Test
    void getBestSpace() {
        DwellingFloor floor = new DwellingFloor(flats);
        Flat newFlat = new Flat(100,4);
        floor.addFlatByFutureNumberOnFloor(3,newFlat);
        assertEquals(newFlat,floor.getBestSpace());
    }



    public Flat[] Zapolnenie(int count){
        Flat[] flats = new Flat[count];
        for(int i = 0; i<count;i++){
            flats[i]= new Flat();
        }
        return flats;
    }
}
*/