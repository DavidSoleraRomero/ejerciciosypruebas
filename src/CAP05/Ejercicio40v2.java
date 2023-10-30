package CAP05;

public class Ejercicio40v2 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura: ");
        try {
            int altura = Funciones.entradaInt();
            if (altura >= 3 & altura % 2 != 0) {
                int altura1 = altura / 2 + 1;
                for (int i = 1; i <= altura1; i++) {
                    for (int espacios = 1; espacios <= altura - i; espacios++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos = 1; asteriscos <= i * 2 - 1; asteriscos++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = altura1 - 1; i >= 1; i--) {
                    for (int espacios = 1; espacios <= altura - i; espacios++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos = 1; asteriscos <= i * 2 - 1; asteriscos++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Se ha producido un error. Se esperaba un nº impar mayor que 3");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
