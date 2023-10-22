package CAP06;

/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario de-
be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto. */
public class Ejercicio6 {
    public static void main(String[] args) {
        int adivinarNum = (int) (Math.random() * 101);
        boolean acierto = false;
        int acum = 1;
        System.out.println("TIENES 5 INTENTOS PARA ADIVINAR EL NÚMERO");
        do {
            System.out.print(acum + ". Introduce el nº para adivinar: ");
            int num = Integer.parseInt(System.console().readLine());
            if (num == adivinarNum) {
                System.out.println("Felicidades, has acertado.");
                acierto = true;
            } else if (num > adivinarNum)
                System.out.println("El número a adivinar es MENOR al introducido.");
            else if (num < adivinarNum)
                System.out.println("El número a adivinar es MAYOR al introducido.");
            acum++;
        } while (acierto == false & acum <= 5);
        if (acierto == false)
            System.out.printf("Te has quedado sin intentos, el número era el %d", adivinarNum);
    }
}