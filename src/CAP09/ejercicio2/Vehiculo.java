package CAP09.ejercicio2;

public abstract class Vehiculo {

    private static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;

    public Vehiculo() {
        vehiculosCreados++;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public void andar(int km) {
        System.out.printf("%s %d %s", "Andando", km, "kilómetros...");
        this.kilometrosRecorridos += km;
        kilometrosTotales += km;
    }

    public static void menu() {
        System.out.println("\nVEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.print("Elige una opción (1-8): ");
    }

}
