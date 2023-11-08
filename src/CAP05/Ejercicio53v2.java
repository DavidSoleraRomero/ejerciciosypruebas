package CAP05;

public class Ejercicio53v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide: ");
            int altura = Funciones.entradaInt();
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
