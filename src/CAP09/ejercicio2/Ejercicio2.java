package CAP09.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta();
        Coche c1 = new Coche();
        int opcion = 0;
        do {
            Vehiculo.menu();
            opcion = Integer.parseInt(System.console().readLine());
            System.out.println();
            ejecutaOpcion(opcion, b1, c1);
            System.console().readLine();
        } while (opcion != 8);
    }

    public static void ejecutaOpcion(int i, Bicicleta b, Coche c) {
        switch (i) {
            case 1:
                b.andar(50);
                break;
            case 2:
                b.caballito();
                break;
            case 3:
                c.andar(150);
                break;
            case 4:
                c.quemaRueda();
                break;
            case 5:
                System.out.println(b.getKilometrosRecorridos());
                break;
            case 6:
                System.out.println(c.getKilometrosRecorridos());
                break;
            case 7:
                System.out.println(Vehiculo.getKilometrosTotales());
                break;
            case 8:
                System.out.println("Saliendo del programa de POO...");
                break;
            default:
                System.out.println("Opción incorrecta introducida...");
        }
    }
}
