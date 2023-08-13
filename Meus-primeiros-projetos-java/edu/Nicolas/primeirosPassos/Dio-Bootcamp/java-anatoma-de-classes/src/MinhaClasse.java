public class Operadores {
    
public static void main(String[] args) {
    
    String primeroNome = "Nicolas";
    String segundoNome = "Henrique";

    String nomeCompleto = nomeCompleto (primeroNome,segundoNome);

    System.out.println(nomeCompleto);

}
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}