import java.util.ArrayList;

public class Professor {
    private String nome;
    private String cpf;
    private String urlCurriculoLattes;
    private ArrayList<Disciplina> disciplinas;

    public Professor() {
        disciplinas = new ArrayList<>();
    }

    public Professor(String nome, String cpf, String urlCurriculoLattes) {
        this.nome = nome;
        this.cpf = cpf;
        this.urlCurriculoLattes = urlCurriculoLattes;
        disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(int index) {
        if (index >= 0 && index < disciplinas.size()) {
            disciplinas.remove(index);
        }
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public Disciplina getDisciplina(int index) {
        if (index >= 0 && index < disciplinas.size()) {
            return disciplinas.get(index);
        }
        return null;
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

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Nome: " + nome + "\nCPF: " + cpf + "\nURL do Currículo Lattes: " + urlCurriculoLattes);
        info.append("\nDisciplinas ministradas:\n");
        for (Disciplina disciplina : disciplinas) {
            info.append(disciplina.getNome()).append("\n");
        }
        return info.toString();
    }
}
