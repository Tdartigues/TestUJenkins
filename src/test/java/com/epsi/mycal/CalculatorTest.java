package com.epsi.mycal;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Before
    public void setUp() throws Exception{

    }
    @After
    public void tearDown() {

    }
    @Test
    public void testAdd() throws Exception{
        int a = 2;
        int b = 3;
        Calculator calc = new Calculator();
        int actual = calc.add(a,b);

        assertEquals(5, actual);
    }
    @Test
    public void testSub() throws Exception{
        int a = 4;
        int b = 2;
        Calculator calc = new Calculator();
        int actual = calc.sub(a,b);

        assertEquals(2, actual);
    }
    @Test
    public void testMult() throws Exception {
        int a = 3;
        int b = 2;
        Calculator calc = new Calculator();
        int actual = calc.mult(a,b);

        assertEquals(6, actual);
    }

}