package org.example.lab.LabaOne;

import org.example.LabaOne.MyFirstClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyFirstClassTest {

    private org.example.LabaOne.MyFirstClass MyFirstClass;

    @BeforeEach
    void setUp() {
        MyFirstClass = new MyFirstClass();
    }

    @Test
    void main() {
        int actual = MyFirstClass.MiFirstClass();
        assertEquals(0, actual);
    }

    @Test
    public void testMedhud1() {
        assertEquals(1, 1);
    }
}