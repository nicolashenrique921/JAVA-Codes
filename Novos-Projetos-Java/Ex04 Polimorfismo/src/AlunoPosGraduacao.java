public class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoGraduacao;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

     @Override
    public String toString() {
        return super.toString() + "\nAno de Conclusão de Graduação: " + anoConclusaoGraduacao;
    }
    
    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
   
}