package it.unicam.cs.ids_progetto_casotto.model.attivita;


import it.unicam.cs.ids_progetto_casotto.controller.controller_attivita.ControllerAttivita;
import it.unicam.cs.ids_progetto_casotto.model.User;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe che rappresenta una prenotazione
 * del cliente che viene gestita da
 * {@link ControllerAttivita} e
 */

@Entity
@Getter
@Setter
@Table(name = "prenotazione")
public class Prenotazione {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToOne(targetEntity = User.class)
    private User user;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(targetEntity = Event.class, cascade = CascadeType.ALL)
    private Set<Event> eventiPrenotatiList;

    public Prenotazione() {
        eventiPrenotatiList = new HashSet<>();
    }


}
