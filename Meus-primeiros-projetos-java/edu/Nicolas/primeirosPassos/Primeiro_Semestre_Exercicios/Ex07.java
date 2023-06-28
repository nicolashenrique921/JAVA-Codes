package Exercicio07;

public class Ex07 {
    public static void main(String[] args) {
        
        int v1 = 0, v2 = 1, v3, n = 15;
        System.out.println(v1 + " " + v2);
        
        for (int i = 2; i < n; i++) {
            v3 = v1 + v2;
            System.out.println(" "+ v3);
            v1 = v2;
            v2 = v3;
        }
    }
}
