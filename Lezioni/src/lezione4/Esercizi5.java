package lezione4;

import java.util.Scanner;

public class Esercizi5 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il primo numero con la virgola: ");
        double numero1 = tastiera.nextDouble();

        System.out.println("Inserisci il secondo numero con la virgola: ");
        double numero2 = tastiera.nextDouble();

        double somma = numero1 + numero2;

        System.out.println("La somma è: " + somma);

        tastiera.close();
    }
}
