package Exercicio06_07;

import java.util.Scanner;

public class Ex06_07 {
    public static void main(String[] args) {
        Scanner estado = new Scanner(System.in);
        
        System.out.println("Digite a sigla do Estado: ");
        String sigla = estado.nextLine().toUpperCase();
        
        switch (sigla) {
            case "RJ":
                System.out.println("Carioca");
                break;
            case "SP":
                System.out.println("Paulista");
                break;
            case "MG":
                System.out.println("Mineiro");
                break;
            default:
                System.out.println("Outros Estados");
                break;
        }
    }
}
