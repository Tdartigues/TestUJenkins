package com.epsi.mycal;

/**
 * Classe Calculator.
 */
public class Calculator {

  /**
   * Addition method.
   *
   * @param number1 number 1 to add
   * @param number2 number 2 to add
   * @return the result of the operation
   */
  public double add(double number1, double number2) {

    return number1 + number2;
  }

  /**
   * Substraction method.
   *
   * @param number1 number 1 to sub
   * @param number2 number 2 to sub
   * @return the result of the operation
   */
  public double sub(double number1, double number2) {

    return number1 - number2;
  }

  /**
   * Multiplie method.
   *
   * @param number1 number 1 to mult
   * @param number2 number 2 to mult
   * @return the result of the operation
   */
  public double mult(double number1, double number2) {
    return number1 * number2;

  }

  /**
   * Division methode.
   *
   * @param number1 number 1 to div
   * @param number2 number 2 to div
   * @return the result of the operation
   */
  public double div(double number1, double number2) {
    return number1 / number2;
  }

  /**
   * Pair methode.
   *
   * @param number1 number to cheak
   * @return True if odd, false if not
   */
  public boolean pair(int number1) {
    return (number1 % 2) == 0;
  }

  /**
   * Prime methode.
   *
   * @param number1 number to cheak
   * @return True if prime, false if not
   */
  public boolean prime(int number1) {
    // 1 is not prime
    if (number1 <= 1) {
      return false;
    }

    // 2 is prime
    if (number1 == 2) {
      return true;
    }

    //Odd number are never prime
    if (number1 % 2 == 0) {
      return false;
    }

    //Looking for other number
    for (int i = 3; i * i <= number1; i += 2) {
      if (number1 % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Find a sub number in a number.
   *
   * @param number    number
   * @param subNumber sub number to find
   * @return True if sub number is in number, else false
   */
  public boolean find(int number, byte subNumber) {
    if (subNumber < 0 || subNumber > 9) {
      return false;
    }
    String sbnumber = Integer.toString(number);
    return sbnumber.contains(Byte.toString(subNumber));
  }
}
