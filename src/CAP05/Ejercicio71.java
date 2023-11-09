package CAP05;

public class Ejercicio71 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide invertida: ");
            int altura = Funciones.entradaInt();
            if (altura >= 2) {
                int limite = altura * 2 - 1;
                for (int i = 1; i <= altura; i++) {
                    for (int esp = 1; esp < i; esp++) {
                        System.out.print(" ");
                    }
                    for (int ast = 1; ast <= limite; ast++) {
                        System.out.print("*");
                    }
                    limite -= 2;
                    System.out.println();
                }
            } else
                System.out.println("Introduce altura mayor o igual a 2");
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº entero.");
        }
    }
}
