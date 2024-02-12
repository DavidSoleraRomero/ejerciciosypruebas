package CAP11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/* Escribe un programa capaz de quitar los comentarios de un programa de Java.
Se utilizaría de la siguiente manera:
quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
Por ejemplo:
quita_comentarios hola.java holav2.java
crea un fichero con nombre holav2.java que contiene el código de hola.java pero
sin los comentarios. */

public class Ejercicio5v2 {
    public static void main(String[] args) {
        if (args.length != 2 || args[0].contains(".java") || args[1].contains(".java")) {
            System.out.println("Debes introducir dos ficheros como parámetro sin extensión");
            System.out.println("Ejemplo: java fichero1 fichero1_renombrado");
            System.exit(-1);
        }
        String ruta = "./";
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta + args[0] + ".java"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + args[1] + ".java"));
            String nombreFichero = args[0];
            String nombreSinComentarios = args[1];
            String linea;
            boolean dentroComentario = false;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(nombreFichero))
                    linea = linea.replace(nombreFichero, nombreSinComentarios);

                if (linea.contains("/*") && linea.contains("*/")) {
                    linea = linea.replace(linea.substring(linea.indexOf("/*"), linea.indexOf("*/") + 2), "");
                } else if (linea.contains("/*")) {
                    linea = linea.substring(0, linea.indexOf("/*"));
                    dentroComentario = true;
                }

                if (linea.contains("//"))
                    linea = linea.substring(0, linea.indexOf("//"));

                if (linea.contains("*/") && dentroComentario) {
                    linea = linea.substring(linea.indexOf("*/") + 2, linea.length());
                    dentroComentario = false;
                } else if (dentroComentario)
                    linea = "";

                bw.write(linea + "\n");
            }

            bw.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al establecer conexión con el fichero:");
            e.printStackTrace();
        }
    }
}
