package it.unicam.cs.ids_progetto_casotto.model.utenza;

import it.unicam.cs.ids_progetto_casotto.controller.controller_utenza.PeriodoUtenze;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe che definisce una generica
 * classe Utenza
 */
@Entity
@Table(name = "utenza")
public class Utenza {

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(updatable = false)
    private Tipo tipo;

    @Column(updatable = false)
    private int numeroPostiOccupabili;

    @ManyToMany(mappedBy = "utenze_di")
    private List<PeriodoUtenze> periodi = new ArrayList<>();

    public Utenza(){}

    /**
     * Metodo che ritorna l'id
     * dell'utenza
     *
     * @return id dell'utenza
     */
    public Integer getId(){
        return this.id;
    }

    public Tipo getTipo() { return this.tipo; }

    public void setTipo(Tipo tipo) { this.tipo = tipo; }

    /**
     * Metodo che ritorna il
     * numero di posti occupabili
     *
     * @return numero di posti
     * occupabili
     */
    public int getNumeroPostiOccupabili(){ return this.numeroPostiOccupabili; }

    public void setNumeroPostiOccupabili(int numeroPostiOccupabili) {
        this.numeroPostiOccupabili = numeroPostiOccupabili;
    }
}
