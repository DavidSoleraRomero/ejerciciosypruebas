package CAP05;

/* Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura. */
public class Ejercicio60 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de los calcetines: ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            for (int i = 1; i <= altura; i++) {
                for (int asteriscos = 1; asteriscos <= 14; asteriscos++) {
                    if (i >= altura - 1) {
                        if (asteriscos != 7 & asteriscos != 8) {
                            System.out.print("*");
                        } else
                            System.out.print(" ");
                    } else if (asteriscos <= 3 | (asteriscos >= 9 & asteriscos <= 11))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Introduce un número.");
        }
    }
}
