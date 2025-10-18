import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroLimite;
        int resultadoSuma = 0;
        int negativo = 2;
        int salto = 3;
        System.out.println("Ingrese el número límite de la serie: ");
        numeroLimite = sc.nextInt();
        for (int i = 1; i <= numeroLimite; i++) {
            if (i == negativo) {
                System.out.println("-" + i);
                resultadoSuma -= i;
                negativo += salto;
                salto++;
            } else {
                System.out.println("+" + i);
                resultadoSuma += i;
            }
        }
        System.out.println("El resultado final es: " + resultadoSuma);
    }
}