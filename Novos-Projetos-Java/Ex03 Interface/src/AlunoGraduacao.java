public class AlunoGraduacao extends Aluno {
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao(String ra, String nome, String curso, double ac1, double ac2, double af, double ag) {
        super(ra, nome, curso);
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.af = af;
        this.ag = ag;
    }

    public double calcularMedia() {
        return (ac1 * 0.1) + (ac2 * 0.3) + (ag * 0.2) + (af * 0.4);
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        return (media >= 6.0) ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "RA: " + getRa() + "\nNome: " + getNome() + "\nCurso: " + getCurso();
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
}
