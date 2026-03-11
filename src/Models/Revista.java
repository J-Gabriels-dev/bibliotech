package Models;

public class Revista extends Publicacoes {
    private boolean renovavel;


    public Revista(String titulo, Autor autor) {

        this.titulo = titulo;
        this.autor = autor;
        this.renovavel = false;
        this.disponivel = true; // Definindo como disponível ao cadastrar
        id++;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + " | Autor: " + (this.autor != null ? this.autor.getNome() : "Desconhecido");
    }

    public int getId() {
        return id;
    }

    @Override
    public void calcularPrazo(Pessoa pessoa, int dias) {
        double multaDiaria = 1.5;
        double multaUsuario = multaDiaria * dias;

        System.out.printf("Valor total da multa: %f", multaUsuario);
    }
}