package CAP05;

/* Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error. */
public class Ejercicio40 {
    public static void main(String[] args) {
        System.out.print("Introduce un número impar mayor o igual a 3: ");
        int altura = Integer.parseInt(System.console().readLine());
        if (altura >= 3 & altura % 2 != 0) {
            int pinta1 = altura / 2 + 1;
            int pinta2 = altura / 2 + 1;
            for (int i = 1; i <= altura; i++) {
                for (int asteriscos = 1; asteriscos <= altura; asteriscos++) {
                    if (i <= altura / 2 + 1) {
                        if (asteriscos == pinta1 | asteriscos == pinta2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (asteriscos == pinta1 | asteriscos == pinta2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                if (i < altura / 2 + 1) {
                    pinta1--;
                    pinta2++;
                } else if (i >= altura / 2 + 1) {
                    pinta1++;
                    pinta2--;
                }
                System.out.println();
            }
        } else {
            System.out.println("Introduzca un número IMPAR y mayor que 3.");
        }
    }
}
