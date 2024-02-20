package lezione4;

import java.util.ArrayList;
import java.util.Iterator;

public class Esercizi8 {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Riccardo");
        nomi.add("Arman");
        nomi.add("Erik");
        nomi.add("Davide");
        nomi.add("Giorgio");
        nomi.add("Christian");
        nomi.add("Daniele");
        nomi.add("Luca");
        nomi.add("Antonio");
        nomi.add("Matteo");

        Iterator<String> iterator = nomi.iterator();

        while (iterator.hasNext()){
            String nome = iterator.next();
            char primaLettera = nome.toLowerCase().charAt(0);
            if(primaLettera == 'a' || primaLettera == 'e' || primaLettera == 'i' || primaLettera == 'o' || primaLettera == 'u'){

                iterator.remove();
            }
        }
        System.out.println("Nomi dopo la rimozione della vocale iniziale: ");
        for (String nome: nomi){
            System.out.println(nome);
        }
    }
}
