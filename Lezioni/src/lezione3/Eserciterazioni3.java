package lezione3;

import java.util.Scanner;

public class Eserciterazioni3 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int somma =0;
        int numero;
        System.out.println("Inserisci dei numeri (inserisci 0 per terminare):");
        while(true){
            System.out.println("Inserisci un numero: ");
            numero = tastiera.nextInt();
            if (numero ==0){
                break;
            }
            somma += numero;
        }
        System.out.println("La somma dei numeri inseriti è: " + somma);
    }
}
