package models;

public class Revista extends  Publicacoes {
    private  boolean renovavel;

    private String titulo = "";
    private Autor autor;
    private Boolean disponivel;
    private int id = 0;

    public Revista(String titulo,Autor autor){
        this.titulo = titulo;
        this.autor = autor;
        renovavel = false;
        id++;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + " | Autor: " + this.autor.getNome();
    }

    public String getTituloRevista() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public Autor getAutorRevista() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void calcularPrazo(Pessoa pessoa,int dias) {
        double multaDiaria = 1.5;
        double multaUsuario = multaDiaria * dias;

        System.out.printf("Valor total da multa:%f",multaUsuario);
    }

    public Autor getAutor() {
        return autor;
    }
}
