/**
 * Lacos
 */
public class Lacos {

    public static void main(String[] args) {
        // WHILE
        // byte contador = 0;
        // int total = 0;
        // while (contador <= 10) {
        //     System.out.println("impressão n " + contador);
        //     total += contador;
        //     System.out.println(total);
        //     contador++;
        // }

        // FOR
        // for (int contador = 0; contador < 10; contador++) {
        //     System.out.println("impressão n " + contador);
        // }

        for (int linha = 1; linha < 10; linha++) {
            for (int coluna = 1; coluna < 10; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}