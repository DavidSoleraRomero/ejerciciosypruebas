package CAP11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos. */
public class Ejercicio6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Introduzca: \n1. Nombre palabra\n2. Nombre fichero para encontrar palabra");
            System.out.println("Ejemplo: java Ejercicio6 almohadilla archivo.txt");
            System.exit(-1);
        }
        String ruta = "./src/CAP11/";
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta + args[1]));
            int ocurrencias = 0;
            String palabra = args[0];
            String linea = br.readLine();
            while (linea != null) {
                String[] palabras = linea.split("\\s+");
                for (String s : palabras) {
                    if (s.equals(palabra))
                        ocurrencias++;
                }
                linea = br.readLine();
            }
            System.out.printf("Hay %d ocurrencias de la palabra %s en %s", ocurrencias, palabra, args[1]);
            br.close();
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero.");
        }
    }
}
