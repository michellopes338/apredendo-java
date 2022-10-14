import java.util.Scanner;

/**
 * Condicionais
 */
public class Condicionais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos anos vc tem? ");
        byte idade = leitor.nextByte();
        System.out.println("Está acompanhado por quantas pessoas? ");
        byte acompanhantes = leitor.nextByte();

        if (idade >= 18 || acompanhantes >= 2) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Tudo bem, pode entrar!");
        }
        leitor.close();
    }
}