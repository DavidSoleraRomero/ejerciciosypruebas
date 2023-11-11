package CAP05;

public class EjercicioIzquierda {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide hacia la izquierda: ");
            int altura = Funciones.entradaInt();
            if (altura >= 2) {
                altura = altura * 2 - 1;
                int aux = 1;
                for (int i = 1; i <= altura; i++) {
                    if (i != altura / 2 + 1)
                        System.out.printf("%-" + (altura - aux - (altura / 2)) + "s", " ");
                    for (int ast = 1; ast <= aux; ast++) {
                        System.out.print("*");
                    }
                    if (i <= altura / 2)
                        aux++;
                    else
                        aux--;
                    System.out.println();
                }
            } else
                System.out.println("Se esperaba altura superior a 1");
        } catch (Exception e) {
            System.out.print("\nSe ha producido un error. Se esperaba un nº entero.");
        }
    }
}
