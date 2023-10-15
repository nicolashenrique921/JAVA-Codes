class AlunoGraduacao extends Aluno {
    private String anoConclusaoEnsinoMedio;
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusaoEnsinoMedio) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }

    @Override
    public double calcularMedia() {
        return (ac1 * 0.1) + (ac2 * 0.3) + (ag * 0.2) + (af * 0.4);
    }

    @Override
    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 5.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nAno de Conclusão do Ensino Médio: " + anoConclusaoEnsinoMedio + "\nMédia: " + calcularMedia() + "\nSituação: " + verificarAprovacao();
    }
}