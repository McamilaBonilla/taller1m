import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String tipo;
     String color;
     int cantidad;
     int precioFlor = 0;
     int valorTotal = 0;
        System.out.println("ingrese el tipo de flor (rosa/clavel): ");
        tipo = sc.nextLine();
        System.out.println("ingrese el color de flor (rosa/clavel): ");
        color = sc.nextLine();
        System.out.println(" ingrese la cantidad de flores");
        cantidad = sc.nextInt();
        if (tipo.equals("rosa")) {
            if (color.equals("rojo")){
                if (cantidad<= 12) {
                    precioFlor = 1250;
                } else {
                    precioFlor = 1100;
                }
            } else {
                precioFlor = 1205;
            }
        } else if (tipo.equals("clavel")) {
            if (color.equals("blanco")) {
                if (cantidad <= 12) {
                    precioFlor = 1050;
                } else {
                    precioFlor = 1000;
                }
            } else {
                precioFlor = 1200;
            }
        } else {
            System.out.println("tipo de flor no valido");
            return;
        }
        valorTotal = precioFlor * cantidad;
        System.out.println("tipo de flor: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por flor: $" + precioFlor);
        System.out.println("Valor total: $" + valorTotal);
        sc.close();
    }
}
