package CAP10;

import java.util.HashMap;
import java.util.Map;

/* Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
proporciona a continuación. El programa preguntará una palabra y dará una
lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
“caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
“hot”), por tanto solo tendrá que buscar las palabras en español que también
signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
(“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
esa palabra”. El usuario sale del programa escribiendo la palabra “salir”. */

/* Amplía el programa anterior de tal forma que sea capaz de aprender palabras y
sinónimos. Cuando una palabra no tiene sinónimos, es decir, cuando aparece la
palabra en español con su traducción y esa traducción no la tiene ninguna otra
palabra española, se le preguntará al usuario si quiere añadir uno (un sinónimo)
y, en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se puede
dar la circunstancia de que el usuario introduzca una palabra en español que
no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y
se dará la posibilidad al usuario de añadir la entrada correspondiente en el
diccionario pidiendo, claro está, la palabra en inglés. */
public class Ejercicio19y20 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("grande", "big");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("gigante", "big");
        String buscaSinonimo;
        do {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            buscaSinonimo = System.console().readLine().toLowerCase();
            if (buscaSinonimo.equals("salir"))
                break;
            if (diccionario.containsKey(buscaSinonimo)) {
                int encontrados = 0;
                String frase = "Sinónimos de " + buscaSinonimo + ": ";
                String palabraInglesa = diccionario.get(buscaSinonimo);
                for (Map.Entry palabra : diccionario.entrySet()) {
                    if (palabra.getValue().equals(palabraInglesa) & !palabra.getKey().equals(buscaSinonimo)) {
                        frase = frase + palabra.getKey() + " ";
                        encontrados++;
                    }
                }
                if (encontrados != 0)
                    System.out.print(frase);
                else {
                    do {
                        System.out.print("No conozco sinónimos de esa palabra ¿Desea añadir alguno? (s/n): ");
                        frase = System.console().readLine().toLowerCase();
                    } while (!frase.equals("s") & !frase.equals("n"));
                    if (frase.equals("s")) {
                        System.out.print("Introduzca un sinónimo de " + buscaSinonimo + ": ");
                        frase = System.console().readLine().toLowerCase();
                        System.out.print("Gracias por enseñarme nuevos sinónimos");
                        diccionario.put(frase, palabraInglesa);
                    }
                }
                System.out.println();
            } else {
                String opcion = "";
                do {
                    System.out.print("No conozco esa palabra ¿Quiere añadirla al diccionario? (s/n): ");
                    opcion = System.console().readLine().toLowerCase();
                } while (!opcion.equals("s") & !opcion.equals("n"));
                if (opcion.equals("s")) {
                    System.out.print("Introduzca la traducción de " + buscaSinonimo + " en inglés: ");
                    opcion = System.console().readLine().toLowerCase();
                    diccionario.put(buscaSinonimo, opcion);
                }
            }
        } while (true);
    }
}