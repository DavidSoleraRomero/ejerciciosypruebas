package CAP06;

/* Mostrar la palabra HOLA con asteriscos. Altura nº impar aleatorio entre 3 y 33.
 * Los palos de la A y la H están justo a la mitad de la altura. La anchura siempre es la misma (6) */
public class Ejercicio28v3 {
    public static void main(String[] args) {
        int alt;
        do {
            alt = (int) (Math.random() * 31 + 3);
        } while (alt % 2 == 0);
        String aste1 = "*     ";
        String aste2 = "*    *";
        String aste4 = " **** ";
        String aste6 = "******";
        for (int i = 1; i <= alt; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 1) {
                    if (i != alt / 2 + 1)
                        System.out.print(aste2);
                    else
                        System.out.print(aste6);
                } else if (j == 2) {
                    if (i != 1 & i != alt)
                        System.out.print(aste2);
                    else
                        System.out.print(aste4);
                } else if (j == 3) {
                    if (i != alt)
                        System.out.print(aste1);
                    else
                        System.out.print(aste6);
                } else {
                    if (i != 1 & i != alt / 2 + 1)
                        System.out.print(aste2);
                    else if (i == 1)
                        System.out.print(aste4);
                    else
                        System.out.print(aste6);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
