package models;

public class Revista extends  Publicacoes {
    private  boolean renovavel;

    private String titulo = "";
    private Autor autor = "";
    private int id = 0;

    public Revista(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
        renovavel = false;
        id++;
    }

    public String getTituloRevista() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public String getAutorRevista() {
        return autor;
    }

    public void setAutor(String autor) {
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
}
