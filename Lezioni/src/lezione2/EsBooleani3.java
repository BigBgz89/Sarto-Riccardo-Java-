package lezione2;

import java.util.Scanner;

public class EsBooleani3 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un anno: ");
        int anno = Integer.parseInt(tastiera.nextLine());
        boolean condizione = (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
        System.out.println(condizione);
    }
}
