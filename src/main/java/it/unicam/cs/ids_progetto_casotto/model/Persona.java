package it.unicam.cs.ids_progetto_casotto.model;

public abstract class Persona {

    private int id;
    private final String nome;
    private final String cognome;
    private final String annoNascita;
    private final char sesso;
    private String email;

    public Persona(int id, String nome, String cognome, String annoNascita, char sesso, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
        this.email = email;
    }

  /*  @Override
    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    @Override
    public String getNomeUtente() {
        return this.nome;
    }

    @Override
    public String getCognomeUtente() {
        return this.cognome;
    }

    @Override
    public String getAnnoNascita() {
        return this.annoNascita;
    }

    @Override
    public char getSesso() {
        return this.sesso;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

   */
}
