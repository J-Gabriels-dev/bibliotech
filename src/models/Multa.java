package models;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Multa {
    // Atributos Privados (-)
    private int id;
    private string dataMulta;
    private String causaMulta;

    private  List<Pessoa> pessoasMutadas = new ArrayList<>();

    // Agregação 0..* com models.Emprestimo
    private List<Emprestimo> emprestimos = new ArrayList<>();

    // Métodos Públicos (+)
    public Pessoa cadastrarMulta(Pessoa pessoa) {
        return pessoa;
    }

    public Pessoa removerMulta(Pessoa pessoa) {
        return pessoa;
    }

    public void gerarHistoricoMutas(Pessoa pessoa) {
        // Implementação
    }

    public Pessoa alterarMulta(Pessoa pessoa) {
        return pessoa;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
}