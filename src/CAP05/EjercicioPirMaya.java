package CAP05;

public class EjercicioPirMaya {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide maya: ");
            int altura = Funciones.entradaInt();
            if (altura > 1) {
                for (int i = 1; i <= altura; i++) {
                    for (int esp = 1; esp <= altura - i; esp++) {
                        System.out.print(" ");
                    }
                    for (int ast = 1; ast <= i * 2 - 1 + 5; ast++) {
                        if (i % 2 == 0 & ast > i & ast <= i + 4)
                            System.out.print(" ");
                        else
                            System.out.print("*");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Altura superior a 1 por favor");
        } catch (Exception e) {
            System.out.println("Error. Se esperaba nº entero.");
        }
    }
}
