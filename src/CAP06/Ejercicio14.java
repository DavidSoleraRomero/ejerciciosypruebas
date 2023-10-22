package CAP06;

/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir. */
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para que el ordenador lo adivine: ");
        try {
            int num = Integer.parseInt(System.console().readLine());
            int min = 0;
            int max = 101;
            int adivina = (int) (Math.random() * max);
            boolean adivinado = false;
            String menMay = "";
            for (int i = 1; i <= 5; i++) {
                if (adivina == num) {
                    System.out.printf("\nEl ordenador ha adivinado el número, es el %d", adivina);
                    adivinado = true;
                    break;
                }
                System.out.printf("Ha salido el número %d en el intento nº %d", adivina, i);
                if (i != 5) {
                    System.out.print("\n¿El número a adivinar es menor o mayor?: ");
                    menMay = System.console().readLine();
                }
                if (menMay.toLowerCase().equals("menor")) {
                    adivina = (int) (Math.random() * adivina);
                } else if (menMay.toLowerCase().equals("mayor")) {
                    min = num;
                    max = 101 - min;
                    adivina = (int) (Math.random() * max + min);
                }
            }
            if (adivinado == false)
                System.out.print("\nLo sentimos, no hemos podido adivinar el número.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
