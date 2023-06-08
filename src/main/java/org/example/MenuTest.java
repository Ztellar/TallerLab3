package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    int testearValor1;
    int testearValor2;
    int testearValor3;
    int valorMax1;
    int valorMax2;
    int valorMax3;
    int valorMin1;
    int valorMin2;
    int valorMin3;
    @BeforeEach
    void setUp() {
        testearValor1 = -2;
        testearValor2 = 0;
        testearValor3 = -7;

        valorMax1 = -1;
        valorMax2 = 3;
        valorMax3 = -1;

        valorMin1 = -4;
        valorMin2 = 0;
        valorMin3 = -4;
    }
    @AfterEach
    void tearDown() {
    }
    @org.junit.jupiter.api.Test
    void validarRangoNumeroTest() {
        assertTrue(Menu.validarRangoNumero(testearValor1,valorMin1,valorMax1));
        assertTrue(Menu.validarRangoNumero(testearValor2,valorMin2,valorMax2));
        assertFalse(Menu.validarRangoNumero(testearValor3,valorMin3,valorMax3));
    }
}