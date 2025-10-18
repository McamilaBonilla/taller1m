public class Ejercicio18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Tabla del " + i);
            for (int a = 1; a <= 10; a++) {
                System.out.println(i + " x " + a + " = " + (i * a));
            }
        }
    }
}