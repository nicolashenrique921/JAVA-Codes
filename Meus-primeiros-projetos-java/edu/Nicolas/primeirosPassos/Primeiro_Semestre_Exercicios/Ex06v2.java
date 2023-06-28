package Exercicio06v2;

import java.util.Scanner;

public class Ex06v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, pares = 0;

        System.out.print("Digite um numero inteiro ate 500: ");
        num = sc.nextInt();

        for (int i = 1; i <= num && i <= 500; i++) {
            if (i % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Existem " + pares + " numeros pares ate o numero informado.");
    }
}
