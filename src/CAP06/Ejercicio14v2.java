package CAP06;

/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir. */
public class Ejercicio14v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº para que el ordenador lo adivine (0 - 100): ");
            int num = Integer.parseInt(System.console().readLine());
            int cont = 1;
            int adivina = (int) (Math.random() * 101);
            do {
                if (adivina == num) {
                    System.out.print("¡La máquina adivinó el número! Era el número " + num);
                    break;
                } else {
                    System.out.println("Intento nº " + cont);
                    if (num != adivina & cont == 5) {
                        System.out.println("No hemos podido adivinar el número en este último intento.");
                        break;
                    }
                    System.out.print("No he podido adivinarlo. ¿El número es mayor o menor a " + adivina + "?: ");
                    String mayMen = System.console().readLine().toLowerCase();
                    if (mayMen.equals("menor"))
                        adivina = (int) (Math.random() * ((adivina + 1) - num) + num);
                    else
                        adivina = (int) (Math.random() * (100 - num) + adivina);
                }
                cont++;
            } while (cont <= 5);
        } catch (Exception e) {
            System.out.println("Error inesperado.");
        }
    }
}
