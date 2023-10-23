package CAP05;

/* Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte. */
public class Ejercicio7 {
    public static void main(String[] args) {
        int codCaja = 0001;
        for (int i = 3; i >= 0; i--) {
            System.out.println("Introduce el código, tienes " + (i + 1) + " intentos.");
            int acceso = Integer.parseInt(System.console().readLine());
            if (acceso == codCaja) {
                System.out.println("Código CORRECTO");
                System.out.println("Accediendo al sistema...");
                i = -1;
            } else {
                System.out.println("Código INCORRECTO, " + i + " intentos restantes.");
            }
            if (acceso != codCaja & i == 0)
                System.out.println("Lo siento, te quedaste sin intentos.");
        }

    }
}
