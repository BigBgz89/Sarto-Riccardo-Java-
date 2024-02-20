package lezione3;

import java.util.Scanner;

public class EsercIterazioni {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero = tastiera.nextInt();
        if (numero % 2 == 0) {
            System.out.println("PARI");
        } else {
            System.out.println("DISPARI");
        }
    }
}
