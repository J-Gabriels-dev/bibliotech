package app;
import models.Biblioteca;
public class Main {

    static void main() {
        Biblioteca biblioteca = new Biblioteca();


        biblioteca.cadastrarPubli();
        biblioteca.realizarEmprestimo(null);

    }

}