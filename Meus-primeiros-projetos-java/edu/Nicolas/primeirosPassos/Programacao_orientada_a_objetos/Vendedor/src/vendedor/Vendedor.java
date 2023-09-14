package vendedor;

import javax.swing.JOptionPane;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public Vendedor() {    
    }
    
public Vendedor(int codigo, String nome, double percentualComissao) {
    this.codigo = codigo;
    this.nome = nome;
    this.percentualComissao = percentualComissao;
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }
    
    public String imprimir(double valorVenda, double desconto) {
        double comissao = calcularPagamentoComissao(valorVenda, desconto);
        
        return   "Código: " + codigo +
                 "\nNome: " + nome +
                  "\nValor Venda: " + valorVenda +
                  "\n% Comissão: " + percentualComissao +
                  "\nDesconto: " + desconto +
                  "\nValor a Pagar: " + comissao;
    }
    
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
    
    
    while (true) {
         String opcao = JOptionPane.showInputDialog("Menu:\n1 - Cadastrar Vendedor\n2 - Calcular Venda\n3 - Sair");
    
         switch (opcao) {
             case "1":
                 int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do Vendedor: "));
                 String nome = JOptionPane.showInputDialog("Informe o nome do Vendedor: ");
                 double percentualComissao = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de comissao: "));
                 
                 vendedor = new Vendedor(codigo,nome,percentualComissao);
                 break;
                 
             case "2":
                 if (vendedor.getNome() == null) {
                     JOptionPane.showMessageDialog(null, "Vendedor não cadastrado. Utilize a opção 1 para cadastrar o vendedor.");
                 } else {
                     double valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de venda: "));
                     double desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de desconto: "));
                     
                     JOptionPane.showMessageDialog(null, vendedor.imprimir(valorVenda, desconto));
                 }
                 break;
                 
              case "3":
                 JOptionPane.showMessageDialog(null, "Programa Encerrado.");
                 System.exit(0);
                 
              default:
                  JOptionPane.showMessageDialog(null, "Opção invalida.");
                }
        } 
    }
}

