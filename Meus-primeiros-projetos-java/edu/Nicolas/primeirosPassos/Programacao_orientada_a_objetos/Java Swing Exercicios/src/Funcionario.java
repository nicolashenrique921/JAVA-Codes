import javax.swing.JOptionPane;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return this.cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return this.tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return this.qtdeHora;
    }

    public void setQtdeHoras(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return this.valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float calcularValorSalario() {
        float valorSalario;
        if (tipoVinculo == 'H') {
            valorSalario = (valorHora * qtdeHora) - valorDesconto;
        } else {
            valorSalario = salario - valorDesconto;
        }
        return valorSalario;
    }

    public String imprimir() {
        String tipoVinculoStr = (tipoVinculo == 'H') ? "Horista" : "Mensalista";
        float valorSalario = calcularValorSalario();

        return "Crachá: " + cracha +
                "\nNome: " + nome +
                "\nTipo Vínculo: " + tipoVinculoStr +
                "\nSalário: " + valorSalario +
                "\nDesconto: " + valorDesconto +
                "\nValor a receber: " + (valorSalario - valorDesconto);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        while (true) {
            String opcao = JOptionPane.showInputDialog("Menu:\n1 - Criar Funcionário\n2 - Mostrar Folha de Pagamento\n3 - Alterar remuneração\n4 - Sair");

            switch (opcao) {
                case "1":
                    funcionario.setCracha(Integer.parseInt(JOptionPane.showInputDialog("Informe o cracha: ")));
                    funcionario.setNome(JOptionPane.showInputDialog("Informe seu Nome: "));
                    funcionario.setTipoVinculo(JOptionPane.showInputDialog("Informe o tipo de vinculo: ").charAt(0));

                    if (funcionario.getTipoVinculo() == 'H') {
                        funcionario.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor hora: ")));
                        funcionario.setQtdeHoras(Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de horas: ")));
                        funcionario.setSalario(0);

                    } else {

                        funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Informe o salário: ")));
                        funcionario.setValorHora(0);
                        funcionario.setQtdeHoras(0);
                    }
                        funcionario.setValorDesconto(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de desconto: ")));
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, funcionario.imprimir());
                    break;

                case "3":
                    if (funcionario.getTipoVinculo() == 'H') {
                        funcionario.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor hora: ")));
                        funcionario.setQtdeHoras(Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de horas: ")));
                    } else {
                        funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Informe o salário: ")));
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Programa encerrado. ");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida. ");
            }
        }
    }
}
