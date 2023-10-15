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
                    if (tipoAluno == 1) {
                        String ra = JOptionPane.showInputDialog("RA do aluno de Graduação:");
                        String nome = JOptionPane.showInputDialog("Nome do aluno de Graduação:");
                        String curso = JOptionPane.showInputDialog("Curso do aluno de Graduação:");
                        String anoConclusaoEnsinoMedio = JOptionPane.showInputDialog("Ano de Conclusão do Ensino Médio:");
                        double ac1 = Double.parseDouble(JOptionPane.showInputDialog("Nota AC1:"));
                        double ac2 = Double.parseDouble(JOptionPane.showInputDialog("Nota AC2:"));
                        double af = Double.parseDouble(JOptionPane.showInputDialog("Nota AF:"));
                        double ag = Double.parseDouble(JOptionPane.showInputDialog("Nota AG:"));
                        AlunoGraduacao aluno = new AlunoGraduacao(ra, nome, curso, anoConclusaoEnsinoMedio);
                        aluno.setAc1(ac1);
                        aluno.setAc2(ac2);
                        aluno.setAf(af);
                        aluno.setAg(ag);
                        alunos.add(aluno);
                    } else if (tipoAluno == 2) {
                        String ra = JOptionPane.showInputDialog("RA do aluno de Pós-Graduação:");
                        String nome = JOptionPane.showInputDialog("Nome do aluno de Pós-Graduação:");
                        String curso = JOptionPane.showInputDialog("Curso do aluno de Pós-Graduação:");
                        String anoConclusaoGraduacao = JOptionPane.showInputDialog("Ano de Conclusão da Graduação:");
                        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
                        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
                        AlunoPosGraduacao aluno = new AlunoPosGraduacao(ra, nome, curso, anoConclusaoGraduacao);
                        aluno.setNota1(nota1);
                        aluno.setNota2(nota2);
                        alunos.add(aluno);
                    }
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
                    } else {
                        StringBuilder infoAlunos = new StringBuilder("Alunos cadastrados:\n");
                        for (Aluno aluno : alunos) {
                            infoAlunos.append(aluno.toString()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, infoAlunos.toString());
                    }
                    break;
            }
        } while (opcao != 3);
    }
}