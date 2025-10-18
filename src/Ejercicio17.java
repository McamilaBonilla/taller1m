import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        int suma = 0;
        int impar = 1;

        for (int i = 1; i <= n; i++) {
            suma += impar;
            System.out.println(i + "^2 = " + suma);
            impar += 2;
        }
    }
}
