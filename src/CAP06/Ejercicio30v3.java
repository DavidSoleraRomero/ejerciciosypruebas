package CAP06;

/* El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
una cuestión de física elemental, ninguno de los animales puede coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades. */
public class Ejercicio30v3 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pecera: ");
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 4) {
                int anchura = altura * 2 - 1;
                int pezI = (int) (Math.random() * (altura - 2) + 2);
                int pezJ = (int) (Math.random() * (anchura - 2) + 2);
                int cabI = (int) (Math.random() * (altura - 2) + 2);
                int cabJ = (int) (Math.random() * (anchura - 2) + 2);
                int carI = (int) (Math.random() * (altura - 2) + 2);
                int carJ = (int) (Math.random() * (anchura - 2) + 2);
                while (pezJ == cabJ | pezJ == carJ | cabJ == carJ) {
                    cabJ = (int) (Math.random() * (anchura - 2) + 2);
                    carJ = (int) (Math.random() * (anchura - 2) + 2);
                }
                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= anchura; j++) {
                        if ((i == 1 & j % 2 != 0) | (i == altura & j % 2 != 0) | j == 1 | j == anchura) {
                            System.out.print("*");
                        } else if (i == pezI & j == pezJ)
                            System.out.print("&");
                        else if (i == cabI & j == cabJ)
                            System.out.print("$");
                        else if (i == carI & j == carJ)
                            System.out.print("@");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }
}
