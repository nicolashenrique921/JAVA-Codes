public class MinhaClasse_concatenando_um_nome_completo {
    
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