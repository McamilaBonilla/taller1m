import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int multiplos;
        int sumaMultiplos = 0;
        int resultado = 0;
        System.out.println("Ingrese el numero del cual quiere saber los multiplos: ");
        numero = sc.nextInt();
        System.out.println("ingrese la cantidad de multiplos que desea: ");
        multiplos = sc.nextInt();
        for (int i = 1; i <= multiplos; i++) {
            resultado = numero * i;
            System.out.println(resultado);
            sumaMultiplos = sumaMultiplos + resultado;
        }
        System.out.println("El resultado es: " + sumaMultiplos);
    }
}