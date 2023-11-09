package CAP05;

public class Ejercicio67v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce cuántos escalones quieres: ");
            int escalones = Funciones.entradaInt();
            System.out.print("Introduce la altura de cada escalón: ");
            int altEsc = Funciones.entradaInt();
            int reserva = 4;
            if (altEsc >= 1 & escalones >= 2) {
                for (int i = 1; i <= escalones; i++) {
                    for (int j = 1; j <= altEsc; j++) {
                        for (int esc = 1; esc <= reserva; esc++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    reserva += 4;
                }
            } else
                System.out.println("Introduce altura superior o igual a 1 y más de 1 escalón");
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº entero.");
        }
    }
}