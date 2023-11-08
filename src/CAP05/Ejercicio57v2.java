package CAP05;

public class Ejercicio57v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide invertida: ");
            int altura = Funciones.entradaInt();
            for (int i = 0; i < altura; i++) {
                for (int espacios = 1; espacios <= i; espacios++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= altura - i; j++) {
                    if (i == 0 | j == 1 | j == altura - i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº entero.");
        }
    }
}
