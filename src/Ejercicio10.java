import java.util.Scanner;

public class Ejercicio10 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    int impar;
    int suma = 0;
    System.out.println("Ingrese la cantidad de números impares a sumar: ");
    n = sc.nextInt();
    if (n <= 0) {
        System.out.println("El numero debe ser mayor que 0");
    } else {
        System.out.println("los numeros impares de " + n + " son: ");
        for (int i = 1; i <= n; i++) {
            impar = (i * 2) - 1;
            System.out.println(impar);
            suma += impar;
        }
        System.out.println("la suma de los numeros pares de " + n + " son: " + suma);
    }
    sc.close();
}
}


