package CAP11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/* Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la línea de comandos. El nombre
del fichero resultado debe ser el mismo que el original añadiendo la coletilla
sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
línea. */

// Buenos días
public class Ejercicio4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            opciones();
        }
        String ruta = "./src/CAP11/"; // Declaro la ruta del paquete actual
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta + args[0]));
            String palabra = br.readLine();
            ArrayList<String> palabras = new ArrayList<>();
            while (palabra != null) {
                if (palabra != null)
                    palabras.add(palabra);
                palabra = br.readLine();
            }
            Comparator<String> organizaAlfabeticamente = Comparator.naturalOrder();
            palabras.sort(organizaAlfabeticamente);
            String nombreFichero = args[0].substring(0, args[0].lastIndexOf("."));
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + nombreFichero + "_sort.txt"));
            for (int i = 0; i < palabras.size(); i++) {
                bw.write(palabras.get(i) + "\n");
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.println("Error en la lectura / escritura del fichero");
        }
    }

    public static void opciones() {
        System.out.println("Introduzca únicamente un fichero.");
        System.out.println("Ejemplo: java Ejercicio4 archivo.txt");
        System.exit(-1);
    }
}
