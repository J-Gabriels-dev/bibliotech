package Models;

public class FactoryPublicacao {
    public static Publicacoes  createPubli(String type, String titulo, Autor autor) {
        switch (type) {
            case "livro":
                if (type.equalsIgnoreCase("livro")) {
                    return new Livro(titulo, autor);
                }
                return null;
            case "revista":
                if (type.equalsIgnoreCase("revista")) {
                    return new Revista(titulo, autor);
                }
                return null;
            default:
                throw new IllegalArgumentException("Argumento inválido ou não existe");
        }
    }
}