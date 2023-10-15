class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoGraduacao;
    private double nota1;
    private double nota2;

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
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

    @Override
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nAno de Conclusão da Graduação: " + anoConclusaoGraduacao + "\nMédia: " + calcularMedia() + "\nSituação: " + verificarAprovacao();
    }
}
