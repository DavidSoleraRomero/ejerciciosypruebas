package CAP05;

/* Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
la altura total y la fila en la que debe aparecer el palito horizontal (contando
desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
introduce algún dato incorrecto, el programa debe mostrar un mensaje de error. */
public class Ejercicio65 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la A (mayor o igual a 3): ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            int palito;
            if (altura > 3) {
                System.out.printf("Introduce la fila en la que va a estar el palito (1 - %d): ", altura - 1);
                palito = Integer.parseInt(System.console().readLine());
            } else
                palito = 1;
            if ((palito >= 1 & palito <= altura - 1) & altura >= 3) {
                int pinta1 = ((altura * 2) / 2);
                int pinta2 = ((altura * 2) / 2);
                for (int i = 1; i <= altura; i++) {
                    for (int espaciosAste = 1; espaciosAste <= altura * 2 - 1; espaciosAste++) {
                        if (i == 1) {
                            if (espaciosAste == (altura * 2 / 2))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        } else {
                            if (i == palito)
                                if (espaciosAste >= pinta1 & espaciosAste <= pinta2)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            else if (espaciosAste == pinta1 | espaciosAste == pinta2)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                    }
                    pinta1--;
                    pinta2++;
                    System.out.println();
                }
            } else
                System.out.printf(
                        "Se han encontrado posibles errores:\n1. Introduce una altura superior o igual a 3.\n2. Introduce el palito entre la posición 1 y %d.",
                        altura - 1);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
