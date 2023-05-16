package Exercicio03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome, titulo = "Lista de homens com mais de 21 anos:\n";
        int idade;
        char sexo;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe o nome da " + i + "ª pessoa:");
            nome = sc.nextLine();
            
            System.out.println("Informe a idade da " + i + "ª pessoa:");
            idade = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Informe o sexo da " + i + "ª pessoa (M/F):");
            sexo = sc.nextLine().charAt(0);
            
            if (sexo == 'M' && idade > 21) {
                titulo += nome + "\n"; 
            }
        }
        
        System.out.println(titulo);
        
        sc.close();
    }

}
