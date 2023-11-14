package CAP06;

/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc. */
public class Ejercicio11v2 {
    public static void main(String[] args) {
        int sus = 0;
        int suf = 0;
        int bien = 0;
        int not = 0;
        int sob = 0;
        for (int i = 1; i <= 20; i++) {
            int nota = (int) (Math.random() * 11);
            System.out.printf("Nota %d: %s\n", i,
                    (nota >= 0 & nota <= 4) ? "Suspenso"
                            : (nota == 5) ? "Suficiente"
                                    : (nota == 6) ? "Bien" : (nota >= 7 & nota <= 8) ? "Notable" : "Sobresaliente");
            if (nota <= 4) {
                sus++;
            } else if (nota == 5) {
                suf++;
            } else if (nota == 6) {
                bien++;
            } else if (nota >= 7 & nota <= 8) {
                not++;
            } else
                sob++;
        }
        System.out.printf(
                "\nNº de suspensos: %d\nNº de bienes: %d\nNº de suficientes: %d\nNº de notables: %d\nNº de sobresalientes: %d",
                sus, suf, bien, not, sob);
    }
}
