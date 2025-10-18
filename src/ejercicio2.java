import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String mes;
        System.out.println("Ingrese el numero del mes: ");
        numero = sc.nextInt();
        switch (numero) {
            case 1:
                mes = "enero" ;
                break;
            case 2:
                mes = "febrero" ;
                break;
            case 3:
                mes = "marzo" ;
                break;
            case 4:
                mes = "abril" ;
                break;
            case 5:
                mes = "mayo" ;
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                System.out.println("el numero debe estar entre 1 y 12");
                return;
        }
        System.out.println("El mes es :" + mes);
        sc.close();
    }
}
