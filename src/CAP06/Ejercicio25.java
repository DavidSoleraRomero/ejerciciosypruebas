package CAP06;

import CAP05.Funciones;

/* Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]). */
public class Ejercicio25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int num = (int) (Math.random() * 191 + 10);
            if (Funciones.esPrimo(num))
                System.out.print("#" + num + "# ");
            else if (num % 5 == 0)
                System.out.print("[" + num + "] ");
            else
                System.out.print(num + " ");
        }
    }
}
