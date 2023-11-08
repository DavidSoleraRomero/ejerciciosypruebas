package CAP05;

public class Ejercicio69 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide maya (3 o más): ");
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 3) {
                for (int i = 1; i <= altura; i++) {
                    /* Espacios antes de pintar asteriscos */
                    for (int espacios = 1; espacios <= altura - i; espacios++) {
                        System.out.print(" ");
                    }
                    /* Pintando asteriscos, incluyendo los espacios del centro */
                    for (int astericos = 1; astericos <= 4 + i * 2; astericos++) {
                        if (i % 2 == 0) {
                            if ((astericos >= 1 & astericos <= i) | (astericos > i + 4))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        } else
                            System.out.print("*");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduce un nº superior o igual a 3.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}