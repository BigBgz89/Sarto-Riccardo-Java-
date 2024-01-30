import java.util.Scanner;
public class EsercizioInput {
    public static void main(String args[]) {
        Scanner tastiera = new Scanner(System.in);// chiedi nome ed età, l'età deve essere il doppio
        System.out.println("Quanti anni hai? : ");
       int eta = Integer.parseInt(tastiera.nextLine());
       String nome = tastiera.nextLine();
       eta = eta*2;
       System.out.println("Ciao " + eta );
       String numero = "1";
       int a = Integer.parseInt(numero);
       //calocla l'area del rettangolo

       double n1 = (double)a;  // metodo per castare 
       char c = 'A';
       int n2 = (int)c;
       System.out.println(n2);

    }
}