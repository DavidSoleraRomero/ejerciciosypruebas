package CAP06;

/* Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto. */
public class Ejercicio22v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la longitud de la serpiente: ");
            int longitud = Integer.parseInt(System.console().readLine());
            for (int i = 1; i <= 12; i++) {
                System.out.print(" ");
            }
            System.out.println("@");
            int random = (int) (Math.random() * 3 + 11);
            for (int i = 1; i <= longitud - 1; i++) {
                int anterior = random;
                random = (int) (Math.random() * 3 + (anterior - 1));
                for (int j = 1; j <= anterior; j++) {
                    System.out.print(" ");
                }
                System.out.print("#\n");
            }
        } catch (Exception e) {
            System.out.println("Error inesperado.");
        }
    }
}
