package CAP10;

import java.util.ArrayList;

/* La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
la clase Moneda y la secuencia se debe ir almacenando en una lista. */
public class Ejercicio7v2 {
    public static void main(String[] args) {
        System.out.print("Bienvenido a EUROCOIN...\nPulsa enter para generar 6 monedas: ");
        System.console().readLine();
        System.out.println("\nGenerando monedas...\n");
        ArrayList<Monedav2> misMonedas = new ArrayList<>();
        misMonedas.add(new Monedav2());
        for (int i = 1; i <= 5; i++) {
            Monedav2 monedaAux;
            do {
                monedaAux = new Monedav2();
            } while (misMonedas.get(i - 1).getAmount() != monedaAux.getAmount()
                    & !misMonedas.get(i - 1).getFace().equals(monedaAux.getFace()));
            misMonedas.add(monedaAux);
        }
        for (Monedav2 m : misMonedas) {
            System.out.println(m);
        }
    }
}
