package models;

import interfaces.Publicacoes;

public class Pessoa {
    protected static int id = 0;
    protected String nome;
    protected Contato contato;

    protected List<Publicacoes> publisEmprestados = new ArrayList();


    public Pessoa(String nome,Contato contato,Publicacoes publisEmprestados) {
        this.nome = nome;
        this.contato = contato;
        this.publisEmprestados = publiEmprestados;
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

    public Publicacoes getPublisEmprestados() {
        return publisEmprestados;
    }

    public void setPublisEmprestados(Publicacoes publisEmprestados) {
        this.publisEmprestados = publisEmprestados;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

}
