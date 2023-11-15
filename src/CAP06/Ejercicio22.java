package CAP06;

/* Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto. */
public class Ejercicio22 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la longitud de la serpiente (contando la cabeza): ");
            int longitud = Integer.parseInt(System.console().readLine());
            if (longitud >= 2) {
                int ancho = 13;
                for (int i = 1; i <= longitud; i++) {
                    for (int pintar = 1; pintar <= ancho; pintar++) {
                        if (i == 1) {
                            if (pintar == 13)
                                System.out.print("@");
                            else
                                System.out.print(" ");
                        } else {
                            if (pintar == ancho)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                    }
                    int posicionA = (int) (Math.random() * 3 + (ancho - 1));
                    ancho = posicionA;
                    System.out.println();
                }
            } else
                System.out.println("Introduce una longitud mayor o igual a 2");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
