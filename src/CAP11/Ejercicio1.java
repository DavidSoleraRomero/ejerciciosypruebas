package CAP11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/* Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500. */
public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./src/CAP11/primos.dat"));
            for (int i = 1; i <= 500; i++) {
                if (esPrimo(i)) {
                    bw.write(i + " ");
                }
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error inesperado con el fichero");
            e.printStackTrace();
        }
    }

    public static boolean esPrimo(int num) {
        if (num == 1 | num == 0)
            return false;
        boolean primo = true;
        int cont = 2;
        while (cont <= num / 2 & primo) {
            if (num % cont++ == 0)
                primo = false;
        }
        return primo;
    }
}
