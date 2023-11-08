package CAP05;

public class Ejercicio61v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la V: ");
            int altura = Funciones.entradaInt();
            int espacios = (altura - 1) * 2;
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                if (i != altura - 1) {
                    System.out.printf("%s%-" + espacios + "s%s", "***", " ", "***");
                    espacios -= 2;
                    System.out.println();
                }
            }
            System.out.print("******");
        } catch (Exception e) {
            System.out.println("Error. Se esperaba un nº entero.");
        }
    }
}