package Lezione2;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
       int n1 = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci un numero: ");
        int n2 = Integer.parseInt(tastiera.nextLine());
        int somma = n1 + n2;
        System.out.println("La somma è: "+ somma);
    }
}
