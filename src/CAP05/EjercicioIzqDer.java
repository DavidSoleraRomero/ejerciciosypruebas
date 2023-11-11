package CAP05;

public class EjercicioIzqDer {
    public static void main(String[] args) {
        try {
            System.out.print("Altura de las pirámides: ");
            int altura = Funciones.entradaInt();
            if (altura >= 2) {
                altura = altura * 2 - 1;
                int aux = 1;
                for (int i = 1; i <= altura; i++) {
                    for (int ast1 = 1; ast1 <= aux; ast1++) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                    if (i != altura / 2 + 1) {
                        System.out.printf("%-" + (altura - aux - altura / 2) + "s", " ");
                        System.out.printf("%-" + (altura - aux - altura / 2) + "s", " ");
                    }
                    for (int ast1 = 1; ast1 <= aux; ast1++) {
                        System.out.print("*");
                    }
                    if (i <= altura / 2)
                        aux++;
                    else
                        aux--;
                    System.out.println();
                }
            } else
                System.out.println("Se esperaba altura mayor que 1");
        } catch (Exception e) {
            System.out.println("\nError. Se esperaba un nº.");
        }
    }
}
