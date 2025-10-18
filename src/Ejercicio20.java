import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = scanner.nextInt();
        n *= 2;
        int alCuadrado = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                alCuadrado += i;
                System.out.println("Numero: " + i);
            }
        }
        System.out.println("Resultado de  numeros impares: " + alCuadrado);
        scanner.close();
    }
}
