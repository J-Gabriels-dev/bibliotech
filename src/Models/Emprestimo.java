package Models;
import java.util.Date;
public class Emprestimo {
    // Atributos Privados (-)
    private int id;
    private Date dataEmprestimo;
    private String dataDevolucao; // date-time
    private String status;
    private Publicacoes publicacao;
    private Pessoa idPessoa;

    // Métodos Públicos (+)
    public void gerarHistoricoEmprestimo(Pessoa pessoa) {
        // Implementação
    }
}