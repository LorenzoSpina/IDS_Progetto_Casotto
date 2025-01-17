package it.unicam.cs.ids_progetto_casotto.model.ordinazione;

import org.springframework.lang.NonNull;
import javax.persistence.*;

/**
 * Classe astratta rappresentante una generica consumazione
 */
@Entity
@Table(name = "ArticoloBar")
public class Consumazione {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Integer id;

    @NonNull
    @Column(unique = true)
    private String nome;

    @Column(length = 500)
    private double prezzo;

    public Consumazione(){
    }

    /**
     * Ritorna l'id della consumazione
     *
     * @return l'id della consumazione
     */
     public Integer getId(){
         return this.id;
     }

    /**
     * Ritorna il nome della consumazione
     *
     * @return nome consumazione
     */
    public String getNome(){
        return this.nome;
    }

    /**
     * Metodo che modifica il nome della consumazione
     *
     * @param nome il nome con la quale si vuole modificare
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Ritorna il costo del prodotto
     *
     * @return costo consumazione
     */
    public double getPrezzo() {
        return this.prezzo;
    }

    /**
     * Metodo che modifica il prezzo della consumazione
     *
     * @param prezzo il prezzo con il quale si vuole modificare
     */
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

}
