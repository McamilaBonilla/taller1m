import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;
        String serie = "";

        System.out.print("Ingrese el valor de n: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Debe ingresar un número mayor que cero.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    suma -= i;
                    serie += " - " + i;
                } else {
                    if (i == 1) {
                        serie += i;
                    } else {
                        serie += " + " + i;
                    }
                    suma += i;
                }
            }

            if (n == 1) {
                System.out.println("La suma de la serie S = " + serie + " es: " + suma);
            } else {
                System.out.println("La suma de la serie S = " + serie + " es: " + suma);
            }
        }

        sc.close();
    }
}

