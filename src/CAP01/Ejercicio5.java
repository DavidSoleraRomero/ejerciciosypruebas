package CAP01;

import paqueteprueba.ConsoleColors;

/* Escribe un programa que muestre tu horario de clase. */
public class Ejercicio5 {
        public static void main(String[] args) {
                String azul = ConsoleColors.BLUE;
                String verde = ConsoleColors.GREEN;
                String morado = ConsoleColors.PURPLE;
                String amarillo = ConsoleColors.YELLOW;
                String blanco = ConsoleColors.WHITE_BRIGHT;
                String cyan = ConsoleColors.CYAN;
                String rojo = ConsoleColors.RED;
                String reset = ConsoleColors.RESET;
                System.out.println(
                                blanco + "------------------------------------------------------------------");
                System.out.printf("| %-12s | %-7s | %-7s | %-7s | %-7s | %-7s |\n", "Horario", "Lunes", "Martes",
                                "Mierc.",
                                "Jueves",
                                "Viernes");
                System.out.println(
                                "------------------------------------------------------------------");
                System.out.printf("| %-12s | " + rojo + "%-7s" + reset + " | "
                                + azul + "%-7s" + reset + " | " + azul
                                + "%-7s" + reset + " | " + rojo + "%-7s" + reset + " | " + cyan + "%-7s" + reset
                                + " |\n",
                                "08:15-09:15", "Prog.", "L.M.",
                                "L.M.",
                                "Prog.", "FOL");
                System.out.printf(
                                "| %-12s | " + rojo + "%-7s" + reset + " | " + azul + "%-7s" + reset
                                                + " | " + azul + "%-7s" + reset + " | " + rojo + "%-7s" + reset + " | "
                                                + cyan + "%-7s" + reset + " |\n",
                                "09:15-10:15", "Prog.",
                                "L.M.",
                                "L.M.",
                                "Prog.", "FOL");
                System.out.printf(
                                "| %-12s | " + rojo + "%-7s" + reset + " | " + verde + "%-7s" + reset + " | " + rojo
                                                + "%-7s" + reset + " | " + rojo + "%-7s" + reset + " | " + cyan + "%-7s"
                                                + reset + " |\n",
                                "10:15-11:15", "Prog.", "BBDD",
                                "Prog.",
                                "Prog.", "FOL");
                System.out.printf(
                                "| %-12s | " + morado + "%-7s" + reset + " | " + verde + "%-7s" + reset + " | " + rojo
                                                + "%-7s" + reset + " | " + verde + "%-7s" + reset + " | " + morado
                                                + "%-7s" + reset + " |\n",
                                "11:45-12:45", "S.I..", "BBDD",
                                "Prog.",
                                "BBDD", "S.I.");
                System.out.printf(
                                "| %-12s | " + morado + "%-7s" + reset + " | " + amarillo + "%-7s" + reset + " | "
                                                + verde + "%-7s" + reset
                                                + " | " + verde + "%-7s" + reset + " | " + morado + "%-7s" + reset
                                                + " |\n",
                                "12:45-13:45", "S.I.", "E.D.",
                                "BBDD",
                                "BBDD", "S.I.");
                System.out.printf(
                                "| %-12s | " + morado + "%-7s" + reset + " | " + amarillo + "%-7s" + reset
                                                + " | " + verde + "%-7s" + reset + " | " + amarillo + "%-7s" + reset
                                                + " | " + morado + "%-7s" + reset + " |\n",
                                "13:45-14:45", "S.I.", "E.D.",
                                "BBDD",
                                "E.D.", "S.I.");
                System.out.println(
                                "------------------------------------------------------------------");
        }
}