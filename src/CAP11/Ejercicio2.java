package CAP11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla. */
public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./src/CAP11/primos.dat"));
            String numerosPrimos = br.readLine();
            br.close();
            System.out.println(numerosPrimos);
        } catch (IOException e) {
            System.out.println("Error inesperado en la lectura");
        }
    }
}
