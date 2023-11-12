package CAP05;

public class EjercicioPirInv {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce altura pirámide: ");
            int altura = Funciones.entradaInt();
            if (altura > 1) {
                for (int i = 0; i < altura; i++) {
                    for (int esp = 1; esp <= i; esp++) {
                        System.out.print(" ");
                    }
                    for (int ast = 1; ast <= (altura - i) * 2 - 1; ast++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Altura mayor de 1 por favor.");
        } catch (Exception e) {
            System.out.println("Error. Se esperaba nº entero.");
        }
    }
}
