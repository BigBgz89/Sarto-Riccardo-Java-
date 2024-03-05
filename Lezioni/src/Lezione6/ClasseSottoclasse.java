package Lezione6;
/*
* @author Riccardo Sarto
* Classe / sottoclasse
Crea le classi: Poligono, Rettangolo, Quadrato, Triangolo.
* Le classi Rettangolo, Quadrato e Triangolo devono essere sottoclassi di Poligono.
*  Creare gli attributi base, altezza per Rettangolo, Quadrato e Triangolo,  lato1, lato2, lato3 per Triangolo.
Tutte le forme devono avere i metodi area e perimetro.

Creare una List<Poligono> forme, inserire un triangolo, un quadrato, un rettangolo e calcolare la somma delle aree. */

import java.util.ArrayList;
import java.util.List;

abstract class Poligono {
    abstract double area();
    abstract double perimetro();
}

class Rettangolo extends Poligono {
    double base;
    double altezza;

    Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    double area() {
        return base * altezza;
    }

    @Override
    double perimetro() {
        return 2 * (base + altezza);
    }
}

class Quadrato extends Poligono {
    double lato;

    Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    double area() {
        return lato * lato;
    }

    @Override
    double perimetro() {
        return 4 * lato;
    }
}

class Triangolo extends Poligono {
    double lato1;
    double lato2;
    double lato3;

    Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    double area() {
        double semiperimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
    }

    @Override
    double perimetro() {
        return lato1 + lato2 + lato3;
    }
}

public class ClasseSottoclasse {
    public static void main(String[] args) {
        List<Poligono> forme = new ArrayList<>();

        forme.add(new Triangolo(3, 4, 5));
        forme.add(new Quadrato(4));
        forme.add(new Rettangolo(5, 6));

        double sommaAree = 0;
        for (Poligono forma : forme) {
            sommaAree += forma.area();
        }

        System.out.println("La somma delle aree è: " + sommaAree);
    }
}
