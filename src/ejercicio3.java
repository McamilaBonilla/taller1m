import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unidad;
        int decena;
        int centena;
        String textoCentena = "";
        String textoDecena = "";
        String textoUnidad = "";
        String numeroEnTexto = "";
        System.out.print("Ingrese el primer número (centenas, entre 0 y 9): ");
        centena = sc.nextInt();

        System.out.print("Ingrese el segundo número (decenas, entre 0 y 9): ");
        decena = sc.nextInt();

        System.out.print("Ingrese el tercer número (unidades, entre 0 y 9): ");
        unidad = sc.nextInt();
        if (centena == 1) textoCentena = "cien";
        else if (centena == 2)  textoCentena = "doscientos";
        else if (centena == 3) textoCentena = "Trescientos";
        else if (centena == 4) textoCentena = "Cuatrocientos";
        else if (centena == 5) textoCentena = "Quinientos";
        else if (centena == 6) textoCentena = "Seiscientos";
        else if (centena == 7) textoCentena = "Setecientos";
        else if (centena == 8) textoCentena = "Ochocientos";
        else if (centena == 9) textoCentena = "Novecientos";

        if (decena == 1) textoDecena = "Diez";
        else if (decena == 2) textoDecena = "veinte";
        else if (decena == 3) textoDecena = "treinta";
        else if (decena == 4) textoDecena = "cuarenta";
        else if (decena == 5) textoDecena = "cincuenta";
        else if (decena == 6) textoDecena = "sesenta";
        else if (decena == 7) textoDecena = "setenta";
        else if (decena == 8) textoDecena = "ochenta";
        else if (decena == 9) textoDecena = "noventa";

        if (unidad == 1) textoUnidad = "Uno";
        else if (unidad == 2) textoUnidad = "dos";
        else if (unidad == 3) textoUnidad = "tres";
        else if (unidad == 4) textoUnidad = "cuatro";
        else if (unidad == 5) textoUnidad = "cinco";
        else if (unidad == 6) textoUnidad = "seis";
        else if (unidad == 7) textoUnidad = "siete";
        else if (unidad == 8) textoUnidad = "ocho";
        else if (unidad == 9) textoUnidad = "nueve";

        System.out.println(textoCentena + "" + textoDecena + "" + textoUnidad);

    }
}
