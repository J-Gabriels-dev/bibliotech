package models;

import interfaces.Publicacoes;

public class Revista implements Publicacoes {
    private  boolean renovavel;

    private String titulo = "";
    private String autor = "";
    private int id = 0;

    public Revista(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
        renovavel = false;
        id++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void calcularPrazo(int dias) {
        int multaDiaria = 1.5;
        double multaUsuario = multaDiaria * dias;

        System.out.printf("Valor total da multa:%f",multaUsuario);
    }
}
