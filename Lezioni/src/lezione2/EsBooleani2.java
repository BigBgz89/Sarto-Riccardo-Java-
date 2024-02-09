package lezione2;

import java.util.Scanner;

public class EsBooleani2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int n1 = Integer.parseInt(tastiera.nextLine());
        boolean condizione = n1 %2==0;
        System.out.println(condizione);
    }
}
