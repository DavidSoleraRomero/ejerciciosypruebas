package CAP01;

import paqueteprueba.ConsoleColors;

/* Mejora el ejercicio anterior añadiéndole colores. */
// Los colores no funcionan en Windows por defecto.
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("                                                             ");
        System.out.println("                                         " + ConsoleColors.RED + "█████    █████      ");
        System.out.println("                                      " + ConsoleColors.BLUE + "████      ████         ");
        System.out.println("                                   " + ConsoleColors.GREEN + "████       ████           ");
        System.out.println(
                "                                  " + ConsoleColors.PURPLE_BRIGHT + "███        ███             ");
        System.out.println("        " + ConsoleColors.CYAN + "Aprendiendo Java" + ConsoleColors.YELLOW
                + "         █████    ██████             ");
        System.out.println("    " + ConsoleColors.CYAN_BOLD + "con David Solera Romero" + ConsoleColors.RED
                + "     ██    ████    ██             ");
        System.out.println("                                  " + ConsoleColors.YELLOW + "████    ████               ");
        System.out.print("                                                             ");

    }
}
