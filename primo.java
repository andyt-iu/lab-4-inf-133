import java.util.Scanner;
public class primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        boolean esPrimo = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) { esPrimo = false; break; }
        }
        if (esPrimo && n > 1) System.out.println("Es primo");
        else System.out.println("No es primo");
    }
}