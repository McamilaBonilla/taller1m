import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroLimite;
        int resultadoSuma = 0;
        System.out.println("Ingrese el número límite de la serie: ");
        numeroLimite = sc.nextInt();
        for (int i = 1; i <= numeroLimite; i++) {
            if (i % 3 == 0) {
                System.out.println(" - " + i);
                resultadoSuma -= i;
            } else {
                System.out.println(" + " + i);
                resultadoSuma += i;
            }
        }
        System.out.println("El resultado final es: " + resultadoSuma);
    }
}