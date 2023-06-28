package Exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Par = 0, Impar = 0;
        
        
        for (int i = 0; i < 200; i++) {
            System.out.print("Digite um numero inteiro: ");
            int numero = sc.nextInt();
            
            if (numero % 2 == 0) {
                Par++;
            } else {
                Impar++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + Par);
        System.out.println("Quantidade de números ímpares: " + Impar);
    }
}
