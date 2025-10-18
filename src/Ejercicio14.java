import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el número límite: ");
        int numberLimit = sc.nextInt();

        float acumulador = 0;
        String secuencia = "";

        for (int i = 1; i <= numberLimit; i++) {
            if (i % 2 != 0) { // Solo los impares
                acumulador += 1.0f / (i * i);
                secuencia += " + 1/(" + i + "*" + i + ")";
            }
        }

        System.out.println("La secuencia de números es:" + secuencia);
        System.out.println("El resultado de S es: " + acumulador);
    }
}
