package org.example.TrialTourTasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryFirstTest {

    private org.example.TrialTourTasks.BinaryFirst BinaryFirst;

    @BeforeEach
    void setUp() { BinaryFirst = new BinaryFirst(); }

    @Test
    void low() {
        String actually = BinaryFirst.addBinary("1","11");
        assertEquals("100", actually);
    }

    @Test
    void addBinary() {
    }
}