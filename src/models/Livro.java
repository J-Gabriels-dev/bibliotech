package models;

public class Livro extends Publicacoes {

    public Livro(String titulo, Autor autor) {
        super();

        this.titulo = titulo;
        this.autor = autor;
        this.renovavel = true;
        this.disponivel = true;
        id++;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + " | Autor: " + this.autor.getNome();
    }

    @Override
    public void calcularPrazo(Pessoa pessoa, int dias) {
        double multaDiaria = 1.5;
        double multaUsuario = multaDiaria * dias;
        System.out.printf("Valor total da multa: %f\nDo usuario: %s", multaUsuario, pessoa.getNome());
    }


    public Boolean getDisponivel() {
        return disponivel;
    }

}