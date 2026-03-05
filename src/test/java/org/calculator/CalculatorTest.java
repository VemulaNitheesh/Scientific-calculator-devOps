package org.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    /* ---------------- Square Root Tests ---------------- */

    @Test
    void testSquareRootValid() {
        assertEquals(5.0, calc.squareRoot(25));
    }

    @Test
    void testSquareRootZero() {
        assertEquals(0.0, calc.squareRoot(0));
    }

    @Test
    void testSquareRootFraction() {
        assertEquals(1.5, calc.squareRoot(2.25));
    }

    @Test
    void testSquareRootNegative() {
        assertTrue(Double.isNaN(calc.squareRoot(-9)));
    }

    /* ---------------- Factorial Tests ---------------- */

    @Test
    void testFactorialValid() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testFactorialOne() {
        assertEquals(1, calc.factorial(1));
    }

    @Test
    void testFactorialLarge() {
        assertEquals(3628800, calc.factorial(10));
    }

    /* ---------------- Power Tests ---------------- */

    @Test
    void testPowerValid() {
        assertEquals(8.0, calc.power(2,3));
    }

    @Test
    void testPowerZeroExponent() {
        assertEquals(1.0, calc.power(5,0));
    }

    @Test
    void testPowerZeroBase() {
        assertEquals(0.0, calc.power(0,5));
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.25, calc.power(2,-2));
    }

    /* ---------------- Natural Log Tests ---------------- */

    @Test
    void testNaturalLogValid() {
        assertEquals(0.0, calc.naturalLog(1));
    }

    @Test
    void testNaturalLogE() {
        assertEquals(1.0, calc.naturalLog(Math.E), 0.0001);
    }

    @Test
    void testNaturalLogFraction() {
        assertEquals(Math.log(0.5), calc.naturalLog(0.5), 0.0001);
    }

    @Test
    void testNaturalLogZero() {
        assertTrue(Double.isInfinite(calc.naturalLog(0)));
    }

    @Test
    void testNaturalLogNegative() {
        assertTrue(Double.isNaN(calc.naturalLog(-5)));
    }
}