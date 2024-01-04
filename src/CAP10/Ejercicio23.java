package CAP10;

import java.util.ArrayList;
import java.util.HashMap;

/* En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones,
una torre 5 peones, un alfil 3, un caballo 2 y un péon vale, lógicamente,
1 peón. Realiza un programa que genere al azar las capturas que ha hecho
un jugador durante una partida. El número de capturas será un valor aleatorio
entre 0 y 15. Hay que tener en cuenta que cada jugador tiene la posibilidad de
capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles,
2 caballos y 8 peones. Al final debe aparecer la puntuación total. */
public class Ejercicio23 {
    public static void main(String[] args) {
        HashMap<String, Integer> valorPiezas = new HashMap<>();
        valorPiezas.put("Dama", 9);
        valorPiezas.put("Torre", 5);
        valorPiezas.put("Alfil", 3);
        valorPiezas.put("Caballo", 2);
        valorPiezas.put("Peón", 1);
        ArrayList<String> piezas = new ArrayList<>(valorPiezas.keySet());
        byte torres = 0;
        byte alfiles = 0;
        byte caballos = 0;
        byte peones = 0;
        int suma = 0;
        int capturas = numeroCapturas();
        System.out.println("Fichas capturadas por el jugador:");
        if (capturas != 0) {
            for (int i = 1; i <= capturas; i++) {
                int piezaAleatoria = (int) (Math.random() * piezas.size());
                String pieza = piezas.get(piezaAleatoria);
                if (pieza.equals("Dama")) {
                    piezas.remove("Dama");
                    suma += valorPiezas.get("Dama");
                }
                if (pieza.equals("Torre")) {
                    torres++;
                    if (torres == 2)
                        piezas.remove("Torre");
                    suma += valorPiezas.get("Torre");
                }
                if (pieza.equals("Alfil")) {
                    alfiles++;
                    if (alfiles == 2)
                        piezas.remove("Alfil");
                    suma += valorPiezas.get("Alfil");
                }
                if (pieza.equals("Caballo")) {
                    caballos++;
                    if (caballos == 2)
                        piezas.remove("Caballo");
                    suma += valorPiezas.get("Caballo");
                }
                if (pieza.equals("Peón")) {
                    peones++;
                    if (peones == 8)
                        piezas.remove("Peón");
                    suma += valorPiezas.get("Peón");
                }
                System.out.printf("%s (%d peones)\n", pieza, valorPiezas.get(pieza));
            }
            System.out.printf("Puntos totales: %d", suma);
        } else
            System.out.println("No te corresponden tiradas.");
    }

    public static int numeroCapturas() {
        return (int) (Math.random() * 16);
    }
}
