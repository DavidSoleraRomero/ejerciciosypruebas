package CAP07.UNIDIMENSIONAL;

import CAP05.Funciones;

public class Ejercicio20v2 {
    public static void main(String[] args) {
        System.out.print("Introduce cuántos reyes vas a introducir: ");
        int numeroReyes = Funciones.entradaInt();
        String[] reyes = new String[numeroReyes];
        System.out.println("Introduzca el nombre de cada rey y pulse INTRO: ");
        for (int i = 0; i < reyes.length; i++) {
            reyes[i] = Funciones.entradaString();
        }

        System.out.println("\nLos reyes introducidos son:");
        for (int i = 0; i < reyes.length; i++) {
            int numeroOrdinal = 1;
            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j]))
                    numeroOrdinal++;
            }
            System.out.println(reyes[i] + " " + numeroOrdinal + "º");
        }
    }
}
