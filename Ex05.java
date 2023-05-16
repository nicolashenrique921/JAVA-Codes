package Exercicio05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        
        
        
        System.out.println("Digite um numero: ");
        int num = tabuada.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int resultado = num * 1;
            System.out.println(  num + " X " + i + " = "+ (num * i) );
        }
        tabuada.close();
    }
}
