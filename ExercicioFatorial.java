import java.util.Scanner;

/**
 * ExercicioFatorial
 * ## O seu desafio é imprimir os fatoriais de 1 a 10!
 */
public class ExercicioFatorial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("insira o valor para calcular fatorial");
        int fatorial = leitor.nextInt();
        leitor.close();
        int total = 1;

        for (int i = 1; i <= fatorial; i++) {
            total *= i;
        }

        System.out.println(total);
    }
}