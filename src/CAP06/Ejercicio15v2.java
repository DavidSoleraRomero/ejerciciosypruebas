package CAP06;

/* Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.

b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).

c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.

d) La última nota de la melodía debe coincidir con la primera. */
public class Ejercicio15v2 {
    public static void main(String[] args) {
        int largoMed;
        do {
            largoMed = (int) (Math.random() * 25 + 4);
        } while (largoMed % 4 != 0);
        String primeraNota = "";
        for (int i = 1; i <= largoMed; i++) {
            String nota = nota((int) (Math.random() * 7 + 1));
            System.out.printf("%s", (i != largoMed) ? nota : primeraNota);
            if (i == 1)
                primeraNota = nota;
            System.out.printf("%s", (i % 4 != 0) ? " " : (i == largoMed) ? " ||" : " | ");
        }
    }

    public static String nota(int num) {
        switch (num) {
            case 1:
                return "do";
            case 2:
                return "re";
            case 3:
                return "mi";
            case 4:
                return "fa";
            case 5:
                return "sol";
            case 6:
                return "la";
            default:
                return "si";
        }
    }
}
