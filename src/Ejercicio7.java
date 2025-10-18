import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número natural: ");
        numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Debe ingresar un número natural mayor que cero.");
        } else {
            System.out.println("Los primeros números naturales son: ");

            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
