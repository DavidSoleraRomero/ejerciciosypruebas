package CAP10;

import java.util.ArrayList;

public class Ejercicio23v2 {
    public static void main(String[] args) {
        ArrayList<Figura> piezas = new ArrayList<>();
        piezas.add(new Figura("Dama", 9, 1));
        piezas.add(new Figura("Torre", 5, 2));
        piezas.add(new Figura("Alfil", 3, 2));
        piezas.add(new Figura("Caballo", 2, 2));
        piezas.add(new Figura("Peón", 1, 8));
        int numeroCapturas = numeroCapturas();
        int contador = 0;
        int suma = 0;
        if (numeroCapturas != 0) {
            do {
                Figura figura = piezas.get((int) (Math.random() * piezas.size()));
                if (figura.esCapturable()) {
                    figura.captura();
                    suma += figura.getValor();
                    System.out.println(figura);
                    contador++;
                }
            } while (contador < numeroCapturas);
            System.out.print("Peones totales: " + suma);
        }
    }

    public static int numeroCapturas() {
        return (int) (Math.random() * 16);
    }

}
