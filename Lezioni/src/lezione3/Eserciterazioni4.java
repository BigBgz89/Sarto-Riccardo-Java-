package lezione3;

import java.util.Scanner;

public class Eserciterazioni4 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner (System.in);
        System.out.println("inserisci il tuo nome: ");
        String nome = tastiera.nextLine();

        System.out.println("Il tuo nome al contrario è: ");
        for (int i = nome.length() -1; i >=0; i--){
            System.out.println(nome.substring(i,i+1));
        }

    }
}
