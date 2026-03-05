package app;
import models.Biblioteca;
public class Main {

    static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        biblioteca.cadastrarPubli();
        biblioteca.realizarEmprestimo();

    }

}