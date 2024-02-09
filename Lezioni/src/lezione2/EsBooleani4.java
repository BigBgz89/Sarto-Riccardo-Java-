package lezione2;

import java.util.Scanner;

public class EsBooleani4 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String nomeUtente = tastiera.nextLine();
        String password = tastiera.nextLine();
        boolean condizione = nomeUtente.equals("utente") && password.equals("password");
        System.out.println(condizione);

        if (condizione){
            System.out.println("Messaggio segreto");

        }else if (condizione){
            System.out.println("User e/o password errati");

        }else{
            System.out.println("Ciao");
        }
        }
    }

