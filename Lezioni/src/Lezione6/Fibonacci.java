package Lezione6;
//@author Riccardo Sarto
//Fibonacci: Implementa un metodo statico ricorsivo che restituisce l'n-esimo numero della sequenza di Fibonacci.
// Nella sequenza di Fibonacci, ogni numero è la somma dei due precedenti, con i primi due numeri che sono 0 e 1.
// Il metodo dovrebbe prendere un indice n come parametro e restituire il numero di Fibonacci corrispondente.
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }// end

    public static void main(String[] args) {
        int n = 10;
        int risultato = fibonacci(n);
        System.out.println("Il " + n + "-esimo numero di Fibonacci è: " + risultato);
    }//end main
}//end class
