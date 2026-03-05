package models;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Biblioteca {

    Scanner sc = new Scanner(System.in);
    protected List<Publicacoes> publiCadastradas = new ArrayList<>();
    protected List<Autor> autoresCadastrados = new ArrayList<>();
    protected List<String> titulosCadastrados = new ArrayList<>();
    protected List<Publicacoes> resultados = new ArrayList<>();
    // Método para realizar o empréstimo de uma publicação
    public void realizarEmprestimo() {
        String nomeDolivro, nomeAutor;
        int opcao;
        System.out.println(publiCadastradas.toString());
        sc.nextLine();
        System.out.println("Digite o nome da publicação desejado:");
        nomeDolivro = sc.nextLine();
        System.out.println("Digite o nome do autor:");
        nomeAutor = sc.nextLine();
        System.out.println("Você deseja buscar um:\n1-Livro\n2-Revista:");
        opcao = sc.nextInt();

        if (opcao == 1) {
            resultados = buscarPubli(publiCadastradas, nomeDolivro, nomeAutor);
        } else if (opcao == 2) {
            resultados = buscarPubli(publiCadastradas, nomeDolivro, nomeAutor);
        }

        System.out.println(resultados.toString());
    }

    // Método para cadastrar novos livros ou revistas no acervo
    public void cadastrarPubli() {
        String titulo, autor;
        int opcao;

        while(true){
            System.out.println("=============================");
            System.out.println("Digite o nome da publicação:");
            titulo = sc.nextLine();
            System.out.println("=============================");
            System.out.println("Digite o nome da autor:");
            autor = sc.nextLine();
            System.out.println("\n");
            System.out.println("Deseja cadastrar essa publicação como:\n1-Livro\n2-Revista:");
            opcao = sc.nextInt();
            Autor actor = new Autor(autor);
            // Cadastrando Livros ou revistas
            publiCadastradas.add(veri_livro_revista(opcao, titulo, actor));
            autoresCadastrados.add(actor);
            titulosCadastrados.add(titulo);
            break;
        }
    }

    // Método para registrar a devolução de um item
    public void devolverLivro() {
        // Lógica para atualizar o status do Emprestimo e verificar Multas
        System.out.println("Registrando devolução de item...");
    }


    public Publicacoes veri_livro_revista(int opcao, String titulo, Autor autor) {
        int LIVRO = 1;
        int REVISTA = 2;
        if (opcao == LIVRO) {
            return criarLivro(titulo, autor);
        }
        if (opcao == REVISTA) {
            return criarRevista(titulo, autor);
        } else {
            System.out.println("Opção indefinida");
            return null;
        }
    }


    public static Livro criarLivro(String titulo, Autor autor) {
        return new Livro(titulo, autor);
    }

    public static Revista criarRevista(String titulo, Autor autor) {
        return new Revista(titulo, autor);
    }

    public List<Publicacoes> buscarPubli(List<? extends Publicacoes> listaParaBusca, String titulo, String autor) {
        if (listaParaBusca == null) return new ArrayList<>();

        return listaParaBusca.stream()
                .filter(p -> p.titulo.contains(titulo))
                .filter(p -> p.autor.contains(autor))
                .collect(Collectors.toList());
    }


}