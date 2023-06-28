package Exercicio08;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ordem = new Scanner(System.in);
        
        int menor , medio , maior;
        
        System.out.println("Digite o primeiro numero: ");
        int n1 = ordem.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int n2 = ordem.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        int n3 = ordem.nextInt();
        
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                medio = n2;
                maior = n3;
            } else {
                medio = n3;
                maior = n2;        
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                medio = n1;
                maior = n3;
            } else {
                medio = n3;
                maior = n1;
            }
        } else {
            menor = n3;
            if (n1 < n2) {
                medio = n1;
                maior = n2;
            } else {
                medio = n2;
                maior = n1;
            }        
        }
        System.out.println("Os numeros digitados em ordem crescente sao: " + menor + " - " + medio + " - " + maior + ".");
    }
}
