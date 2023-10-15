public class AlunoPosGraduacao extends Aluno {
    private double nota1;
    private double nota2;
    private String anoConclusaoGraduacao; // Adicione o campo anoConclusaoGraduacao

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao, double nota1, double nota2) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao; // Defina o campo anoConclusaoGraduacao
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        return (media >= 6.0) ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "RA: " + getRa() + "\nNome: " + getNome() + "\nCurso: " + getCurso();
}


    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}