import javax.swing.JOptionPane;

public class Aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }

    public float calcularMedia() {
        return (ac1 * 0.15f) + (ac2 * 0.30f) + (ag * 0.10f) + (af * 0.45f);
}
    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado!";
        } else {
            return "Reprovado";
        }
    }

    public String imprimir() {
        return "Ra: " + ra +
                "\nNome: " + nome +
                "\nAC1: " + ac1 +
                "\nAC2: " + ac2 +
                "\nAG: " + ag +
                "\nAF: " + af +
                "\nMédia: " + calcularMedia() +
                "\nSituação: " + verificarAprovacao();
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        while (true) {
            String opcao = JOptionPane.showInputDialog("Menu:\n1 - Criar Aluno\n2 - Mostrar Aluno\n3 - Sair");

            switch (opcao) {
                case "1":

                    aluno.setRa(JOptionPane.showInputDialog("Informe o RA: "));
                    aluno.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
                    aluno.setAc1(Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da AC1: ")));
                    aluno.setAc2(Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da AC2: ")));
                    aluno.setAg(Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da AG: ")));
                    aluno.setAf(Float.parseFloat(JOptionPane.showInputDialog("Informe o nota da AF: ")));

                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, aluno.imprimir());

                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Programa encerrado. ");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida. ");
            }
        }
    }
}
