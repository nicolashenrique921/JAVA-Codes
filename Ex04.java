package Exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String args[]) {
        Scanner menu = new Scanner(System.in);
        
        int opcao = 0;
        
        while (opcao != 5) {
            System.out.println("Menu do Restaurante: ");
            System.out.println("1 - Vatapa ");
            System.out.println("2 - Pizza ");
            System.out.println("3 - Macarronada ");
            System.out.println("4 - Feijoada");
            System.out.println("5 - SAIR ");
            System.out.print("Opcao:");
            
            opcao = menu.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Vatapa: R$20.00");
                    break;
                case 2:
                    System.out.println("Pizza: R$40.00");
                    break;
                case 3:
                    System.out.println("Macarronada: R$25.00");
                    break;
                case 4:
                    System.out.println("Feijoada: R$30.00");
                    break;
                case 5:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
        menu.close();
    }
}
