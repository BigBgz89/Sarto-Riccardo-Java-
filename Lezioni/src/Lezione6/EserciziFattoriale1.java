package Lezione6;
/*
* @author Riccardo Sarto*/
//Fattoriale: Scrivi un metodo statico ricorsivo che calcola il fattoriale di un numero intero dato.
// Il fattoriale di un numero n (indicato con n!) è il prodotto di tutti i numeri interi positivi da 1 a n.
// Assicurati che il tuo metodo gestisca correttamente il caso base (il fattoriale di 0 è 1).
public class EserciziFattoriale1 {
    public static int fattoriale(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * fattoriale(x - 1);
        }
    }//end fattoriale

    public static void main(String[] args) {
        int numero = 5; // Esempio di numero per il quale calcolare il fattoriale
        int risultato = fattoriale(numero);
        System.out.println("Il fattoriale di " + numero + " è " + risultato);
    }//end main
}//end class
