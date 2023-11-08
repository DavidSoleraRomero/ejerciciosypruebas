package CAP05;

public class Ejercicio54v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide: ");
            int altura = Funciones.entradaInt();
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura - i; j++) {
                    if (j == 0 | j == altura - i - 1 | i == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Se produjo un error. Se esperaba un nº.");
        }
    }
}
