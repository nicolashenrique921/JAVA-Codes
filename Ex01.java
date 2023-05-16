package Exercicio01;

public class Ex01 {
    public static void main(String[] args) {
        
        int [] V = new int[6];
        
        V[0] = 1;
        V[1] = 0;
        V[2] = 5;
        V[3] = -2;
        V[4] = -5;
        V[5] = 7;
                
        int soma = V[0] + V[1] + V[5];
        
        System.out.println("Soma: "+ soma);
        
        V[4] = 100;
        
        for (int i = 0; i < V.length; i++){
            System.out.println("V[i]");
        }
    }
}
