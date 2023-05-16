# JAVA-Codes
Repository to store some of the codes made in JAVA so far in my classes

package Exercicio05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Digite um numero: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite outro numero: ");
        n2 = sc.nextInt();
        
        if (n1 == n2) {
            System.out.println("Os numeros digitados sao iguais.");
        } else {
            System.out.println("Os numeros digitados nao sao iguais.");
        }
    }
}
