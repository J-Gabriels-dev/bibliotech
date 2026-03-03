package models;
import interfaces.Publicacoes;
import java.util.Date;
public class Emprestimo {
    // Atributos Privados (-)
    private int id;
    private Date dataEmprestimo;
    private string dataDevolucao; // date-time
    private String status;
    private Publicacoes publicacao;
    private Pessoa idPessoa;

    // Métodos Públicos (+)
    public void gerarHistoricoEmprestimo(Pessoa pessoa) {
        // Implementação
    }
}