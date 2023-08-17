import javax.swing.JOptionPane;

public class Pessoa {
    
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;
    
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String imprimir() {
        return "O(A) " + this.getNome() + " de CPF: " + this.getCpf() + ". E sexo " + this.getSexo() + " possui " + this.getIdade() + " anos de idade." ;
    }

    public void menu() {
        Object[] itens = {"Criar pessoa", "Mostrar pessoa", "Sair" };
        Object selectItem = JOptionPane.showInputDialog(null,"Escolha uma Opção", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);

        while (selectItem != "Sair") {
            if (selectItem == "Criar pessoa") {
                String inputNome = JOptionPane.showInputDialog("Informe o Nome:");
                this.setNome(inputNome);

                String inputCpf = JOptionPane.showInputDialog("Informe o CPF:");
                this.setCpf(inputCpf);

                String inputSexo = JOptionPane.showInputDialog("Informe o Sexo:");
                this.setSexo(inputSexo.charAt(0));

                String inputIdadeStr = JOptionPane.showInputDialog("Informe a Idade:");
                int inputIdade = Integer.parseInt(inputIdadeStr);
                this.setIdade(inputIdade);
            } else {
                if (selectItem == "Mostrar pessoa") {
                    JOptionPane.showMessageDialog(null, this.imprimir());
                }
            }
            selectItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
        }
    }
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.menu();
    }
}       
