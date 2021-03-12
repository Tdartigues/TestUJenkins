package com.epsi.mycal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() {

  }

  @Test
  public void testAdd() throws Exception {
    int number1 = 2;
    int number2 = 3;
    Calculator calc = new Calculator();
    double actual = calc.add(number1, number2);

    assertEquals(5, actual);
  }

  @Test
  public void testSub() throws Exception {
    double number1 = 4;
    double number2
        = 2;
    Calculator calc = new Calculator();
    double actual = calc.sub(number1, number2
    );

    assertEquals(2, actual);
  }

  @Test
  public void testMult() throws Exception {
    double number1 = 3;
    double number2
        = 2;
    Calculator calc = new Calculator();
    double actual = calc.mult(number1, number2
    );

    assertEquals(6, actual);
  }

  @Test
  public void testDiv() throws Exception {
    double number1 = 8;
    double number2
        = 4;
    Calculator calc = new Calculator();
    double actual = calc.div(number1, number2
    );

    assertEquals(2, actual);
  }

  @Test
  public void testPair() throws Exception {
    int number1 = 8;
    Calculator calc = new Calculator();
    boolean actual = calc.pair(number1);

    assertTrue(actual);
  }

  @Test
  public void testNPair() throws Exception {
    int number1 = 7;
    Calculator calc = new Calculator();
    boolean actual = calc.pair(number1);

    assertFalse(actual);
  }

  @Test
  public void testPrime() throws Exception {
    int number1 = 5;
    Calculator calc = new Calculator();
    boolean actual = calc.prime(number1);

    assertTrue(actual);
  }

  @Test
  public void testNPrime() throws Exception {
    int number1 = 9;
    Calculator calc = new Calculator();
    boolean actual = calc.prime(number1);

    assertFalse(actual);
  }

  @Test
  public void testPrime1() throws Exception {
    int number1 = 1;
    Calculator calc = new Calculator();
    boolean actual = calc.prime(number1);

    assertFalse(actual);
  }

  @Test
  public void testPrime2() throws Exception {
    int number1 = 2;
    Calculator calc = new Calculator();
    boolean actual = calc.prime(number1);

    assertTrue(actual);
  }

  @Test
  public void testPrimeOdd() throws Exception {
    int number1 = 4;
    Calculator calc = new Calculator();
    boolean actual = calc.prime(number1);

    assertFalse(actual);
  }

  @Test
  public void testFind() throws Exception {
    int bNumber = 123456789;
    byte number = 1;
    Calculator calc = new Calculator();
    boolean actual = calc.find(bNumber, number);

    assertTrue(actual);
  }

  @Test
  public void testNFind() throws Exception {
    int bNumber = 23456789;
    byte number = 1;
    Calculator calc = new Calculator();
    boolean actual = calc.find(bNumber, number);

    assertFalse(actual);
  }

  @Test
  public void testOobUpFind() throws Exception {
    int bNumber = 123456789;
    byte number = 10;
    Calculator calc = new Calculator();
    boolean actual = calc.find(bNumber, number);

    assertFalse(actual);
  }

  @Test
  public void testOobDownFind() throws Exception {
    int bNumber = 123456789;
    byte number = -1;
    Calculator calc = new Calculator();
    boolean actual = calc.find(bNumber, number);

    assertFalse(actual);
  }

}