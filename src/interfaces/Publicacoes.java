package interfaces;

// Interface com atributos públicos
public interface Publicacoes {
    // Nota: Em Java, atributos em interfaces são 'public static final'
    public String titulo = "";
    public String autor = "";
    public static int id = 0;


    void calcularPrazo();
}

