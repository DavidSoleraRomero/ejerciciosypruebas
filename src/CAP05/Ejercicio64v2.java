package CAP05;

public class Ejercicio64v2 {
    public static void main(String[] args) {
        try {
            int opcion = 0;
            int anchura = 6;
            int altura = 3;
            do {
                System.out.println();
                rectangulo(anchura, altura);
                menu();
                opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        anchura++;
                        altura++;
                        break;
                    case 2:
                        if (anchura - 1 >= 2 & altura - 1 >= 2) {
                            anchura--;
                            altura--;
                        } else
                            System.out.println("La altura o anchura no pueden ser inferior a 2");
                        break;
                    case 3:
                        int aux = anchura;
                        anchura = altura;
                        altura = aux;
                        break;
                    case 4:
                        System.out.println("Gracias por utilizar nuestro programa.");
                        System.out.print("Cerrando el programa");
                        for (int i = 1; i <= 6; i++) {
                            System.out.print(".");
                            Thread.sleep(475);
                        }
                }
            } while (opcion != 4);
        } catch (Exception e) {
            System.out.println("Error. Se esperaba un nº entero.");
        }

    }

    public static void menu() {
        System.out.println("1. Agrandarlo");
        System.out.println("2. Achicarlo");
        System.out.println("3. Cambiar la orientación");
        System.out.println("4. Salir");
        System.out.print("Indique qué quiere hacer con el rectángulo: ");
    }

    public static void rectangulo(int anchura, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= anchura; j++) {
                if (i == 1 | i == altura | j == 1 | j == anchura)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
