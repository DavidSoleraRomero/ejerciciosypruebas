package CAP04;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Introduce con qué símbolo quieres pintar: ");
        String simbolo = System.console().readLine();
        System.out.println("1. Pirámide arriba");
        System.out.println("2. Pirámide abajo");
        System.out.println("3. Pirámide derecha");
        System.out.println("4. Pirámide izquierda");
        System.out.println();
        int decision = Integer.parseInt(System.console().readLine());
        switch (decision) {
            case 1:
                System.out.println("Pintando...");
                System.out.printf("    %s    \n", simbolo);
                System.out.printf("   %s%s%s   \n", simbolo, simbolo, simbolo);
                System.out.printf("  %s%s%s%s%s  \n", simbolo, simbolo, simbolo, simbolo, simbolo);
                System.out.printf(" %s%s%s%s%s%s%s \n", simbolo, simbolo, simbolo, simbolo, simbolo, simbolo, simbolo);
                System.out.printf("%s%s%s%s%s%s%s%s%s\n", simbolo, simbolo, simbolo, simbolo, simbolo, simbolo, simbolo,
                        simbolo, simbolo);
                break;
            case 2:
                System.out.println("Pintando...");
                System.out.printf("%s%s%s%s%s%s%s%s%s\n", simbolo, simbolo, simbolo, simbolo, simbolo, simbolo, simbolo,
                        simbolo, simbolo);
                System.out.printf(" %s%s%s%s%s%s%s \n", simbolo, simbolo, simbolo, simbolo, simbolo, simbolo, simbolo);
                System.out.printf("  %s%s%s%s%s  \n", simbolo, simbolo, simbolo, simbolo, simbolo);
                System.out.printf("   %s%s%s   \n", simbolo, simbolo, simbolo);
                System.out.printf("    %s    \n", simbolo);
                break;
            case 3:
                System.out.println("Pintando...");
                System.out.printf("%s\n", simbolo);
                System.out.printf("%s%s\n", simbolo, simbolo);
                System.out.printf("%s%s%s\n", simbolo, simbolo, simbolo);
                System.out.printf("%s%s%s%s\n", simbolo, simbolo, simbolo, simbolo);
                System.out.printf("%s%s%s%s%s\n", simbolo, simbolo, simbolo, simbolo, simbolo);
                System.out.printf("%s%s%s%s\n", simbolo, simbolo, simbolo, simbolo);
                System.out.printf("%s%s%s\n", simbolo, simbolo, simbolo);
                System.out.printf("%s%s\n", simbolo, simbolo);
                System.out.printf("%s\n", simbolo);
                break;
            case 4:
                System.out.println("Pintando...");
                System.out.printf("    %s\n", simbolo);
                System.out.printf("   %s%s\n", simbolo, simbolo);
                System.out.printf("  %s%s%s\n", simbolo, simbolo, simbolo);
                System.out.printf(" %s%s%s%s\n", simbolo, simbolo, simbolo, simbolo);
                System.out.printf("%s%s%s%s%s\n", simbolo, simbolo, simbolo, simbolo, simbolo);
                System.out.printf(" %s%s%s%s\n", simbolo, simbolo, simbolo, simbolo);
                System.out.printf("  %s%s%s\n", simbolo, simbolo, simbolo);
                System.out.printf("   %s%s\n", simbolo, simbolo);
                System.out.printf("    %s\n", simbolo);
                break;

            default:
                System.out.println("Saliendo...");
                break;
        }
    }

}
