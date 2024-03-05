package Lezione6;
/*
* @author Riccardo Sarto
*Somma degli elementi di un array:
*  Scrivi un metodo statico ricorsivo che calcola la somma degli elementi di un array di interi.
* Il metodo dovrebbe prendere come parametri l'array e la sua lunghezza (o un indice che indica fino a quale punto dell'array calcolare la somma)
* e restituire la somma totale degli elementi.
* */
public class SommaArray {

    public static int somma(int[] array, int lunghezza) {
        // Caso base: se la lunghezza è 0, la somma è 0
        if (lunghezza == 0) {
            return 0;
        } else {

            return somma(array, lunghezza - 1) + array[lunghezza - 1];
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int lunghezza = array.length;
        int risultato = somma(array, lunghezza);
        System.out.println("La somma degli elementi dell'array è: " + risultato);
    }
}
