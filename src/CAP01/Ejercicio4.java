package CAP01;

/* Escribe un programa que muestre tu horario de clase. */
public class Ejercicio4 {
        public static void main(String[] args) {
                System.out.println(
                                "------------------------------------------------------------------");
                System.out.printf("| %-12s | %-7s | %-7s | %-7s | %-7s | %-7s |\n", "Horario", "Lunes", "Martes",
                                "Mierc.",
                                "Jueves",
                                "Viernes");
                System.out.println(
                                "------------------------------------------------------------------");
                System.out.printf("| %-12s | %-7s | %-7s | %-7s | %-7s | %-7s |\n", "08:15-09:15", "Prog.", "L.M.",
                                "L.M.",
                                "Prog.", "FOL");
                System.out.printf("| %-12s | %-7s | %-7s | %-7s | %-7s | %-7s |\n", "09:15-10:15", "Prog.", "L.M.",
                                "L.M.",
                                "Prog.", "FOL");
                System.out.printf("| %-12s | %-7s | %-7s | %-7s | %-7s | %-7s |\n", "10:15-11:15", "Prog.", "BBDD",
                                "Prog.",
                                "Prog.", "FOL");
                System.out.printf("| %-12s | %-7s | %-7s | %-7s | %-7s | %-7s |\n", "11:45-12:45", "S.I..", "BBDD",
                                "Prog.",
                                "BBDD", "S.I.");
                System.out.printf("| %-12s | %-7s | %-7s | %-7s | %-7s | %-7s |\n", "12:45-13:45", "S.I.", "E.D.",
                                "BBDD",
                                "BBDD", "S.I.");
                System.out.printf("| %-12s | %-7s | %-7s | %-7s | %-7s | %-7s |\n", "13:45-14:45", "S.I.", "E.D.",
                                "BBDD",
                                "E.D.", "S.I.");
                System.out.println(
                                "------------------------------------------------------------------");
        }
}