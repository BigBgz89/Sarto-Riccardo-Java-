package lezione4;

import java.util.Scanner;

public class esercizi7 {
    public static void main(String[] args) {
        int somma =0;

        for(int i=1; i <= 100; i++ ){
            if(i %2==0 || i % 5==0){
                somma+= i;
            }
        }
        System.out.println("La somma dei numeri da 1 a 100 pari o divisibili per 5 è: " + somma);

    }
}
