package CAP09;

/* Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
instancias y aplicándole algunos métodos. */
public class Ejercicio1 {
    public static void main(String[] args) {
        Caballo c1 = new Caballo("Marrón", "Frisón", "Pescado crudo");
        Caballo c2 = new Caballo("Blanco y negro", "Gallego", "Nacho");
        System.out.println();
        c1.comer();
        c2.comer();
        System.out.println();
        c1.correr();
        c2.correr();
        System.out.println();
        System.out.println(c1.getComidaFavorita());
        System.out.println(c2.getComidaFavorita());
    }
}
