package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void countSquares() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int actual = service.countSquares(200, 300);
    }
    @Test
    void countSquaresA() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSquares(200, 300);
        assertEquals(expected, actual);
    }

}