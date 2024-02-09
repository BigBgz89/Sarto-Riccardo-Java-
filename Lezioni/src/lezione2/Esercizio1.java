package lezione2;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire due numeri
        System.out.print("Inserisci il primo numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double numero2 = scanner.nextDouble();

        // Chiedi all'utente di scegliere un'operazione matematica
        System.out.println("Scegli un'operazione matematica:");
        System.out.println("1. Addizione");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        System.out.println("5. Modulo");
        System.out.print("Scelta: ");
        int scelta = scanner.nextInt();

        double risultato = 0;

        // Calcola il risultato in base alla scelta dell'utente
        switch (scelta) {
            case 1:
                risultato = numero1 + numero2;
                break;
            case 2:
                risultato = numero1 - numero2;
                break;
            case 3:
                risultato = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    risultato = numero1 / numero2;
                } else {
                    System.out.println("Errore: divisione per zero!");
                    return;
                }
                break;
            case 5:
                risultato = numero1 % numero2;
                break;
            default:
                System.out.println("Scelta non valida!");
                return;
        }

        // Stampa il risultato
        System.out.println("Il risultato dell'operazione è: " + risultato);

        scanner.close();
    }
}



