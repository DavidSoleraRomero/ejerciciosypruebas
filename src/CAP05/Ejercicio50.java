package CAP05;

/* Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura. */
public class Ejercicio50 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura (5 como mínimo): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el número de espacios entre los números (1 mínimo): ");
        int espacios = Integer.parseInt(System.console().readLine());
        int espacios2 = espacios * 2;
        if (altura >= 5 & espacios >= 1) {
            for (int i = 1; i <= altura; i++) {
                for (int asteriscos = 1; asteriscos <= 9 + espacios * 2; asteriscos++) {
                    if (i == 1 | i == 3 | i == altura) {
                        if ((asteriscos == 1) | (asteriscos >= 2 + espacios & asteriscos < 6 + espacios)
                                | (asteriscos > 5 + espacios2 & asteriscos <= 5 + espacios2 + 4)) {
                            System.out.print("*");
                        } else
                            System.out.print(" ");
                    }
                    if (i == 2) {
                        if (asteriscos == 1 | asteriscos == 2 + espacios | asteriscos == 6 + espacios2) {
                            System.out.print("*");
                        } else
                            System.out.print(" ");
                    }
                    if (i >= 4 & i < altura) {
                        if (asteriscos == 1)
                            System.out.print("*");
                        else if (asteriscos == 5 + espacios)
                            System.out.print("*");
                        else if (asteriscos == 9 + espacios2)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else
            System.out.println("Introduzca una altura superior/igual a 5 y espacios superior/igual a 1.");
    }
}