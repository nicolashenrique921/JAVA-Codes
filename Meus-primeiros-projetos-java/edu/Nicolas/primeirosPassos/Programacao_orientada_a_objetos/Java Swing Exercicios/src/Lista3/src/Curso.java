import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = new ArrayList<>();
}
    
    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int index) {
        if (index >= 0 && index < alunos.size()) {
            alunos.remove(index);
        }
    }
    
    public String imprimir(){
        return 
                "Codigo do curso: " + codigo +
                "Nome do curso: "+ nome +
                "Carga Horaria: " + cargaHoraria;
    }

    public String imprimirCompleto() {
        StringBuilder completo = new StringBuilder(imprimir() + "\nAlunos:\n");

        if (alunos.isEmpty()) {
            completo.append("Nenhum aluno registrado neste curso.");
        } else {
            for (Aluno aluno : alunos) {
                completo.append(aluno.imprimir()).append("\n");
            }
        }

        return completo.toString();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
