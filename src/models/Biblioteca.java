package models;

import interfaces.Publicacoes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {

    Scanner sc = new Scanner(System.in);
    protected List<Publicacoes> publiCadastradas = new ArrayList<>();
    // Método para realizar o empréstimo de uma publicação
    public void realizarEmprestimo() {

        string nomeDolivro;
        System.out.println("Digite o nome do livro desejado:");
        nomeDolivro = sc.nextLine();
    }

    // Método para cadastrar novos livros ou revistas no acervo
    public void cadastrarPubli() {
        String titulo,autor;
        int continuar,opcao;
        do {
            System.out.println("Digite o nome da publicação:");
            titulo = sc.nextLine();
            System.out.println("Digite o nome da autor:");
            autor = sc.nextLine();
            System.out.println("\n");
            System.out.println("Deseja cadastrar essa publicação como:1-Livro\n2-Revista:");
            opcao = sc.nextInt();
            if (veri_livro_revista(opcao,titulo,autor) == Livro){
                publiCadastradas.add(criarLivro(titulo, autor));
            }
            publiCadastradas.add(criarLivro(titulo, autor));
            System.out.println("\n");
            System.out.println("Deseja cadastrar outra publicação:1-Sim\n0-Não");
            continuar = sc.nextInt();
            if (continuar == 1){
                continue;
            }
            break;
        }while(continuar != 0);
    }

    // Método para registrar a devolução de um item
    public void devolverLivro() {
        // Lógica para atualizar o status do Emprestimo e verificar Multas
        System.out.println("Registrando devolução de item...");
    }



    public Publicacoes veri_livro_revista(int opcao,String titulo,String autor){
        int LIVRO = 1;
        int REVISTA = 2;
        if (opcao == LIVRO){
            return criarLivro(titulo,autor);
        }
        if(opcao == REVISTA){
            return criarRevista(titulo,autor);
        }
        else {
            System.out.println("Opção indefinida");
        }
    }


    public static Livro criarLivro(String titulo, String autor){
        return new Livro(titulo, autor);
    }

    public static Revista criarRevista(String titulo,String autor){
        return new Revista(titulo, autor);
    }
}
