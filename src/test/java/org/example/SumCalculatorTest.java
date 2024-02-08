package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private  SumCalculator sumCalculator;

    @BeforeEach
     void init(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumOneTest () throws Exception {
        int resultSumOneAct = sumCalculator.sum(1);
        int resultSumOneExp = 1;

        assertEquals(resultSumOneAct, resultSumOneExp);


    }
    @Test
    void sumThreeTest() throws Exception {
        int resultSumThreeAct = sumCalculator.sum(3);
        int resultSumThreeExp = 6;

        assertEquals(resultSumThreeAct, resultSumThreeExp);

    }

    @Test
    void sumZeroTest() throws Exception {

        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}