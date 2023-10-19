package CAP05;

/* Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
una al lado de la otra y separadas por un espacio en su base. */
public class Ejercicio63 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la primera pirámide: ");
        try {
            int altura1 = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce la altura de la segunda pirámide: ");
            int altura2 = Integer.parseInt(System.console().readLine());
            int mayor;
            int menor;
            int k = 0;
            if (altura1 > altura2) {
                mayor = altura1;
                menor = altura2;
            } else {
                mayor = altura2;
                menor = altura1;
                k = menor;
            }
            int j = 1;
            for (int i = 1; i <= mayor; i++) {
                if (altura1 >= altura2) {
                    // Pirámide 1
                    for (int espacios = 1; espacios <= altura1 - i; espacios++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos = 1; asteriscos <= i * 2 - 1; asteriscos++) {
                        System.out.print("*");
                    }
                    // Pirámide 2
                    if (i > altura1 - altura2) {
                        for (int espacios = 1; espacios <= menor * 2 - 1; espacios++) {
                            System.out.print(" ");
                        }
                        menor--;
                        for (int asteriscos = 1; asteriscos <= j; asteriscos++) {
                            System.out.print("*");
                        }
                        j += 2;
                    }
                } else {
                    if (i <= altura2 - altura1) {
                        // Pirámide 1
                        for (int espacios = 1; espacios <= ((altura1 * 2) + altura2 - i); espacios++) {
                            System.out.print(" ");
                        }
                        for (int asteriscos = 1; asteriscos <= i * 2 - 1; asteriscos++) {
                            System.out.print("*");
                        }
                    } else {
                        // Pirámide 1
                        for (int espacios = 1; espacios <= altura1 - j; espacios++) {
                            System.out.print(" ");
                        }
                        for (int asteriscos = 1; asteriscos <= j * 2 - 1; asteriscos++) {
                            System.out.print("*");
                        }
                        j++;
                        // Pirámide 2
                        for (int espacios = 1; espacios <= k * 2 - 1; espacios++) {
                            System.out.print(" ");
                        }
                        k--;
                        for (int asteriscos = 1; asteriscos <= i * 2 - 1; asteriscos++) {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}