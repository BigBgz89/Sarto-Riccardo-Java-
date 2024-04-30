package com.engim.verificapratica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    // Creiamo un'istanza della classe Sorteggio per gestire il sorteggio delle squadre
    private static Sorteggio sorteggio = new Sorteggio();

    // Creiamo una lista per memorizzare le squadre partecipanti
    private static List<Squadra> squadrePartecipanti = new ArrayList<>();

    // Metodo per aggiungere una squadra
    @GetMapping("/add")
    public void addSquadra(@RequestParam String nome, @RequestParam String nazione) {
        // Aggiungiamo la squadra al sorteggio e alla lista delle squadre partecipanti
        sorteggio.aggiungi(nome, nazione);
        squadrePartecipanti.add(new Squadra(nome, nazione));
    }

    // Metodo per ottenere la lista delle squadre di una determinata nazione
    @GetMapping("/getSquadreByNazione")
    public List<Squadra> getSquadreByNazione(@RequestParam String nazione) {
        // Creiamo una nuova lista per memorizzare le squadre della nazione specificata
        List<Squadra> squadreByNazione = new ArrayList<>();
        // Scandiamo tutte le squadre partecipanti
        for (Squadra squadra : sorteggio.getSquadre()) {
            // Se la nazione della squadra corrente corrisponde alla nazione specificata, la aggiungiamo alla lista
            if (squadra.getNazione().equalsIgnoreCase(nazione)) {
                squadreByNazione.add(squadra);
            }
        }
        return squadreByNazione;
    }

    
     //PER CORRETTEZZA TI VOLEVO AVVISARE CHE PER L'ULTIMA PARTE HO CERCATO SU INTERNET



    // Metodo per sorteggiare le squadre e creare le partite della fase finale del torneo
    @GetMapping("/sorteggiaSquadre")
    public List<Partita> sorteggiaSquadre() {
        // Creiamo una lista per memorizzare le partite
        List<Partita> partite = new ArrayList<>();
        // Verifichiamo se il numero di squadre è una potenza di due(ho usato l'aiuto di google)
        int numSquadre = squadrePartecipanti.size();
        if (!isPotenzaDiDue(numSquadre)) {
            throw new RuntimeException("Il numero di squadre non è una potenza di due.");
        }
        // Continuiamo a sorteggiare finché ci sono squadre non sorteaggiate
        while (squadrePartecipanti.size() > 1) {
            Squadra squadra1 = sorteggio.next();
            Squadra squadra2 = sorteggio.next();
            Partita partita = new Partita(squadra1, squadra2);
            partite.add(partita);
        }
        return partite;
    }

    // Metodo  per verificare se un numero è una potenza di due (trovato su internet per far quadrare)
    private boolean isPotenzaDiDue(int num) {
        return (num & (num - 1)) == 0;
    }

    // Metodo per ottenere la lista di partite appena sorteggiate
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