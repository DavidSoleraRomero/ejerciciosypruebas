package CAP11.juego;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import CAP11.juego.utilidades.AlmacenaJugador;

public class Arena {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Introduzca únicamente 2 ficheros: ");
            System.out.println("java Arena ficheroBatallas.java ficheroJugadores.java");
            System.exit(-1);
        }

        String nombreFicheroBatallas = args[0];
        String nombreFicheroJugadores = args[1];

        String ruta = ".\\src\\CAP11\\juego\\";

        File ficheroJugadores = new File(ruta + nombreFicheroJugadores);
        File ficheroBatallas = new File(ruta + nombreFicheroBatallas);

        ArrayList<Batalla> batallas = new ArrayList<>();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        // Recopilación de jugadores (si existen, sino crea unos improvisados)
        if (ficheroJugadores.exists()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(ruta + nombreFicheroJugadores));
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    jugadores.add(AlmacenaJugador.deserializa(linea));
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Error leyendo el fichero: ");
                e.printStackTrace();
            }
        } else {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + nombreFicheroBatallas));
                bw.write("");
                bw.close();
                for (int i = 1; i <= 5; i++) {
                    int numNombreJug = (int) (Math.random() * 20 + 1);
                    String nombre = devuelveNombreJugador(numNombreJug);
                    int numPasiva = (int) (Math.random() * 3 + 1);
                    int puntosAtaque = (int) (Math.random() * 10 + 1);
                    jugadores.add(new Jugador(nombre, 100, numPasiva, puntosAtaque, 0));
                }
            } catch (Exception e) {
                System.out.println("Error escribiendo en el fichero: ");
                e.printStackTrace();
            }
        }

        // Recopilación de batallas (si existen)
        if (ficheroBatallas.exists()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(ruta + nombreFicheroBatallas));
                String linea = "";

                while ((linea = br.readLine()) != null) {

                }

                br.close();
            } catch (Exception e) {
                System.out.println("Error leyendo el fichero: ");
                e.printStackTrace();
            }
        }

        // El programa va aquí
        //
        // El programa va aquí

        // Almacenamiento de jugadores
        if (ficheroJugadores.exists()) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + nombreFicheroJugadores));
                for (int i = 0; i < jugadores.size(); i++) {
                    bw.write(jugadores.get(i).serializa() + "\n");
                }
                bw.close();
            } catch (Exception e) {
                System.out.println("Error escribiendo en el fichero: ");
                e.printStackTrace();
            }
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error creando el fichero de jugadores.");
            }
        }

        // Almacenamiento de batallas
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + nombreFicheroBatallas));

        } catch (Exception e) {
            System.out.println("Error escribiendo en el fichero: ");
            e.printStackTrace();
        }

    }

    public static String devuelveNombreJugador(int opcion) {
        switch (opcion) {
            case 1:
                return "Sir Galahad";
            case 2:
                return "Lady Guinevere";
            case 3:
                return "Sir Lancelot";
            case 4:
                return "Morgana la hechicera";
            case 5:
                return "Merlín el mago";
            case 6:
                return "Sir Percival";
            case 7:
                return "Rey Arturo";
            case 8:
                return "Reina Morgause";
            case 9:
                return "Sir Gawain";
            case 10:
                return "Lady Elaine";
            case 11:
                return "Sir Bedivere";
            case 12:
                return "Dama Nimue";
            case 13:
                return "Sir Tristán";
            case 14:
                return "Lady Isolde";
            case 15:
                return "Sir Kay";
            case 16:
                return "Lady Lynette";
            case 17:
                return "Sir Gareth";
            case 18:
                return "Lady Ragnell";
            case 19:
                return "Sir Ector";
            default:
                return "Lady Blanchefleur";
        }
    }
}
