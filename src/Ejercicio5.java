import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaDeCumple;
        int mesDeCumple;
        String mes = "";
        String diaTexto = "";

        System.out.println("Ingrese el día del cumpleaños:");
        diaDeCumple = sc.nextInt();

        System.out.println("Ingrese el mes del cumpleaños:");
        mesDeCumple = sc.nextInt();

        switch (diaDeCumple) {
            case 1: diaTexto = "uno";
            break;
            case 2: diaTexto = "dos";
            break;
            case 3: diaTexto = "tres";
            break;
            case 4: diaTexto = "cuatro";
            break;
            case 5: diaTexto = "cinco";
            break;
            case 6: diaTexto = "seis";
            break;
            case 7: diaTexto = "siete";
            break;
            case 8: diaTexto = "ocho";
            break;
            case 9: diaTexto = "nueve";
            break;
            case 10: diaTexto = "diez";
            break;
            case 11: diaTexto = "once";
            break;
            case 12: diaTexto = "doce";
            break;
            case 13: diaTexto = "trece";
            break;
            case 14: diaTexto = "catorce";
            break;
            case 15: diaTexto = "quince";
            break;
            case 16: diaTexto = "dieciséis";
            break;
            case 17: diaTexto = "diecisiete";
            break;
            case 18: diaTexto = "dieciocho";
            break;
            case 19: diaTexto = "diecinueve";
            break;
            case 20: diaTexto = "veinte";
            break;
            case 21: diaTexto = "veintiuno";
            break;
            case 22: diaTexto = "veintidós";
            break;
            case 23: diaTexto = "veintitrés";
            break;
            case 24: diaTexto = "veinticuatro";
            break;
            case 25: diaTexto = "veinticinco";
            break;
            case 26: diaTexto = "veintiséis";
            break;
            case 27: diaTexto = "veintisiete";
            break;
            case 28: diaTexto = "veintiocho";
            break;
            case 29: diaTexto = "veintinueve";
            break;
            case 30: diaTexto = "treinta";
            break;
            case 31: diaTexto = "treinta y uno";
            break;
            default: diaTexto = "inválido";
            break;
        }

        switch (mesDeCumple) {
            case 1: mes = "enero";
            break;
            case 2: mes = "febrero";
            break;
            case 3: mes = "marzo";
            break;
            case 4: mes = "abril";
            break;
            case 5: mes = "mayo";
            break;
            case 6: mes = "junio";
            break;
            case 7: mes = "julio";
            break;
            case 8: mes = "agosto";
            break;
            case 9: mes = "septiembre";
            break;
            case 10: mes = "octubre";
            break;
            case 11: mes = "noviembre";
            break;
            case 12: mes = "diciembre";
            break;
            default: mes = "inválido";
            break;
        }

        if (diaTexto.equals("inválido") || mes.equals("inválido")) {
            System.out.println("La fecha ingresada no es válida.");
        } else {
            System.out.println("Cumple años el " + diaTexto + " de " + mes + ".");
        }

        sc.close();
    }
}
