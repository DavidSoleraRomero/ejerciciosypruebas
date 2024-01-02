package CAP10;

import java.util.HashMap;

/* La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
la clase Moneda y la secuencia se debe ir almacenando en una lista. */
public class Ejercicio7 {
    public static void main(String[] args) {
        HashMap<Integer, Moneda> monedas = new HashMap<>();
        int i = 0;
        String salir = "";
        System.out.println("|| EUROCOIN ||\nPulse CUALQUIER TECLA para salir.\nPulse ENTER para continuar.");
        String valor = devuelveValorMoneda();
        String lado = devuelveLadoMoneda();
        int cantidad = devuelveCantidadMoneda(valor);
        valor = compruebaMoneda(valor, cantidad);
        do {
            monedas.put(i, new Moneda(cantidad, valor, lado));
            System.out.print(monedas.get(i));
            do {
                valor = devuelveValorMoneda();
                lado = devuelveLadoMoneda();
                cantidad = devuelveCantidadMoneda(valor);
                valor = compruebaMoneda(valor, cantidad);
            } while ((cantidad != monedas.get(i).getCantidad() | !valor.equals(monedas.get(i).getValor()))
                    & !lado.equals(monedas.get(i).getLado()));
            salir = System.console().readLine();
            i++;
        } while (salir.equals(""));
    }

    public static String devuelveValorMoneda() {
        int numAleatorio = (int) (Math.random() * 2);
        return (numAleatorio == 0) ? "céntimo" : "euro";
    }

    public static String devuelveLadoMoneda() {
        int numAleatorio = (int) (Math.random() * 2);
        return (numAleatorio == 0) ? "cara" : "cruz";
    }

    public static int devuelveCantidadMoneda(String valor) {
        int numAleatorio;
        if (valor.equals("euro")) {
            numAleatorio = (int) (Math.random() * 2 + 1);
            return numAleatorio;
        } else {
            numAleatorio = (int) (Math.random() * 6 + 1);
            switch (numAleatorio) {
                case 1:
                    return numAleatorio;
                case 2:
                    return numAleatorio;
                case 3:
                    return 5;
                case 4:
                    return 10;
                case 5:
                    return 25;
                default:
                    return 50;
            }
        }
    }

    public static String compruebaMoneda(String valor, int cantidad) {
        return (cantidad != 1) ? valor + "s" : valor;
    }
}
