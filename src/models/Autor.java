package models;

public class Autor{

    
    private String nome;
    private static int id = 0;

    public Autor() {

    }

    public Autor(String nome) {

        this.nome = nome;
        id++;
    }

    public String toString() {
        return "| Autor: " + this.nome;
    }

    public static int getId() {
        return id;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}