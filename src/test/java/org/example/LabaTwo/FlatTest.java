package org.example.LabaTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatTest {

    @Test
    public void testDefaultConstructor() {
        Flat flat = new Flat();
        assertEquals(2, flat.getRoomsAmount());
        assertEquals(50, flat.getFlatSquares());
    }

    @Test
    public void testOtherConstructor() {
        Flat flat1 = new Flat(3,150);
        assertEquals(3, flat1.getFlatSquares());
        assertEquals(150, flat1.getRoomsAmount());

        Flat flat2 = new Flat(50);
        assertEquals(50, flat2.getFlatSquares());
        assertEquals(2, flat2.getRoomsAmount());
    }

    @Test
    void testGetterAndSetter() {
        Flat actualFlat = new Flat();
        assertEquals(50, actualFlat.getFlatSquares());
        assertEquals(2, actualFlat.getRoomsAmount());

        actualFlat.setFlatSquares(10);
        actualFlat.setRoomsAmount(500);

        assertEquals(10, actualFlat.getFlatSquares());
        assertEquals(500, actualFlat.getRoomsAmount());
    }

}