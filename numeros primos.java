public class Primo {
    public static void main(String[] args) {
        int numero = 29;
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}