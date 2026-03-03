package models;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private static int id = 0;
    private String nome;
    private Contato contato;

    protected List<Publicacoes> publisEmprestados = new ArrayList();


    public Pessoa(String nome,Contato contato) {
        this.nome = nome;
        this.contato = contato;
        id++;
    }

    public void pegarPubli(Publicacoes publicacoes,Pessoa pessoa) {
        pessoa.publisEmprestados.add(publicacoes);
    }

    public void devolverPubli(Publicacoes publicacoes) {

    }

    public void renovarPubli(Publicacoes publicacoes) {
        // Implementação
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

}
