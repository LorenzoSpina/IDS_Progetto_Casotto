//package it.unicam.cs.ids_progetto_casotto.controller.controller_utenza;
//
//import it.unicam.cs.ids_progetto_casotto.model.utenza.*;
//
//import java.util.List;
//
///**
// * Interfaccia che permette di gestire le prenotazioni di un cliente
// */
//public interface IControllerClienteSpiaggia {
//
//    /**
//     * Metodo che restituisce una lista di utenze prenotate in un determinato periodo di tempo
//     *
//     * @param periodi i periodi presi in considerazione
//     * @return una lista di utenze prenotate in un determinato periodo di tempo
//     */
//    List<Utenza> getUtenze(Periodo periodi);
//
//    /**
//     * Metodo che restituisce una lista di di utenze prenotate in un determinato periodo di tempo, controllando anche la fascia oraria
//     * di prenotazione
//     *
//     * @param periodi i periodi presi in considerazione
//     * @param fasciaOraria la fascia oraria presa in considerazione
//     * @return una lista di di utenze prenotate in un determinato periodo di tempo, controllando anche la fascia oraria
//     *       di prenotazione
//     */
//    List<Utenza> getUtenze(Periodo periodi, FasciaOraria fasciaOraria);
//
//    /**
//     * metodo che resituisce le tariffe del Casotto
//     *
//     * @return la lista contente le tariffe del Casotto
//     */
//    List<Tariffa> getTariffe();
//
//    /**
//     * metodo che permette di creare la prenotazione effettuata dal cliente, al receptionist
//     *
//     * @param receptionist colui che riceve la notifica
//     * @param idCliente l'identificativo dell'utente
//     * @param permanenzaUtenza il periodo di permanenza del cliente
//     * @param utenza utenza da prenotare
//     * @param tariffa la tariffa selezionata dall'utente
//     * @return true o false se la creazione ha avuto successo o meno
//     */
//    boolean creaPrenotazioneCliente(IHandlerPrenotazioniUtenzeClienti receptionist, int idCliente, Periodo permanenzaUtenza, Utenza utenza, Tariffa tariffa);
//
//    /**
//     * metodo che permette di far eliminare la prenotazione dell'utenza effettuata dal cliente, al receptionist
//     *
//     * @param receptionist colui che riceve la notifica
//     * @param prenotazione la prenotazione da cancellare
//     * @return true o false se l'operazione ha avuto successo
//     */
//    boolean eliminaPrenotazione(IHandlerPrenotazioniUtenzeClienti receptionist, PrenotazioneUtenzaCliente prenotazione);
//}
