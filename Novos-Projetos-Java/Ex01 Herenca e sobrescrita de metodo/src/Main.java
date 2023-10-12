import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Atendente> atendentes = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();

        int opcao;

        do {
            String menu = "Menu:\n" +
                    "1 - Inserir Disciplina\n" +
                    "2 - Inserir Professor\n" +
                    "3 - Inserir Atendente\n" +
                    "4 - Inserir Aluno\n" +
                    "5 - Adicionar Disciplina ao Professor\n" +
                    "6 - Mostrar Pessoas\n" +
                    "7 - Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina:");
                    int codigoDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Código da Disciplina:"));
                    Disciplina disciplina = new Disciplina(codigoDisciplina, nomeDisciplina);
                    disciplinas.add(disciplina);
                    break;
                case 2:
                    String nomeProfessor = JOptionPane.showInputDialog("Nome do Professor:");
                    String cpfProfessor = JOptionPane.showInputDialog("CPF do Professor:");
                    String urlCurriculoLattes = JOptionPane.showInputDialog("URL do Currículo Lattes:");
                    Professor professor = new Professor(nomeProfessor, cpfProfessor, urlCurriculoLattes);
                    professores.add(professor);
                    break;
                case 3:
                    String nomeAtendente = JOptionPane.showInputDialog("Nome do Atendente:");
                    String cpfAtendente = JOptionPane.showInputDialog("CPF do Atendente:");
                    String setorAtendente = JOptionPane.showInputDialog("Setor do Atendente:");
                    String funcaoAtendente = JOptionPane.showInputDialog("Função do Atendente:");
                    Atendente atendente = new Atendente(nomeAtendente, cpfAtendente, setorAtendente, funcaoAtendente);
                    atendentes.add(atendente);
                    break;
                case 4:
                    String nomeAluno = JOptionPane.showInputDialog("Nome do Aluno:");
                    String cpfAluno = JOptionPane.showInputDialog("CPF do Aluno:");
                    String raAluno = JOptionPane.showInputDialog("RA do Aluno:");
                    String cursoAluno = JOptionPane.showInputDialog("Curso do Aluno:");
                    Aluno aluno = new Aluno(nomeAluno, cpfAluno, raAluno, cursoAluno);
                    alunos.add(aluno);
                    break;
                case 5:
                    if (professores.isEmpty() || disciplinas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum professor ou disciplina cadastrados.");
                    } else {
                        int indiceProfessor = Integer.parseInt(JOptionPane.showInputDialog("Selecione um Professor pelo número:"));
                        int indiceDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma Disciplina pelo número:"));
                        if (indiceProfessor >= 0 && indiceProfessor < professores.size() && indiceDisciplina >= 0 && indiceDisciplina < disciplinas.size()) {
                            Professor professorSelecionado = professores.get(indiceProfessor);
                            Disciplina disciplinaSelecionada = disciplinas.get(indiceDisciplina);
                            professorSelecionado.adicionarDisciplina(disciplinaSelecionada);
                            JOptionPane.showMessageDialog(null, "Disciplina adicionada ao professor com sucesso.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Índice inválido.");
                        }
                    }
                    break;
                    case 6:
                    StringBuilder pessoasInfo = new StringBuilder("Pessoas:\n");
                    pessoasInfo.append("\nProfessores:\n");
                    for (Professor professorSelecionado : professores) {
                        pessoasInfo.append(professorSelecionado.toString()).append("\n");
                    }                    
                    
                    pessoasInfo.append("\nAtendentes:\n");
                    for (Atendente aatendente : atendentes) {
                        pessoasInfo.append(aatendente.toString()).append("\n");
                    }
                    
                    pessoasInfo.append("\nAlunos:\n");
                    for (Aluno aaluno : alunos) {
                        pessoasInfo.append(aaluno.toString()).append("\n");
                    }                                       
                    JOptionPane.showMessageDialog(null, pessoasInfo.toString());
                    break;                                
            }
        } while (opcao != 7);
    }
}
