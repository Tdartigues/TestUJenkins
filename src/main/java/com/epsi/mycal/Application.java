package com.epsi.mycal;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
  /**
   * Main Application Calc.
   *
   * @param args Unuse
   */
  public static void main(String[] args) {
    System.out.println("Bienvenue sur la Calculatrice Console !");
    System.out.println("C'est partie !");

    List<String> histo = new ArrayList<>();
    char operationChoisie = ' ';
    while (operationChoisie != 'Q') {
      System.out.println("Choisie l'opération que tu veux faire :");
      System.out.println("Tape A pour l'addition,"
          + " tape M pour la multiplication,"
          + " tape S pour la soustraction,"
          + " tape D pour la division,"
          + " tape P pour les chiffres premier"
          + " et O pour les chiffres paires.");
      System.out.println("Q Pour Quitter");
      Scanner sc = new Scanner(System.in, Charset.defaultCharset());
      operationChoisie = sc.nextLine().charAt(0);

      Calculator calc = new Calculator();
      if (operationChoisie == 'A') {

        System.out.println("Entrez le premier nombre :");
        double number1 = sc.nextDouble();
        System.out.println("Entrez le nombre à soustraire :");
        double number2 = sc.nextDouble();

        double result = calc.add(number1, number2);
        System.out.println(number1 + " + " + number2 + " = " + result);
        histo.add(number1 + " + " + number2 + " = " + result);

      } else if (operationChoisie == 'M') {

        System.out.println("Entrez le premier nombre :");
        double number1 = sc.nextDouble();
        System.out.println("Entrez le nombre multiplicateur :");
        double number2 = sc.nextDouble();

        double result = calc.mult(number1, number2);
        System.out.println(number1 + " * " + number2 + " = " + result);
        histo.add(number1 + " * " + number2 + " = " + result);

      } else if (operationChoisie == 'S') {

        System.out.println("Entrez le premier nombre :");
        double number1 = sc.nextDouble();
        System.out.println("Entrez le nombre à soustraire :");
        double number2 = sc.nextDouble();

        double result = calc.sub(number1, number2);
        System.out.println(number1 + " - " + number2 + " = " + result);
        histo.add(number1 + " - " + number2 + " = " + result);

      } else if (operationChoisie == 'D') {

        System.out.println("Entrez le premier nombre :");
        double number1 = sc.nextDouble();
        System.out.println("Entrez le nombre diviseur :");
        double number2 = sc.nextDouble();

        double result = calc.div(number1, number2);
        System.out.println(number1 + " / " + number2 + " = " + result);
        histo.add(number1 + " / " + number2 + " = " + result);

      } else if (operationChoisie == 'P') {

        System.out.println("Entrez le premier nombre :");
        int number1 = sc.nextInt();

        boolean result = calc.prime(number1);

        if (result) {
          System.out.println(number1 + " est premier");
          histo.add(number1 + " est premier");
        } else {
          System.out.println(number1 + " n'est pas premier");
          histo.add(number1 + " n'est pas premier");
        }


      } else if (operationChoisie == 'O') {

        System.out.println("Entrez le premier nombre :");
        int number1 = sc.nextInt();

        boolean result = calc.pair(number1);
        if (result) {
          System.out.println(number1 + " est paire");
          histo.add(number1 + " est paire");
        } else {
          System.out.println(number1 + " n'est pas paire");
          histo.add(number1 + " n'est pas paire");
        }

      } else if (operationChoisie == 'Q') {
        System.out.println("Fin");
      } else if (operationChoisie == 'H') {
        for (String stringhisto : histo) {
          System.out.println(stringhisto);
        }
      } else {
        System.out.println("Mauvais caractère");
      }
    }
  }

}
