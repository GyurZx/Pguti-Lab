package org.example.LabaTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DwellingFloorTest {

    @Test
    public void testDefaultConstructor() {
        DwellingFloor dwellingFloor = new DwellingFloor(5);
        assertEquals(dwellingFloor, dwellingFloor); // как проверить длину массива?
    }

    @Test
    public void testOtherConstructor() {
        int[] anArray = {};
        DwellingFloor dwellingFloor1 = new DwellingFloor(5);
        assertEquals(3, dwellingFloor1);
        assertEquals(150, dwellingFloor1);
    }
    /*
    @Test
    public void newSquareArrayShouldHaveSomeArea() {
        int[][] anArray = {{1,1},{2,2}};
        SquareArray squareArray1 = new SquareArray(anArray);
        long asserCountAllElements = squareArray1.getRow() * squareArray1.getColumn();
        Assert.assertEquals(asserCountAllElements, squareArray1.getSumLengthAllRow());
        }*/
}
