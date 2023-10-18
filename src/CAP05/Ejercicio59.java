package CAP05;

/* Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4. */
public class Ejercicio59 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura del árbol (Mayor o igual a 4): ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 4) {
                for (int i = 1; i <= altura; i++) {
                    for (int espacios = 2; espacios <= altura - i; espacios++) {
                        if (i > 1 & i < altura)
                            System.out.print(" ");
                    }
                    if (i == 1 | i == altura) {
                        for (int estrellaY = 1; estrellaY <= altura * 2; estrellaY++) {
                            if (i == 1) {
                                if (estrellaY == ((altura - 2) * 2) / 2)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            if (i == altura) {
                                if (estrellaY == ((altura - 2) * 2) / 2)
                                    System.out.print("Y");
                                else
                                    System.out.print(" ");
                            }
                        }
                    }
                    for (int piramide = 1; piramide <= (i - 1) * 2 - 1; piramide++) {
                        if (i > 1 & i < altura) {
                            if (i == altura - 1)
                                System.out.print("^");
                            else if (piramide == 1 | piramide == (i - 1) * 2 - 1)
                                System.out.print("^");
                            else
                                System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            } else
                System.out.println("Altura incorrecta introducida.");
        } catch (Exception e) {
            System.out.println("Introduce un número.");
        }
    }
}
