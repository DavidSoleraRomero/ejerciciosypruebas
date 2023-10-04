package CAP01;

/* Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente. */
// Los colores no funcionan en Windows por defecto.
public class Ejercicio5v2 {
    public static void main(String[] args) {
        System.out.println("────────────────┬─────────┬────────┬───────────┬────────┬──────────");
        System.out.println("│    Horario    │  Lunes  │ Martes │ Miércoles | Jueves │ Viernes │");
        System.out.println("────────────────┼─────────┼────────┼───────────┼────────┼──────────");
        System.out.println("│  8:15 - 9:15  │  Prog.  │  L.M.  │    L.M.   |  Prog. │   FOL   │");
        System.out.println("────────────────┼─────────┼────────┼───────────┼────────┼──────────");
        System.out.println("│  9:15 - 10:15 │  Prog.  │  L.M.  │    L.M    |  Prog. │   FOL   │");
        System.out.println("────────────────┼─────────┼────────┼───────────┼────────┼──────────");
        System.out.println("│ 10:15 - 11:15 │  Prog.  │  BBDD  │   Prog.   |  Prog. │   FOL   │");
        System.out.println("────────────────┼─────────┼────────┼───────────┼────────┼──────────");
        System.out.println("│ 11:45 - 12:45 │  S.I.   │  BBDD  │   Prog.   |  BBDD  │   S.I.  │");
        System.out.println("────────────────┼─────────┼────────┼───────────┼────────┼──────────");
        System.out.println("│ 12:45 - 13:45 │  S.I.   │  E.D.  │   BBDD    |  BBDD  │   S.I.  │");
        System.out.println("────────────────┼─────────┼────────┼───────────┼────────┼──────────");
        System.out.println("│ 13:45 - 14:45 │  S.I.   │  E.D.  │   BBDD    |  E.D.  │   S.I.  │");
        System.out.println("└───────────────┴─────────┴────────┴───────────┴────────┴─────────┘");
    }
}