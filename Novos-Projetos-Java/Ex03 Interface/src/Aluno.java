public class Aluno {
    protected String ra;
    protected String nome;
    protected String curso;

    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
