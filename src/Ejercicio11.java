import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int factorialTotal = 1;
        System.out.println("ingrese un numero para calcular su factorial: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
            factorialTotal = factorialTotal * i;
        }
        System.out.println("el total del factorial es: " + factorialTotal);
    }
}