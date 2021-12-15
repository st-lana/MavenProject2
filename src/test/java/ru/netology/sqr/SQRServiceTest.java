package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void calculateSqr() {
        SQRService multyService = new SQRService();

        int down = 200;
        int up = 256;
        int expected = 2;
        int actual = multyService.calculateSqr(down, up);

        assertEquals(expected, actual);
    }
}