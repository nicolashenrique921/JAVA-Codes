import java.util.Scanner;

public class MediaFinal {

    public static void main(String[] args) throws Exception {
        Scanner Media = new Scanner(System.in);

        System.out.println("Qaul foi a nota de sua AC1?: ");
        int AC1 = Media.nextInt();

        System.out.println("Qual foi sua nota na AC2?: ");
        int AC2 = Media.nextInt();

        System.out.println("Qual foi a nota de sua Avaliacao Geral?: ");
        int AG = Media.nextInt();

        System.out.println("Qual foi a nota de sua Avaliacao Final?: ");
        int AF = Media.nextInt();

        double MF = ((AC1 * 0.15) + (AC2 *0.30) + (AG * 0.10) + (AF * 0.45));
        String MediaFinal = String.format("%.2f", MF);

        System.out.println("Sua Media final e: "+MediaFinal);

        Media.close();
    }
}
