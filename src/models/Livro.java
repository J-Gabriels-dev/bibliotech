package models;

import interfaces.Publicacoes;

public class Livro implements Publicacoes {
    private boolean renovavel; // -Renovavel:bool

    private String titulo = "";
    private String autor = "";
    private bool disponivel;
    private static int id = 0;

    public Livro(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
        renovavel = true;
        disponivel = true;
        id++;
    }

    @Override
    public void calcularPrazo(Pessoa pessoa,int dias) {
        int multaDiaria = 1.5;
        double multaUsuario = multaDiaria * dias;

        System.out.printf("Valor total da multa:%f\nDo usuario:%s",pessoa.ge
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public bool getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(bool disponivel) {
        this.disponivel = disponivel;
    }
}
