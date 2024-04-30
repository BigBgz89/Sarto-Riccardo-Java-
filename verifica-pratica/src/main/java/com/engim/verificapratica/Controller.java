package com.engim.verificapratica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private static Sorteggio sorteggio = new Sorteggio();
    private static List<Squadra> squadrePartecipanti = new ArrayList<>();

    @GetMapping("/add")
    public void addSquadra(@RequestParam String nome, @RequestParam String nazione) {
        sorteggio.aggiungi(nome, nazione);
        squadrePartecipanti.add(new Squadra(nome, nazione));
    }

    @GetMapping("/getSquadreByNazione")
    public List<Squadra> getSquadreByNazione(@RequestParam String nazione) {
        List<Squadra> squadreByNazione = new ArrayList<>();
        for (Squadra squadra : sorteggio.getSquadre()) {
            if (squadra.getNazione().equalsIgnoreCase(nazione)) {
                squadreByNazione.add(squadra);
            }
        }
        return squadreByNazione;
    }

    @GetMapping("/sorteggiaSquadre")
    public List<Partita> sorteggiaSquadre() {
        List<Partita> partite = new ArrayList<>();
        int numSquadre = squadrePartecipanti.size();
        if (!isPotenzaDiDue(numSquadre)) {
            throw new RuntimeException("Il numero di squadre non è una potenza di due.");
        }
        while (squadrePartecipanti.size() > 1) {
            Squadra squadra1 = sorteggio.next();
            Squadra squadra2 = sorteggio.next();
            Partita partita = new Partita(squadra1, squadra2);
            partite.add(partita);
        }
        return partite;
    }

    private boolean isPotenzaDiDue(int num) {
        return (num & (num - 1)) == 0;
    }

    @GetMapping("/getPartite")
    public List<Partita> getPartite() {
        return sorteggiaSquadre();
    }
}
/*
 * ES 1: get ("/add?nome=n&nazione=m") che aggiunge al sorteggio una squadra con nome n e nazione m (utilizzare
 * la classe Sorteggio) - 15 p
 *
 * ES 2: get ("/listaSquadre?nazione=n") che restituisce la lista delle squadre di nazione n - 20 p
 *
 * ES 3: get ("/sorteggia") che restituisce 2 squadre di nazioni diverse (utilizzare la classe Sorteggio, il metodo
 * next. Consiglio: dopo aver sorteggiato la prima, continuare a sorteggiare finché la seconda
 * non è di una nazione diversa) - 20 p
 *
 * ES 4: implementare il sorteggio delle squadre di una fase finale di un torneo a eliminazione diretta.
 * Creare il metodo sorteggiaPartite che:
 * - controlla se il numero di squadre aggiunte è una potenza di 2. Se non lo è lancia una RuntimeException.
 * - Finché ci sono squadre non sorteggiate: sorteggia 2 squadre e le inserisce in un oggetto della classe Partita (da creare)
 * - restituisce la lista di Partite.
 * creare get ("/getPartite") che restituisce la lista appena creata - 30 p
 * */