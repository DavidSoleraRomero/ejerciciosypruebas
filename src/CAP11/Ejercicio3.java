package CAP11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Escribe un programa que guarde en un fichero el contenido de otros dos
ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
primeros dos ficheros mezcladas, es decir, la primera línea será del primer
fichero, la segunda será del segundo fichero, la tercera será la siguiente del
primer fichero, etc.

Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
pasar como argumentos en la línea de comandos.

Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
pueden tener tamaños diferentes. */
public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("./src/CAP11/archivo1.txt"));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("./src/CAP11/archivo2.txt"));
            int aleatorio1 = (int) (Math.random() * 11 + 5);
            int aleatorio2 = (int) (Math.random() * 11 + 5);
            for (int i = 1; i <= aleatorio1; i++) {
                bw1.write("Linea del primer fichero número " + i + "\n");
            }
            bw1.close();
            for (int i = 1; i <= aleatorio2; i++) {
                bw2.write("Linea del segundo fichero número " + i + "\n");
            }
            bw2.close();
            BufferedReader br1 = new BufferedReader(new FileReader("./src/CAP11/archivo1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("./src/CAP11/archivo2.txt"));
            BufferedWriter bw3 = new BufferedWriter(new FileWriter("./src/CAP11/mezcla.txt"));
            String linea1 = "";
            String linea2 = "";
            while ((linea1 != null) | (linea2 != null)) {
                linea1 = br1.readLine();
                if (linea1 != null)
                    bw3.write(linea1 + "\n");
                linea2 = br2.readLine();
                if (linea2 != null)
                    bw3.write(linea2 + "\n");
            }
            br1.close();
            br2.close();
            bw3.close();
        } catch (IOException e) {
            System.out.println("Error en la escritura/lectura del fichero");
        }
    }
}
