package lezione5;

public class EsempioBottiglia {
    public static void main(String[] args) {
        Bottiglia b1 = new Bottiglia(1500);
        // b1.quantita = 1;
        //  System.out.println(b1.quantita);
        //  System.out.println(b1.capacita);
        System.out.println(b1);
        b1.riempi(5);
        System.out.println(b1);
        b1.svuota(1000);
        System.out.println(b1);
        // b1.quantita = 9999999;
        System.out.println(b1);
        Bottiglia b2 = new Bottiglia(500);
        b2.riempi(5);
        b2.svuota(6);
    }
}
