package lezione2;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class EsBooleani1 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int n1 = Integer.parseInt(tastiera.nextLine());
        boolean condizione = n1 <= 5 && n1 >= 0;
        System.out.println(condizione);

    }
}
