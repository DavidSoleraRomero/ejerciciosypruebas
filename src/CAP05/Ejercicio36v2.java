package CAP05;

/* Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos. */
public class Ejercicio36v2 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        try {
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long comas = Funciones.sacaComas(largo);
            long resto = Funciones.sacaResto(largo);
            long primeraMitad = 0;
            long segundaMitad = 0;
            for (long i = 1; i <= largo; i++) {
                long cifras = num % resto;
                if ((i < largo)) { /* Se usa comas a partir del segundo bucle */
                    cifras = cifras / comas;
                    comas = comas / 10; /* Decrementamos comas para el siguiente bucle */
                }
                if (largo % 2 == 0) {
                    if (i <= largo / 2)
                        primeraMitad = primeraMitad + cifras;
                    else
                        segundaMitad = segundaMitad + cifras;
                } else {
                    if (i <= largo / 2)
                        primeraMitad = primeraMitad + cifras;
                    else if (i >= (largo / 2) + 2)
                        segundaMitad = segundaMitad + cifras;
                }
                resto = resto / 10; /* Decrementamos resto para el siguiente bucle */
            }
            if (primeraMitad == segundaMitad)
                System.out.printf("El número %d es capícua.", num);
            else
                System.out.printf("El número %d no es capícua.", num);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
