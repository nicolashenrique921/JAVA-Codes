public class Atendente {
    private String nome;
    private String cpf;
    private String setor;
    private String funcao;

    public Atendente() {
    }

    public Atendente(String nome, String cpf, String setor, String funcao) {
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nSetor: " + setor + "\nFunção: " + funcao;
    }
}

