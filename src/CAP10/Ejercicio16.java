package CAP10;

import java.util.HashMap;

/* Realiza un programa que sepa decir la capital de un país (en caso de conocer
la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
principio, el programa solo conoce las capitales de España, Portugal y Francia.
Estos datos deberán estar almacenados en un diccionario. Los datos sobre
capitales que vaya aprendiendo el programa se deben almacenar en el mismo
diccionario. El usuario sale del programa escribiendo la palabra “salir”. */
public class Ejercicio16 {
    public static void main(String[] args) {
        HashMap<String, String> paises = new HashMap<>();
        paises.put("españa", "Madrid");
        paises.put("portugal", "Lisboa");
        paises.put("francia", "París");
        String opcion;
        do {
            System.out.print("Introduce un país para ver su capital: ");
            opcion = System.console().readLine().toLowerCase();
            if (paises.containsKey(opcion)) {
                System.out.printf("La capital del país introducido es %s\n", paises.get(opcion));
            } else if (!opcion.equals("salir")) {
                System.out.println("No dispongo de la capital de ese país");
                System.out.print("Introduce la capital del país para almacenarla: ");
                String capital = System.console().readLine();
                String primerCaracter = String.valueOf(capital.charAt(0)).toUpperCase();
                capital = capital.substring(1);
                capital = primerCaracter + capital;
                paises.put(opcion, capital);
            }
        } while (!opcion.equals("salir"));
    }
}
