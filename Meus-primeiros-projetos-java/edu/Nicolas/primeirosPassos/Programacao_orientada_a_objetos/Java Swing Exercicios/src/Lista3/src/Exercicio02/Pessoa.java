package Exercicio02;
import java.util.ArrayList;

public class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public void inserirAutomovel(Automovel automovel) {
        automoveis.add(automovel);
    }

    public void removerAutomovel(int index) {
        if (index >= 0 && index < automoveis.size()) {
            automoveis.remove(index);
        }
    }

    public String imprimir() {
        return "Código: " + codigo + "\nNome: " + nome;
    }

    public String imprimirCompleto() {
        StringBuilder completo = new StringBuilder(imprimir() + "\nAutomóveis:\n");

        if (automoveis.isEmpty()) {
            completo.append("Nenhum automóvel registrado para esta pessoa.");
        } else {
            for (Automovel automovel : automoveis) {
                completo.append(automovel.imprimir()).append("\n");
            }
        }

        return completo.toString(); }

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

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }
        
}
