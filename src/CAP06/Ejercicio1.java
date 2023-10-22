package CAP06;

/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Mostrando 3 dados aleatorios...");
        int puntos = 0;
        for (int i = 1; i <= 3; i++) {
            int random = (int) (Math.random() * 6 + 1);
            puntos = random + puntos;
            System.out.printf("Número %d = %d\n", i, random);
        }
        System.out.printf("Puntos totales: %d", puntos);
    }
}
