package org.example.Exo1;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer le premier nombre :");
        int nbre1 = scanner.nextInt();

        System.out.println("Veuillez entrer le deuxième nombre :");
        int nbre2 = scanner.nextInt();

        try {
            int result = nbre1 / nbre2;
            System.out.println("Le résultat est : " + result);
        } catch (ArithmeticException e) {
            System.out.println("pas de division par zero !!!");
        }
    }
}
