package models;


public class Livro extends  Publicacoes {
    private boolean renovavel; // -Renovavel:bool

    private String titulo = "";
    private Autor autor;
    private Boolean disponivel;
    private static int id = 0;

    public Livro(String titulo,Autor autor){
        this.titulo = titulo;
        this.autor = autor;
        renovavel = true;
        disponivel = true;
        id++;
    }

    @Override
    public void calcularPrazo(Pessoa pessoa,int dias) {
        double multaDiaria = 1.5;
        double multaUsuario = multaDiaria * dias;

        System.out.printf("Valor total da multa:%f\nDo usuario:%s",multaUsuario,pessoa.getNome());
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public String getTituloLivro() {
        return titulo;
    }


    public Autor getAutor() {
        return autor;
    }

    
}
