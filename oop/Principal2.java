package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Principal2 {
    public static void main(String[] argv) {
        
        int [] tableau = new int[2];
        var scanner = new Scanner(in);

        try {
            System.out.print("The first number: ");
            tableau[0] = scanner.nextInt();

            System.out.print("The index number: ");
            tableau[1] = scanner.nextInt();

            System.out.printf("%d + %d = %d\n", tableau[0], tableau[1], tableau[0] + tableau[1]);
            System.out.printf("%d\n", tableau[tableau[1]]);
        } catch (InputMismatchException e) {
            System.out.printf("Bad input! %s", e.getMessage());
        } finally {
            System.out.println("Executee dans tout les cas");
        }
    }
}
