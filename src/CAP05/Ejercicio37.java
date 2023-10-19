package CAP05;

/* Realiza un conversor del sistema decimal al sistema de “palotes”. */
public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        try {
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long comas = Funciones.sacaComas(largo);
            long resto = Funciones.sacaResto(largo);
            System.out.print("El número introducido es ");
            for (long i = 1; i <= largo; i++) {
                long cifras = num % resto;
                if ((i < largo)) { /* Se usa comas a partir del segundo bucle */
                    cifras = cifras / comas;
                    comas = comas / 10; /* Decrementamos comas para el siguiente bucle */
                }
                for (int j = 1; j <= cifras; j++) {
                    System.out.print("| ");
                }
                if (i != largo) {
                    System.out.print("- ");
                }
                resto = resto / 10; /* Decrementamos resto para el siguiente bucle */
            }
            System.out.println("en el sistema de palotes.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}