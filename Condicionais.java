import java.util.Scanner;

/**
 * Condicionais
 */
public class Condicionais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos anos vc tem? ");
        byte idade = leitor.nextByte();
        if (idade >= 18) {
            System.out.println("Vc já é maior de idade");
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Está acompanhado por quantas pessoas? ");
            byte acompanhantes = leitor.nextByte();
            if (acompanhantes <= 0) {
                System.out.println("Infelizmente vc não pode entrar");
            } else {
                System.out.println("Tudo bem, pode entrar!");
            }
        }
        leitor.close();
    }
}