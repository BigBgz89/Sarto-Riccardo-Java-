package lezione4;

import java.util.ArrayList;
import java.util.List;

public class esercizi9 {

    public static void main(String[] args) {
        // Esercizio 1
        System.out.println(min(1, 2)); // Output: 1

        // Esercizio 2
        System.out.println(contrario("Filippo")); // Output: oppiliF

        // Esercizio 3
        List<Integer> rangeList = range(5);
        System.out.println(rangeList); // Output: [0, 1, 2, 3, 4]

        // Esercizio 4
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        stampa(numbers); // Output: Lista [1 2 3 4 5]
    }

    // Esercizio 1
    public static int min(int x, int y) {
        return Math.min(x, y);
    }

    // Esercizio 2
    public static String contrario(String n) {
        StringBuilder reversed = new StringBuilder();
        for (int i = n.length() - 1; i >= 0; i--) {
            reversed.append(n.charAt(i));
        }
        return reversed.toString();
    }

    // Esercizio 3
    public static List<Integer> range(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(i);
        }
        return result;
    }

    // Esercizio 4
    public static void stampa(List<Integer> list) {
        StringBuilder sb = new StringBuilder("Lista [ ");
        for (Integer num : list) {
            sb.append(num).append(" ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
