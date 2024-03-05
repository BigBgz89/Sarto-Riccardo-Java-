package Lezione6;
/*
* @author Riccardo Sarto
* Rovescia una stringa:
*  Crea un metodo statico ricorsivo che inverte una stringa.
* Il metodo dovrebbe prendere come parametro la stringa da invertire e restituire la stringa invertita.
* Per esempio, se il metodo riceve "java", dovrebbe restituire "avaj".
* */

public class ReverseString {

    public static String reverse(String str) {

        if (str.length() <= 1) {
            return str;
        } else {

            return reverse(str.substring(1)) + str.charAt(0);
        }
    }//end reverse base

    public static void main(String[] args) {
        String input = "java";
        String reversed = reverse(input);
        System.out.println("Stringa originale: " + input);
        System.out.println("Stringa invertita: " + reversed);
    }//end main
}//end class
