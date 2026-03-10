package models;

public abstract class Publicacoes {
    public String titulo;
    public Autor autor;
    public static int contadorId = 0; // Nome alterado para clareza
    public int id; // ID individual de cada livro
    public Boolean disponivel = true;
    public boolean renovavel;
    public Publicacoes() {

    }

    public abstract void calcularPrazo(Pessoa pessoa, int dias);

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }

    @Override
    public String toString() {
        return "ID: " + id + " | Título: " + this.titulo + " | Autor: " + this.autor.getNome();
    }

}