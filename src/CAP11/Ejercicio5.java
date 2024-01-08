package CAP11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Escribe un programa capaz de quitar los comentarios de un programa de Java.
Se utilizaría de la siguiente manera:
quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
Por ejemplo:
quita_comentarios hola.java holav2.java
crea un fichero con nombre holav2.java que contiene el código de hola.java pero
sin los comentarios. */
public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * Este programa quitará los comentarios del primer parámetro en el segundo
         * parámetro, fichero que nosotros crearemos
         */
        if (args.length != 2) {
            System.out.println("Introduzca: \n1. Nombre fichero a cambiar\n2. Nombre fichero al ser cambiado");
            System.out.println("Ejemplo: java Ejercicio5 helloworld.java helloworldV2.java");
            System.exit(-1);
        }
        String ruta = "./src/CAP11/";
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta + args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + args[1]));
            String linea;
            boolean dentroComentario = false;
            String nombreFichero = args[0].substring(0, args[0].lastIndexOf("."));
            String nombreSinComentarios = args[1].substring(0, args[1].lastIndexOf("."));
            while ((linea = br.readLine()) != null) {
                boolean comentarioLinea = false;
                if (linea.contains("//")) {
                    linea = linea.replaceAll("//.*", "");
                    comentarioLinea = true;
                }
                if (linea.contains(nombreFichero)) {
                    linea = linea.replace(nombreFichero, nombreSinComentarios);
                }
                if (!comentarioLinea) {
                    if (linea.contains("/*")) {
                        linea = linea.replaceAll("/\\*.*", "");
                        dentroComentario = true;
                    } else if (linea.contains("*/")) {
                        linea = linea.replaceAll(".*\\*/", "");
                        dentroComentario = false;
                    }
                }
                if (!dentroComentario & !linea.equals(""))
                    bw.write(linea + "\n");
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error inesperado en la lectura / escritura del fichero.");
        }
    }
}
