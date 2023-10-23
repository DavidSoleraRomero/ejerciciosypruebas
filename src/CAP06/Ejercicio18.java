package CAP06;

/* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja. */
public class Ejercicio18 {
    public static void main(String[] args) {
        String color = "";
        int contador = 1;
        int color1 = 0;
        int color2 = 0;
        while (true) {
            int colorN = (int) (Math.random() * 6 + 1);
            switch (colorN) {
                case 1:
                    color = "rojo";
                    break;
                case 2:
                    color = "azul";
                    break;
                case 3:
                    color = "verde";
                    break;
                case 4:
                    color = "amarillo";
                    break;
                case 5:
                    color = "violeta";
                    break;
                case 6:
                    color = "naranja";
                    break;
            }
            if (contador == 1) {
                color1 = colorN;
                System.out.printf("Primer color  | Dormitorio nº 1: %s\n", color);
                contador++;
            } else if (contador == 2 & color1 != colorN) {
                color2 = colorN;
                System.out.printf("Segundo color | Dormitorio nº 2: %s\n", color);
                contador++;
            } else if (contador == 3 & color1 != colorN & color2 != colorN) {
                System.out.printf("Tercer color  | Dormitorio nº 3: %s\n", color);
                break;
            }
        }
    }
}
