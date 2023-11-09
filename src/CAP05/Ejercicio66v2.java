package CAP05;

public class Ejercicio66v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la figura (impar mayor o igual que 3): ");
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 3 & altura % 2 != 0) {
                String cadena = "*%-4s*";
                int espacios = 0;
                for (int i = 1; i <= altura; i++) {
                    if (i < altura / 2 + 1) {
                        if (i != 1)
                            System.out.printf("%-" + espacios + "s", " ");
                        System.out.printf(cadena + "\n", " ");
                        espacios++;
                    } else {
                        if (espacios != 0)
                            System.out.printf("%-" + espacios + "s", " ");
                        System.out.printf(cadena + "\n", " ");
                        espacios--;
                    }
                }
            } else
                System.out.println("Introduzca un nº impar mayor o igual que 3");
        } catch (Exception e) {
            System.out.println("Error. Se espacioseraba un nº entero.");
        }
    }
}
