import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor ingrese un número mayor que cero.");
        } else {
            System.out.println("Los números del 1 al " + numero + " son:");
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
                suma = suma + i;
            }
            System.out.println("La suma de los números del 1 al " + numero + " es: " + suma);
        }

        sc.close();
    }
}
