package CAP10;

import java.util.ArrayList;
import java.util.HashMap;

/* Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés. */

/* Realiza un programa que escoja al azar 5 palabras en español del mini-
diccionario del ejercicio anterior. El programa irá pidiendo que el usuario teclee
la traducción al inglés de cada una de las palabras y comprobará si son
correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
y cuántas erróneas. */
public class Ejercicio10y11 {
    public static void main(String[] args) {
        HashMap<String, String> miniDiccionario = new HashMap<>();
        miniDiccionario.put("mesa", "table");
        miniDiccionario.put("silla", "chair");
        miniDiccionario.put("niños", "children");
        miniDiccionario.put("chico", "boy");
        miniDiccionario.put("pantalla", "screen");
        miniDiccionario.put("cangrejo", "crab");
        miniDiccionario.put("ventilador", "fan");
        miniDiccionario.put("botella", "bottle");
        miniDiccionario.put("palo", "stick");
        miniDiccionario.put("tetas", "boobs");
        miniDiccionario.put("culo", "ass");
        miniDiccionario.put("altavoces", "speakers");
        miniDiccionario.put("caja", "box");
        miniDiccionario.put("mando", "controller");
        miniDiccionario.put("cacahuete", "peanut");
        miniDiccionario.put("perdonar", "forgive");
        miniDiccionario.put("olvidar", "forget");
        miniDiccionario.put("suelo", "floor");
        miniDiccionario.put("flor", "flower");
        miniDiccionario.put("fuego", "fire");
        String palabra = "";
        /*
         * do {
         * System.out.print("Introduce palabra en español: ");
         * palabra = System.console().readLine().toLowerCase();
         * if (miniDiccionario.containsKey(palabra)) {
         * System.out.println(miniDiccionario.get(palabra));
         * } else if (!palabra.equals("salir")) {
         * System.out.
         * println("Lo sentimos, esa palabra no está en este mini-diccionario");
         * }
         * } while (!palabra.toLowerCase().equals("salir"));
         */
        boolean salir = false;
        String[] claves = miniDiccionario.keySet().toArray(new String[0]);
        do {
            ArrayList<Integer> posiciones = new ArrayList<>();
            posiciones.clear();
            for (int i = 1; i <= 5; i++) {
                int num;
                do {
                    num = (int) (Math.random() * miniDiccionario.size());
                } while (posiciones.contains(num));
                posiciones.add(num);
            }
            int correctas = 0;
            for (int i = 0; i < posiciones.size(); i++) {
                System.out.println("\n" + claves[posiciones.get(i)] + "\n----------");
                System.out.print("Introduce palabra en inglés: ");
                palabra = System.console().readLine().toLowerCase();
                if (palabra.equals(miniDiccionario.get(claves[posiciones.get(i)])))
                    correctas++;
            }
            System.out.printf("\nTu puntación ha sido de %d\n\n¿Deseas salir?\n1. Sí | 2. No\nOpción: ", correctas);
            int opcion = Integer.parseInt(System.console().readLine());
            if (opcion == 1)
                salir = true;
        } while (!salir);
    }
}
