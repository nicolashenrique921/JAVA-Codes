public class Aluno {
    private String nome;
    private String cpf;
    private String ra;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String ra, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.ra = ra;
        this.curso = curso;
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

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nRA: " + ra + "\nCurso: " + curso;
    }
}

