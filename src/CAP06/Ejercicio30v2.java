package CAP06;

/* El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
una cuestión de física elemental, ninguno de los animales puede coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades. */
public class Ejercicio30v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce el ancho de la pecera (mínimo 4): ");
            int ancho = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce el alto de la prece (mínimo 4): ");
            int alto = Integer.parseInt(System.console().readLine());
            if (alto >= 4 & ancho >= 4) {
                ancho = ancho * 2 - 1;
                int posI1 = (int) (Math.random() * (alto - 2) + 2);
                int posJ1 = (int) (Math.random() * (ancho - 2) + 2);
                int posI2 = (int) (Math.random() * (alto - 2) + 2);
                int posJ2 = (int) (Math.random() * (ancho - 2) + 2);
                int posI3 = (int) (Math.random() * (alto - 2) + 2);
                int posJ3 = (int) (Math.random() * (ancho - 2) + 2);
                while (posJ1 == posJ2 | posJ1 == posJ3 | posJ2 == posJ3) {
                    posJ2 = (int) (Math.random() * (ancho - 2) + 2);
                    posJ3 = (int) (Math.random() * (ancho - 2) + 2);
                }
                for (int i = 1; i <= alto; i++) {
                    for (int j = 1; j <= ancho; j++) {
                        if ((j % 2 != 0 & i == 1) | (j % 2 != 0 & i == alto))
                            System.out.print("*");
                        else if (j == 1 | j == ancho)
                            System.out.print("*");
                        else if ((i == posI1 & j == posJ1))
                            System.out.print("&");
                        else if (i == posI2 & j == posJ2)
                            System.out.print("$");
                        else if (i == posI3 & j == posJ3)
                            System.out.print("@");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduzca una altura y anchura superiores o igual a 4.");
        } catch (Exception e) {
            System.out.println("Error inesperado. Se esperaba un nº entero positivo.");
        }
    }
}
