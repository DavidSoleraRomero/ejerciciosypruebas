package CAP10;

import java.util.ArrayList;

/* Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
todo el ArrayList sin usar ningún índice. */
public class Ejercicio1v2 {
    public static void main(String[] args) {
        ArrayList<String> companeros = new ArrayList<>();
        companeros.add("David");
        companeros.add("Darío");
        companeros.add("Nacho");
        companeros.add("Eloy");
        companeros.add("Boris");
        companeros.add("Rafa");
        for (String s : companeros) {
            System.out.print(s + " ");
        }
    }
}
