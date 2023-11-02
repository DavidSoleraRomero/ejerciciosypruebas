package CAP05;

/* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores. */
public class Ejercicio33 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la U: ");
            int altura = Integer.parseInt(System.console().readLine());
            if (altura > 2) {
                for (int i = 1; i <= altura; i++) {
                    for (int asteriscos = 1; asteriscos <= altura * 2 - 1; asteriscos++) {
                        if (i == altura) {
                            if ((asteriscos == 1) || (asteriscos == (altura * 2) - 1)) {
                                System.out.print(" ");
                            } else if (asteriscos % 2 == 0) {
                                System.out.print(" ");
                            } else
                                System.out.print("*");
                        } else if ((asteriscos == 1) || (asteriscos == (altura * 2) - 1)) {
                            System.out.print("*");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduzca una altura superior a 2 (no incluida)");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
