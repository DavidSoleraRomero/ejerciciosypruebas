package CAP05;

public class Ejercicio35v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la X: ");
            int altura = Funciones.entradaInt();
            if (altura >= 3 & altura % 2 != 0) {
                int altura1 = altura / 2 + 1;
                for (int i = altura1; i >= 1; i--) {
                    for (int espacios = 1; espacios <= altura1 - i; espacios++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos = 1; asteriscos <= i * 2 - 1; asteriscos++) {
                        if (asteriscos == 1 | asteriscos == i * 2 - 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                for (int i = 2; i <= altura1; i++) {
                    for (int espacios = 1; espacios <= altura1 - i; espacios++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos = 1; asteriscos <= i * 2 - 1; asteriscos++) {
                        if (asteriscos == 1 | asteriscos == i * 2 - 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Error. Se necesita una altura mayor o igual que 3 impar.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}