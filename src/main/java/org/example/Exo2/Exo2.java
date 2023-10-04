package org.example.Exo2;


import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer une chaîne de caractère");
        String str = scanner.nextLine();

        try {
            int nbre = Integer.parseInt(str);
            System.out.println("Le nombre est :" +nbre);
        }catch (NumberFormatException e){
            System.out.println("Ceci n'est pas une chaîne de caractère");
        }
    }
}
