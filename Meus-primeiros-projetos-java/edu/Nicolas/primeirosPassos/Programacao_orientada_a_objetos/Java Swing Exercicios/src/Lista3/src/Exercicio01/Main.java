package Exercicio01;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Curso> cursos = new ArrayList<>();

        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "Menu:\n" +
                            "1 - Criar Curso\n" +
                            "2 - Criar Aluno\n" +
                            "3 - Remover Aluno\n" +
                            "4 - Mostrar Todos os Cursos\n" +
                            "5 - Mostrar Alunos do Curso\n" +
                            "6 - Sair"
            );

            switch (opcao) {
                case "1":
                    int codigoCurso = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do Curso: "));
                    String nomeCurso = JOptionPane.showInputDialog("Informe o nome do Curso: ");
                    int cargaHorariaCurso = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária do Curso: "));

                    cursos.add(new Curso(codigoCurso, nomeCurso, cargaHorariaCurso));
                    JOptionPane.showMessageDialog(null, "Curso criado com sucesso!");
                    break;

                case "2":
                    if (cursos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Crie um curso antes de adicionar alunos.");
                    } else {
                        String nomeAluno = JOptionPane.showInputDialog("Informe o nome do Aluno: ");
                        String raAluno = JOptionPane.showInputDialog("Informe o RA do Aluno: ");

                        StringBuilder cursosDisponiveis = new StringBuilder("Escolha o Curso:\n");
                        for (int i = 0; i < cursos.size(); i++) {
                            cursosDisponiveis.append(i + 1).append(" - ").append(cursos.get(i).getNome()).append("\n");
                        }
                        int escolhaCurso = Integer.parseInt(JOptionPane.showInputDialog(cursosDisponiveis.toString())) - 1;

                        Aluno aluno = new Aluno(raAluno, nomeAluno);
                        cursos.get(escolhaCurso).inserirAluno(aluno);

                        JOptionPane.showMessageDialog(null, "Aluno adicionado ao curso com sucesso!");
                    }
                    break;

                case "3":
                    if (cursos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum curso criado ainda.");
                    } else {
                        int cursoSelecionado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do Curso para remover aluno: ")) - 1;
                        Curso curso = cursos.get(cursoSelecionado);

                        ArrayList<Aluno> alunosCurso = curso.getAlunos();
                        if (alunosCurso.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum aluno no curso para remover.");
                        } else {
                            StringBuilder alunosDisponiveis = new StringBuilder("Escolha o Aluno a ser removido:\n");
                            for (int i = 0; i < alunosCurso.size(); i++) {
                                alunosDisponiveis.append(i + 1).append(" - ").append(alunosCurso.get(i).getNome()).append("\n");
                            }
                            int escolhaAluno = Integer.parseInt(JOptionPane.showInputDialog(alunosDisponiveis.toString())) - 1;

                            curso.removerAluno(escolhaAluno);
                            JOptionPane.showMessageDialog(null, "Aluno removido do curso com sucesso!");
                        }
                    }
                    break;

                case "4":
                if (cursos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum curso criado ainda.");
                } else {
                    StringBuilder cursosInfo = new StringBuilder("Cursos criados:\n");
                    for (Curso curso : cursos) {
                        cursosInfo.append(curso.imprimir()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, cursosInfo.toString());
                }
                break;

                case "5":
                if (cursos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum curso criado ainda.");
                } else {
                    int cursoSelecionado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do Curso para ver os alunos: ")) - 1;
                    Curso curso = cursos.get(cursoSelecionado);

                    ArrayList<Aluno> alunosCurso = curso.getAlunos();
                    if (alunosCurso.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum aluno neste curso ainda.");
                    } else {
                        StringBuilder alunosInfo = new StringBuilder("Alunos do Curso " + curso.getNome() + ":\n");
                        for (Aluno aluno : alunosCurso) {
                            alunosInfo.append(aluno.imprimir()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, alunosInfo.toString());
                    }
                }
                break;

                case "6":
                    JOptionPane.showMessageDialog(null, "Programa Encerrado.");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}