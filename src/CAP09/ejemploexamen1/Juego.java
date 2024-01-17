package CAP09.ejemploexamen1;

public class Juego {
    public static void main(String[] args) {
        Batalla miBatalla;
        Heroe h1;
        Heroe h2 = new Heroe(devuelveNombre(), (int) (Math.random() * 10 + 1));
        boolean salir = false;
        do {
            h2.setSalud(100);
            System.out.print("Introduce el nombre de tu personaje: ");
            String nombre = System.console().readLine();
            int fuerza;
            do {
                System.out.print("Introduce los puntos de fuerza (1-10): ");
                fuerza = Integer.parseInt(System.console().readLine());
            } while (fuerza <= 0 | fuerza > 10);
            h1 = new Heroe(nombre, fuerza);
            miBatalla = new Batalla(h1, h2);
            System.out.println("\n" + h1);
            System.out.println(h2);
            System.out.println("Presiona ENTER para comenzar la batalla...");
            System.console().readLine();
            while (miBatalla.ambosVivos(h1, h2)) {
                miBatalla.pelea(h1, h2);
                try {
                    Thread.sleep(0);
                } catch (Exception e) {
                    System.out.println("Se ha producido un error inesperado");
                }
            }
            int opcion;
            System.out.printf("\nEL GANADOR ES %s\n",
                    (h1.getSalud() > 0) ? h1.getNombre().toUpperCase() : h2.getNombre().toUpperCase());
            do {
                System.out.print("\n¿Quieres continuar jugando?\n1. Sí\n2. No\nOpción: ");
                opcion = Integer.parseInt(System.console().readLine());
            } while (opcion != 1 & opcion != 2);
            if (opcion == 2)
                salir = true;
        } while (!salir);
    }

    private static String devuelveNombre() {
        int num = (int) (Math.random() * 6);
        switch (num) {
            case 0:
                return "Ignacio";
            case 1:
                return "Eustaquio";
            case 2:
                return "Baudilio";
            case 3:
                return "Cristóbal";
            case 4:
                return "Adrián";
            default:
                return "Lathan";
        }
    }
}
