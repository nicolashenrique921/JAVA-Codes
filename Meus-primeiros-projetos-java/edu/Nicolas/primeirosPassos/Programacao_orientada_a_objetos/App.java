import java.math.BigDecimal;

public class graoRei {
    public static void main(String[] args) throws Exception {
        int quadro = 64;
        BigDecimal dois = new BigDecimal(2);
        BigDecimal grao = new BigDecimal(1);
        BigDecimal graoTotal = new BigDecimal(0);

        for (int i = 1; i < quadro; i++){
            grao = grao.multiply(dois);
            graoTotal = graoTotal.add(grao);
        }
        System.out.println("O total de grão esperados é " + graoTotal);
    }
}
