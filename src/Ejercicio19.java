import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de ciclos: ");
        int numberLimit = sc.nextInt();

        float acumulador = 0;
        String secuencia = "";

        for (int i = 1; i <= numberLimit; i++) {
            acumulador += (float) (i * 2) / (i * 2 + 1);
            secuencia += (i * 2) + "/" + (i * 2 + 1) + " ";
        }

        System.out.println("La secuencia de números es: " + secuencia);
        System.out.println("El resultado de la suma es: " + acumulador);
    }
}
