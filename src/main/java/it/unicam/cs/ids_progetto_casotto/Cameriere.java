package it.unicam.cs.ids_progetto_casotto;

import java.util.List;

public class Cameriere extends StaffRistorazione{

    public Cameriere(String nome, int idStaff) {
        super(nome, idStaff);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getIdStaff() {
        return super.getIdStaff();
    }

    @Override
    public Comanda getOrdinazione(Comanda comanda, ControllerOrdinazione controller) {
        return super.getOrdinazione(comanda, controller);
    }

    @Override
    public List<Comanda> getOrdinazioni(ControllerOrdinazione controller) {
        return super.getOrdinazioni(controller);
    }

    /**
     * Riceve lo stato della comanda
     *
     * @param comanda
     * @return
     */
    public StatoComanda getStatoComanda(Comanda comanda){
        return comanda.getState();
    }

    /**
     * Imposta lo stato della comanda
     *
     * @param comanda
     * @param state
     */
    public void setStatoComanda(Comanda comanda, StatoComanda state){
        comanda.setState(state);
    }
}
