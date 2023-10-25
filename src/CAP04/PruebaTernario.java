package CAP04;

/* Prueba para comprobar el funcionamiento de los ternarios en java */
public class PruebaTernario {
    public static void main(String[] args) {
        System.out.print("Introduce un número (0-1): ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.printf("%s", (num + 1 == 1) ? "Hola" : "Adios");
    }
}
