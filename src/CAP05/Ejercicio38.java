package CAP05;

/* Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error. */
public class Ejercicio38 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura del reloj de arena: ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            if (!(altura % 2 == 0) & (altura >= 3)) {
                int pintar1 = 2;
                int pintar2 = altura - 1;
                for (int i = 1; i <= altura; i++) {
                    for (int asteriscos = 1; asteriscos <= altura; asteriscos++) {
                        if (i < (altura / 2) + 1) {
                            if (i == 1)
                                System.out.print("*");
                            else {
                                if (asteriscos >= pintar1 & asteriscos <= pintar2)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                        } else if (i > (altura / 2) + 1) {
                            if (i == altura)
                                System.out.print("*");
                            else {
                                if (asteriscos >= pintar1 & asteriscos <= pintar2)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                        } else {
                            if (asteriscos == (altura / 2) + 1)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                    }
                    if (i != 1 & i != altura / 2 + 1 & i < altura / 2 + 1) {
                        pintar1++;
                        pintar2--;
                    } else if (i >= altura / 2 + 1 & i != altura) {
                        pintar1--;
                        pintar2++;
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduzca una altura superior a 3 e IMPAR.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
