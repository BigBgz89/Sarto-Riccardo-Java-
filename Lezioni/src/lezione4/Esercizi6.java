package lezione4;

import java.util.Scanner;

public class Esercizi6 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int numero = tastiera.nextInt();

        if (numero %2==0)
            System.out.println("il doppio del numero è : "+ (numero*2));

        else System.out.println("la metà del numero è: "+ (numero/2.0));
        tastiera.close();
    }
    }

