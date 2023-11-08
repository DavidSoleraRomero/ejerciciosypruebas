package CAP05;

public class Ejercicio59v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura del árbol (mayor o igual a 4): ");
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 4) {
                altura = altura - 2;
                for (int i = 1; i < altura; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                for (int i = 1; i <= altura; i++) {
                    for (int espacios = 1; espacios <= altura - i; espacios++) {
                        System.out.print(" ");
                    }
                    for (int asteriscos = 1; asteriscos <= i * 2 - 1; asteriscos++) {
                        if (i == altura)
                            System.out.print("^");
                        else if (asteriscos == 1 | asteriscos == i * 2 - 1)
                            System.out.print("^");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                for (int i = 1; i < altura; i++) {
                    System.out.print(" ");
                }
                System.out.println("Y");
            } else
                System.out.println("Se esperaba una altura superior o igual a 4");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
