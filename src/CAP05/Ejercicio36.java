package CAP05;

/* Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos. */
public class Ejercicio36 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        try {
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long copia = num;
            long reverso = 0;
            for (long i = 1; i <= largo; i++) {
                long cifras = copia % 10;
                reverso = reverso * 10 + cifras;
                copia /= 10;
            }
            if (reverso + num == num * 2)
                System.out.printf("El número %d es capicúa.", num);
            else
                System.out.printf("El número %d no es capicúa.", num);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
