package lezione2;

public class Booleani {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println("NOT");
        System.out.println(a);
        System.out.println(!a);
        System.out.println(b);
        System.out.println(!b);
        System.out.println("AND");
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && a);
        System.out.println(b && b);
        System.out.println("OR");
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || a);
        System.out.println(b || b);
    }
}

