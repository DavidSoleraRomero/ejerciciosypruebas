package CAP06;

/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc. */
public class Ejercicio11 {
    public static void main(String[] args) {
        int acumSusp = 0;
        int acumSuf = 0;
        int acumBien = 0;
        int acumNot = 0;
        int acumSob = 0;
        for (int i = 1; i <= 20; i++) {
            int nota = (int) (Math.random() * 11);
            if (nota < 5)
                acumSusp++;
            else if (nota == 5)
                acumSuf++;
            else if (nota == 6)
                acumBien++;
            else if (nota >= 7 & nota <= 8)
                acumNot++;
            else
                acumSob++;
            System.out.printf("Nota %d: %d\n", i, nota);
        }
        System.out.printf("Cantidad de notas suspensas: %d\n", acumSusp);
        System.out.printf("Cantidad de notas suficientes: %d\n", acumSuf);
        System.out.printf("Cantidad de notas bien: %d\n", acumBien);
        System.out.printf("Cantidad de notas notables: %d\n", acumNot);
        System.out.printf("Cantidad de notas sobresalientes: %d\n", acumSob);
    }
}
