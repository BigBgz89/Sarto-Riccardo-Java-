package lezione3;

import java.util.ArrayList;
import java.util.Scanner;

public class Eserciterazioni2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        ArrayList<Integer> temperaturePrecedenti = new ArrayList<>();
        System.out.print("Inserire N Temperature: ");
        int numeroTemperature = tastiera.nextInt();

        int minimo = Integer.MAX_VALUE;
        int massimo = Integer.MIN_VALUE;
        int somma = 0;

        for (int i = 0; i < numeroTemperature; i++) {
            System.out.print("Inserisci temperatura " + (i + 1) + ": ");
            int temperatura = tastiera.nextInt();
            temperaturePrecedenti.add(temperatura);
            if (temperatura < minimo) {
                minimo = temperatura;
            }
            if (temperatura > massimo) {
                massimo = temperatura;
            }
            somma += temperatura;
        }
        System.out.println("temeprature maggiori di 10 gradi ");
        for (int temperatura : temperaturePrecedenti){
            if (temperatura > 10) {
                System.out.println(temperatura);
            }
        }

        double media = (double) somma / numeroTemperature;

        System.out.println("Temperatura minima: " + minimo);
        System.out.println("Temperatura massima: " + massimo);
        System.out.println("Media delle temperature: " + media);
    }
}
