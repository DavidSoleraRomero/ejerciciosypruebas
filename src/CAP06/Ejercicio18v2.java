package CAP06;

/* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja. */
public class Ejercicio18v2 {
    public static void main(String[] args) {
        String color1 = color((int) (Math.random() * 6 + 1));
        String color2 = color((int) (Math.random() * 6 + 1));
        String color3 = color((int) (Math.random() * 6 + 1));
        while (color1.equals(color2) | color2.equals(color3) | color1.equals(color3)) {
            color2 = color((int) (Math.random() * 6 + 1));
            color3 = color((int) (Math.random() * 6 + 1));
        }
        System.out.printf("Dormitorio 1: %s\nDormitorio 2: %s\nDormitorio 3: %s", color1, color2, color3);
    }

    public static String color(int num) {
        switch (num) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
            case 4:
                return "amarillo";
            case 5:
                return "violeta";
            default:
                return "naranja";
        }
    }
}
