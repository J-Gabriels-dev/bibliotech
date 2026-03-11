package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Biblioteca {

    Scanner sc = new Scanner(System.in);
    protected List<Publicacoes> publiCadastradas = new ArrayList<>();
    protected List<Autor> autoresCadastrados = new ArrayList<>();
    protected List<String> titulosCadastrados = new ArrayList<>();
    protected List<? extends Publicacoes> resultados = new ArrayList<>();
    public void realizarEmprestimo(Pessoa pessoa) {
        String nomeDolivro, nomeAutor;
        int opcao,opcao2;


        sc.nextLine();
        System.out.println("Digite o nome da publicação desejada:");
        nomeDolivro = sc.nextLine();
        System.out.println("Digite o nome do autor:");
        nomeAutor = sc.nextLine();
        System.out.println("Você deseja buscar um:\n1-Livro\n2-Revista:");
        opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1 || opcao == 2) {
            resultados = buscarPubli(publiCadastradas, nomeDolivro, nomeAutor);
        }
        sc.nextLine();
        System.out.println("Digite 1 pra Confirmar emprétimo:");
        opcao2 = sc.nextInt();

        if (opcao2 != 1){
            System.out.println("Emprétimo interrompido");
        }
        else {
            pessoa.cadastrarEmprestimo(null);
        }
    }

    public void cadastrarPubli() {
        String titulo, autor;
        int opcao;

        while(true){
            System.out.println("==========================================");
            System.out.println("Digite o nome da publicação:");
            titulo = sc.nextLine();
            System.out.println("==========================================");
            System.out.println("Digite o nome da autor:");
            autor = sc.nextLine();
            System.out.println("\n");
            System.out.println("Deseja cadastrar essa publicação como:\n1-Livro\n2-Revista:");
            opcao = sc.nextInt();
            coversorDeTipo(opcao);
            sc.nextLine();

            Publicacoes f = FactoryPublicacao.createPubli(coversorDeTipo(opcao),titulo,criarAutor(autor));
            publiCadastradas.add(f);
            autoresCadastrados.add(criarAutor(autor));
            titulosCadastrados.add(titulo);
            break;
        }
    }

    public String coversorDeTipo(int num){
        if(num == 1){
            return "livro";
        }
        return "revista";
    }

   public static Autor criarAutor(String autor){
       return new Autor(autor);
    }

    public List<Publicacoes> buscarPubli(List<? extends Publicacoes> listaParaBusca, String titulo, String autor) {
        if (listaParaBusca == null) return new ArrayList<>();

        return listaParaBusca.stream()

                .filter(p -> p.titulo.toUpperCase().contains(titulo.toUpperCase().trim()))
                .filter(p -> p.autor.getNome().toUpperCase().contains(autor.toUpperCase().trim()))
                .collect(Collectors.toList());
    }
}