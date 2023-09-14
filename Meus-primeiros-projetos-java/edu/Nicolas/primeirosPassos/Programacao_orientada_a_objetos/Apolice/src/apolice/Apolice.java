package apolice;

import javax.swing.JOptionPane;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {
    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        double valorApolice = 0;

        if (sexo == 'M' && idade <= 25) {
            valorApolice = valorAutomovel * 10 / 100;
        } else if (sexo == 'M' && idade > 25) {
            valorApolice = valorAutomovel * 5 / 100;
        } else if (sexo == 'F') {
            valorApolice = valorAutomovel * 2 / 100;
        }

        return valorApolice;
    }

    public String imprimir() {
        double valorApolice = calcularValor();

        return "Número: " + numero +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nValor Automóvel: " + valorAutomovel +
                "\nValor Apólice: " + valorApolice;
    }

    public static void main(String[] args) {
        Apolice apolice = new Apolice();

        while (true) {
            String opcao = JOptionPane.showInputDialog("Menu:\n1 - Criar Apólice\n2 - Ver Dados Apólice\n3 - Sair");

            switch (opcao) {
                case "1":
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
                    String nome = JOptionPane.showInputDialog("Informe o nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
                    char sexo = JOptionPane.showInputDialog("Informe o sexo (M/F): ").charAt(0);
                    double valorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do automóvel: "));

                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    break;

                case "2":
                    if (apolice.getNome() == null) {
                        JOptionPane.showMessageDialog(null, "Apólice não criada. Utilize a opção 1 para criar a apólice.");
                    } else {
                        JOptionPane.showMessageDialog(null, apolice.imprimir());
                    }
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
}
