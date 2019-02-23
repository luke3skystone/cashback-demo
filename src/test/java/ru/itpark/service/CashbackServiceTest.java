package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculate() {
        // A-A-A
        // A- Arrange (подготовка)
        CashbackService service = new CashbackService();
        int cashback = service.calculate(1_000);
        assertEquals(50, cashback);
    }
    @Test
    void calculateOverLimit() {
        // A-A-A
        // A- Arrange (подготовка)
        CashbackService service = new CashbackService();
        int cashback = service.calculate(1_000_000);
        assertEquals(3_000, cashback);
    }
}