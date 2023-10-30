package CAP05;

/* Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error. */
public class Ejercicio35 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la X: ");
        int altura = Integer.parseInt(System.console().readLine());
        int centro = (altura / 2) + 1;
        int pintar = 2;
        int pintar2 = altura - 1;
        if ((altura >= 3) && (altura % 2 != 0)) {
            for (int i = 1; i <= altura; i++) {
                for (int asteriscos = 1; asteriscos <= altura; asteriscos++) {
                    if (i < centro) {
                        if (i == 1) {
                            if (asteriscos == 1 | asteriscos == altura) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        } else {
                            if (asteriscos == pintar | asteriscos == pintar2) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        }
                    } else if (i > centro) {
                        if (i == altura) {
                            if (asteriscos == 1 | asteriscos == altura) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        } else {
                            if (asteriscos == pintar | asteriscos == pintar2) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        }
                    } else {
                        if (asteriscos == centro) {
                            System.out.print("*");
                        } else
                            System.out.print(" ");
                    }
                }
                if ((i != 1) && (i != altura) && (i != (altura / 2) + 1) && !(i > (altura / 2) + 1)) {
                    pintar++;
                    pintar2--;
                } else if (i >= (altura / 2) + 1) {
                    pintar--;
                    pintar2++;
                }
                System.out.println();
            }
        } else
            System.out.println("Introduce un número superior o igual a 3 y que sea IMPAR.");
    }
}
