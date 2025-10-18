import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nacionalidad;

        System.out.println("escriba el numero de su nacionalidad: 1.Colombia, 2.Venezuela, 3.Brasil, 4.Ecuador, 5.Perú, 6.Bolivia, 7.Chile, 8.Argentina, 9.Uruguay, 10.Paraguay");
        nacionalidad = sc.nextInt();
        switch (nacionalidad) {
            case 1:
                System.out.println("su gentilico es:Colombiano");
                break;
            case 2:
                System.out.println("su gentilico es:Venezolano");
                break;
            case 3:
                System.out.println("su gentilico es:Brasilero");
                break;
            case 4:
                System.out.println("su gentilico es:Ecuatoriano");
                break;
            case 5:
                System.out.println("su gentilico es:Peruano");
                break;
            case 6:
                System.out.println("su gentilico es:Boliviano");
                break;
            case 7:
                System.out.println("su gentilico es:Chileno");
                break;
            case 8:
                System.out.println("su gentilico es:Argentina");
                break;
            case 9:
                System.out.println("su gentilico es:Uruguayo");
                break;
            case 10:
                System.out.println("su gentilico es:paraguayo");
            default:
                System.out.println("el número debe estar entre 1 y 10.");
                return;
        }
        sc.close();
    }
}