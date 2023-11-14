package CAP06;

/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */
public class Ejercicio1v2 {
    public static void main(String[] args) {
        System.out.println("Mostrando la tirada de 3 dados...");
        int suma = 0;
        for (int i = 1; i <= 3; i++) {
            int dado = (int) (Math.random() * 6 + 1);
            suma = suma + dado;
            System.out.println("Dado " + i + ": " + dado);
        }
        System.out.println("Suma total: " + suma);
    }
}
