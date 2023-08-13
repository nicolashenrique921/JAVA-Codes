import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) throws Exception {
        Scanner viagem = new Scanner(System.in);

        boolean refazer = true;

        while (refazer) {
            System.out.println("Qual foi o tempo \"em horas\" gasto na viagem?: ");
            double tempo = viagem.nextDouble();

            System.out.println("Qual foi a velocidade media \"em Km\\h\"?");
            double velocidade = viagem.nextDouble();

            double distancia = tempo * velocidade;
            double litros = (int) (distancia / 12);

            System.out.println("Segue as Informaces abaixo!");
            System.out.println("Foi percorrida uma velocidade media de " + velocidade + "Km\\h.");
            System.out.println("Tempo gasto foi de " + tempo + " horas.");
            System.out.println("Com distancia percorrida de " + distancia + " Km.");
            System.out.println("Foram consumidos " + litros + " litros de combustivel.");

            System.out.println("Estes foram os dados de sua viagem! Deseja refazer? (S/N)");
            String opcao = viagem.next();

            if (!opcao.equalsIgnoreCase("S")) {
                refazer = false;
            } else {
                refazer = true;
            }
        }
        System.out.println("Programa encerrado. Obrigado!");

        viagem.close();
    }
}
