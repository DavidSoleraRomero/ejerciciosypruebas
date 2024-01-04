package CAP10;

import java.util.ArrayList;
import java.util.HashMap;

/* La asociación “Amigos de los anfibios” nos ha encargado una aplicación
educativa sobre estos animalitos. Crea un programa que pida al usuario el tipo
de anfibio y que, a continuación, nos muestre su hábitat y su alimentación. Si
el tipo de anfibio introducido no existe, se debe mostrar el mensaje “Ese tipo
de anfibio no existe”. */
public class Ejercicio21 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> anfibios = new HashMap<>();
        anfibios.put("rana", new HashMap<>());
        anfibios.get("rana").put("Hábitat", "En los trópicos y cerca de las zonas húmedas y acuáticas");
        anfibios.get("rana").put("Alimentación", "Larvas e insectos");
        anfibios.put("salamandra", new HashMap<>());
        anfibios.get("salamandra").put("Hábitat", "Ecosistemas húmedos");
        anfibios.get("salamandra").put("Alimentación", "Pequeños crustáceos e insectos");
        anfibios.put("sapo", new HashMap<>());
        anfibios.get("sapo").put("Hábitat", "En cualquier sitio salvo el desierto y la Antártida");
        anfibios.get("sapo").put("Alimentación", "Insectos, lombrices y pequeños roedores");
        anfibios.put("tritón", new HashMap<>());
        anfibios.get("tritón").put("Hábitat", "América y África");
        anfibios.get("tritón").put("Alimentación", "Insectos");
        String insecto;
        do {
            System.out.print("Introduzca tipo de anfibio: ");
            insecto = System.console().readLine().toLowerCase();
            if (insecto.equals("salir"))
                break;
            if (anfibios.containsKey(insecto)) {
                System.out.println("Hábitat: " + anfibios.get(insecto).get("Hábitat") + ".");
                System.out.println("Alimentación: " + anfibios.get(insecto).get("Alimentación") + ".");
            } else {
                System.out.println("Este tipo de anfibio no existe.");
            }
        } while (true);
    }
}
