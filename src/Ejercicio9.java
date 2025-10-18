import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int par;
        int suma = 0;
        System.out.println("Ingrese un numero de pares a sumar: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("El numero debe ser mayor que 0");
        } else {
            System.out.println("los numeros pares de" + n + " son: ");
            for (int i = 1; i <= n; i++) {
                par = i * 2;
                System.out.println(par);
                suma += par;
            }
            System.out.println("la suma de los numeros pares de " + n + " son: " + suma);
        }
        sc.close();
    }
}

