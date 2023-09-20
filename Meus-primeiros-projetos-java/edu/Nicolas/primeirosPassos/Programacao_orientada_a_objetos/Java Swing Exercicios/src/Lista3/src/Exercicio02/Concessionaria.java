package Exercicio02;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "Menu:\n" +
                            "1 - Criar Pessoa\n" +
                            "2 - Criar Automóvel\n" +
                            "3 - Transferir Automóvel\n" +
                            "4 - Mostrar Todas as Pessoas\n" +
                            "5 - Mostrar Automóveis da Pessoa\n" +
                            "6 - Sair"
            );

            switch (opcao) {
                case "1":
                        int codigoPessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da Pessoa: "));
                        String nomePessoa = JOptionPane.showInputDialog("Informe o nome da Pessoa: ");
                
                        pessoas.add(new Pessoa(codigoPessoa, nomePessoa));
                
                        JOptionPane.showMessageDialog(null, "Pessoa criada com sucesso!");
                    break;

                case "2":
                    if (pessoas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Crie uma pessoa antes de adicionar um automóvel.");
                    } else {
                        String marcaAutomovel = JOptionPane.showInputDialog("Informe a marca do Automóvel: ");
                        String modeloAutomovel = JOptionPane.showInputDialog("Informe o modelo do Automóvel: ");

                        StringBuilder pessoasDisponiveis = new StringBuilder("Escolha a Pessoa:\n");
                        for (int i = 0; i < pessoas.size(); i++) {
                            pessoasDisponiveis.append(i + 1).append(" - ").append(pessoas.get(i).getNome()).append("\n");
                        }
                        int escolhaPessoa = Integer.parseInt(JOptionPane.showInputDialog(pessoasDisponiveis.toString())) - 1;

                        Automovel automovel = new Automovel(marcaAutomovel, modeloAutomovel);
                        pessoas.get(escolhaPessoa).inserirAutomovel(automovel);

                        JOptionPane.showMessageDialog(null, "Automóvel adicionado à pessoa com sucesso!");
                    }
                    break;

                case "3":
                    if (pessoas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma pessoa criada ainda.");
                    } else {
                        int pessoaOrigem = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Pessoa de origem: ")) - 1;
                        int automovelOrigem = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Automóvel de origem: ")) - 1;

                        Pessoa origem = pessoas.get(pessoaOrigem);
                        if (origem.getAutomoveis().isEmpty() || automovelOrigem < 0 || automovelOrigem >= origem.getAutomoveis().size()) {
                            JOptionPane.showMessageDialog(null, "Pessoa de origem ou automóvel de origem inválidos.");
                        } else {
                            int pessoaDestino = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Pessoa de destino: ")) - 1;

                            Pessoa destino = pessoas.get(pessoaDestino);

                            Automovel automovelTransferido = origem.getAutomoveis().remove(automovelOrigem);
                            destino.inserirAutomovel(automovelTransferido);

                            JOptionPane.showMessageDialog(null, "Automóvel transferido com sucesso!");
                        }
                    }
                    break;

                case "4":
                    if (pessoas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma pessoa criada ainda.");
                    } else {
                        StringBuilder pessoasInfo = new StringBuilder("Pessoas criadas:\n");
                        for (Pessoa pessoa : pessoas) {
                            pessoasInfo.append(pessoa.imprimir()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, pessoasInfo.toString());
                    }
                    break;

                case "5":
                    if (pessoas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma pessoa criada ainda.");
                    } else {
                        int pessoaSelecionada = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Pessoa para ver os automóveis: ")) - 1;

                        Pessoa pessoa = pessoas.get(pessoaSelecionada);
                        ArrayList<Automovel> automoveisPessoa = pessoa.getAutomoveis();

                        if (automoveisPessoa.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum automóvel registrado para esta pessoa.");
                        } else {
                            StringBuilder automoveisInfo = new StringBuilder("Automóveis de " + pessoa.getNome() + ":\n");
                            for (Automovel automovel : automoveisPessoa) {
                                automoveisInfo.append(automovel.imprimir()).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, automoveisInfo.toString());
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
