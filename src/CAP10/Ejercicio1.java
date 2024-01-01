package CAP10;

import java.util.ArrayList;

/* Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
todo el ArrayList sin usar ningún índice. */
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> companeros = new ArrayList<>();
        companeros.add("Nacho");
        companeros.add("Eloy");
        companeros.add("María");
        companeros.add("Iván");
        companeros.add("Jorge");
        companeros.add("Víctor");
        for (String s : companeros) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (int i = 0; i < companeros.size(); i++) {
            System.out.print(companeros.get(i) + " ");
        }
    }
}
