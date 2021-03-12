package com.epsi.mycal;

import java.util.Scanner;

public class Application {
  /**
   * Main Application Calc.
   * @param args Unuse
   */
  public static void main(String[] args) {

    System.out.println("Bienvenue sur la Calculatrice Console !");
    System.out.println("C'est partie !");
    System.out.println("Choisie l'opération que tu veux faire :");
    System.out.println("Tape A pour l'addition,"
        + " tape M pour la multiplication,"
        + " tape S pour la soustraction,"
        + " tape D pour la division,"
        + " tape P pour les chiffres premier"
        + " et O pour les chiffres paires");
    Scanner sc = new Scanner(System.in);
    char operationChoisie = sc.nextLine().charAt(0);

    Calculator calc = new Calculator();
    if (operationChoisie == 'A') {

      System.out.println("Entrez le premier nombre :");
      double number1 = sc.nextDouble();
      System.out.println("Entrez le nombre à soustraire :");
      double number2 = sc.nextDouble();

      double result = calc.add(number1, number2);
      System.out.println("Le résultat est : " + result);


    } else if (operationChoisie == 'M') {

      System.out.println("Entrez le premier nombre :");
      double number1 = sc.nextDouble();
      System.out.println("Entrez le nombre multiplicateur :");
      double number2 = sc.nextDouble();

      double result = calc.mult(number1, number2);
      System.out.println("Le résultat est : " + result);

    } else if (operationChoisie == 'S') {

      System.out.println("Entrez le premier nombre :");
      double number1 = sc.nextDouble();
      System.out.println("Entrez le nombre à soustraire :");
      double number2 = sc.nextDouble();

      double result = calc.sub(number1, number2);
      System.out.println("Le résultat est : " + result);

    } else if (operationChoisie == 'D') {

      System.out.println("Entrez le premier nombre :");
      double number1 = sc.nextDouble();
      System.out.println("Entrez le nombre diviseur :");
      double number2 = sc.nextDouble();

      double result = calc.div(number1, number2);
      System.out.println("Le résultat est : " + result);

    } else if (operationChoisie == 'P') {

      System.out.println("Entrez le premier nombre :");
      int number1 = sc.nextInt();

      boolean result = calc.prime(number1);
      System.out.println("Le résultat est : " + result);

    } else if (operationChoisie == 'O') {

      System.out.println("Entrez le premier nombre :");
      int number1 = sc.nextInt();

      boolean result = calc.pair(number1);
      System.out.println("Le résultat est : " + result);

    } else {
      System.out.println("Erreur !");
    }

  }

}
