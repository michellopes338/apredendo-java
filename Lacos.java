/**
 * Lacos
 */
public class Lacos {

    public static void main(String[] args) {
        byte contador = 0;
        int total = 0;
        while (contador <= 10) {
            System.out.println("impressão n " + contador);
            total += contador;
            System.out.println(total);
            contador++;
        }
    }
}