package models;

// Interface com atributos públicos
public abstract class Publicacoes {
    // Nota: Em Java, atributos em interfaces são 'public static final'
    public  String titulo = "";
    public  String autor = "";
    public  static int id = 0;
    public Boolean disponivel;

    private Autor actor;
    public abstract void calcularPrazo(Pessoa pessoa,int dias);

    @Override
    public String toString() {
        return "Título: " + this.titulo + " | Autor: " + this.actor.getNome();
    }
}

