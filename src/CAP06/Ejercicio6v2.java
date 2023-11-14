package CAP06;

/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario de-
be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto. */
public class Ejercicio6v2 {
    public static void main(String[] args) {
        try {
            boolean acierto = false;
            int num = (int) (Math.random() * 101);
            for (int i = 1; i <= 5 & acierto == false; i++) {
                System.out.print("Introduce un número entre 0 y 100 para adivinar el generado: ");
                int numInt = Integer.parseInt(System.console().readLine());
                if (numInt > num & i != 5)
                    System.out.println("Prueba con un nº más bajo.");
                else if (numInt < num & i != 5)
                    System.out.println("Prueba con un nº más alto.");
                else if (numInt == num) {
                    System.out.println("Felicidades! Has adivinado el número");
                    acierto = true;
                }
            }
            if (acierto == false)
                System.out.printf("Lo sentimos, te has quedado sin intentos. El número era %d", num);
        } catch (Exception e) {
            System.out.println("Error inesperado.");
        }
    }
}
