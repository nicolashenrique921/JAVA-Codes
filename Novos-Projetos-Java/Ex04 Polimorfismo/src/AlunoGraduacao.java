public class AlunoGraduacao extends Aluno {
    private String anoConclusaoEnsinoMedio;

    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusaoEnsinoMedio) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAno de Conclusão do Ensino Médio: " + anoConclusaoEnsinoMedio;
    }
    
    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
}