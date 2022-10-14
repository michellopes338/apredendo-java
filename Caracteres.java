/**
 * Caracteres
 */
public class Caracteres {

    public static void main(String[] args) {
        // char (tipo primitivo)
        char letra = 65;
        System.out.println(letra); // A
        letra = (char) (letra + 1); // muda de caractere de acordo com a tabela unicode
        System.out.println(letra); // B

        // String
        String empresa = "Minha Empresa LTDA";
        empresa = empresa + 2020; // concatena
        System.out.println(empresa); // Minha Empresa LTDA2020
    }
}