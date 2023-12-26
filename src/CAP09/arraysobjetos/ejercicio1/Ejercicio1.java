package CAP09.arraysobjetos.ejercicio1;

import CAP09.ejercicio3.Gato;

/* Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
todos los gatos utilizando también un bucle. */
public class Ejercicio1 {
    public static void main(String[] args) {
        Gato[] gatos = new Gato[4];
        for (int i = 0; i < gatos.length; i++) {
            String raza = raza((int) (Math.random() * 6));
            String color = color((int) (Math.random() * 6));
            int hermanos = (int) (Math.random() * 5);
            gatos[i] = new Gato(raza, color, hermanos);
        }

        for (int i = 0; i < gatos.length; i++) {
            System.out.println(gatos[i]);
        }
    }

    public static String color(int i) {
        switch (i) {
            case 1:
                return "verde";
            case 2:
                return "naranja";
            case 3:
                return "rojo";
            case 4:
                return "marrón oscuro";
            case 5:
                return "negro";
            default:
                return "grisaceo";
        }
    }

    public static String raza(int i) {
        switch (i) {
            case 1:
                return "romano";
            case 2:
                return "siames";
            case 3:
                return "arameo";
            case 4:
                return "habitual";
            case 5:
                return "persa";
            default:
                return "egipcio";
        }
    }

}
