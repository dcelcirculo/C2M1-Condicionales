import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /*
         * if(condicion){
         * instrucciones
         * }else{
         * instrucciones
         * }
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el numero: ");
        int numero = entrada.nextInt();

        // Implementar condicionales
        if (numero == 0) {
            System.out.println("El numero " + numero + " es nulo");
        } else if (numero >= 0) {
            System.out.println("El numero " + numero + " es positivo");
        } else {
            System.out.println("El numero " + numero + " es negativo");
        }
    }
}
