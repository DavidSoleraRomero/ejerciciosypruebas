package CAP06;

/* El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
una cuestión de física elemental, ninguno de los animales puede coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades. */
public class Ejercicio30 {
    public static void main(String[] args) {
        System.out.print("Introduce el alto de la pecera: ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            System.out.print("Introduzca el ancho de la pecera: ");
            int anchura = Integer.parseInt(System.console().readLine());
            if (altura >= 4 & anchura >= 4) {
                int caballitoI = (int) (Math.random() * (altura - 2) + 2);
                int caballitoA = (int) (Math.random() * (anchura * 2 - 3) + 2);
                int caracolaI = (int) (Math.random() * (altura - 2) + 2);
                int caracolaA = (int) (Math.random() * (anchura * 2 - 3) + 2);
                int pezI = (int) (Math.random() * (altura - 2) + 2);
                int pezA = (int) (Math.random() * (anchura * 2 - 3) + 2);
                while (true) {
                    if (caballitoA == caracolaA | caballitoA == pezA)
                        caballitoA = (int) (Math.random() * (anchura * 2 - 3) + 2);
                    else if (caracolaA == pezA)
                        pezA = (int) (Math.random() * (anchura * 2 - 3) + 2);
                    if (caballitoA != caracolaA & caballitoA != pezA & caracolaA != pezA)
                        break;
                }
                for (int i = 1; i <= altura; i++) {
                    for (int pintar = 1; pintar <= anchura * 2 - 1; pintar++) {
                        if ((i == caballitoI & pintar == caballitoA) | (i == caracolaI & pintar == caracolaA)
                                | (i == pezI & pintar == pezA)) {
                            if (pintar == caballitoA)
                                System.out.print("$");
                            else if (pintar == caracolaA)
                                System.out.print("@");
                            else
                                System.out.print("&");
                        } else if (i == 1 | i == altura)
                            if (pintar % 2 != 0)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        else if (pintar == 1 | pintar == anchura * 2 - 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduce un número superior o igual a 4.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Introduzca un nº.");
        }
    }
}