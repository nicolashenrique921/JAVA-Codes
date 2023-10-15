import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao;
        List<Aluno> alunos = new ArrayList<>();

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1 - Inserir Aluno\n2 - Exibir Alunos\n3 - Sair"));

            switch (opcao) {
                case 1:
                    int tipoAluno = Integer.parseInt(JOptionPane.showInputDialog("Tipo de Aluno:\n1 - Graduação\n2 - Pós-Graduação"));
                    String ra = JOptionPane.showInputDialog("RA:");
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String curso = JOptionPane.showInputDialog("Curso:");

                    if (tipoAluno == 1) {
                        String anoConclusaoEnsinoMedio = JOptionPane.showInputDialog("Ano de Conclusão do Ensino Médio:");
                        double ac1 = Double.parseDouble(JOptionPane.showInputDialog("AC1:"));
                        double ac2 = Double.parseDouble(JOptionPane.showInputDialog("AC2:"));
                        double af = Double.parseDouble(JOptionPane.showInputDialog("AF:"));
                        double ag = Double.parseDouble(JOptionPane.showInputDialog("AG:"));

                        AlunoGraduacao aluno = new AlunoGraduacao(ra, nome, curso, ac1, ac2, af, ag);
                        alunos.add(aluno);
                    } else if (tipoAluno == 2) {
                        String anoConclusaoGraduacao = JOptionPane.showInputDialog("Ano de Conclusão da Graduação:");
                        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
                        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));

                        AlunoPosGraduacao aluno = new AlunoPosGraduacao(ra, nome, curso, anoConclusaoGraduacao, nota1, nota2);
                        alunos.add(aluno);
                    }
                    break;
                case 2:
                    if (alunos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
                    } else {
                        StringBuilder infoAlunos = new StringBuilder("Alunos cadastrados:\n");
                        for (Aluno aluno : alunos) {
                            infoAlunos.append(aluno.toString()).append("\n");
                            if (aluno instanceof AlunoGraduacao) {
                                AlunoGraduacao alunoGraduacao = (AlunoGraduacao) aluno;
                                infoAlunos.append("Média: " + alunoGraduacao.calcularMedia()).append("\n");
                                infoAlunos.append("Situação: " + alunoGraduacao.verificarAprovacao()).append("\n");
                            } else if (aluno instanceof AlunoPosGraduacao) {
                                AlunoPosGraduacao alunoPosGraduacao = (AlunoPosGraduacao) aluno;
                                infoAlunos.append("Média: " + alunoPosGraduacao.calcularMedia()).append("\n");
                                infoAlunos.append("Situação: " + alunoPosGraduacao.verificarAprovacao()).append("\n");
                            }
                            infoAlunos.append("\n");
                        }
                        JOptionPane.showMessageDialog(null, infoAlunos.toString());
                    }
                    break;
            }
        } while (opcao != 3);
    }
}
