import java.util.Scanner;

public class ConversaoFahrenheit {

    public static void main(String[] args) throws Exception {
        Scanner F = new Scanner(System.in);

        boolean refazer = true;

        while (refazer) {

        System.out.println("Infomer quantos Fahrenheits deseja converter: ");
        double Fahrenheit = F.nextDouble();

        double Celsius = (((Fahrenheit-32)*5)/9);

        System.out.println("A Temperatura em Celsius e de: "+Celsius+" graus.");

        System.out.println("DESEJA REFAZER? (S/N)");
        String opcao = F.next();

        if (!opcao.equalsIgnoreCase("S")) {
            refazer = false;
        }else{
            refazer = true;
        }
    }
        System.out.println("Calculo encerrado. Obrigado!");
        F.close();
    }
}
