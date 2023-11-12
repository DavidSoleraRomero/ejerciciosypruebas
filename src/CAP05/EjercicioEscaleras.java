package CAP05;

public class EjercicioEscaleras {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce cantidad de escalones: ");
            int escalones = Funciones.entradaInt();
            System.out.print("Introduce altura de cada escalón: ");
            int alturaEsc = Funciones.entradaInt();
            if (escalones > 0 & alturaEsc > 0) {
                int escalon = 1;
                for (int i = 1; i <= escalones * alturaEsc; i++) {
                    for (int ast = 1; ast <= escalon; ast++) {
                        System.out.print("****");
                    }
                    System.out.println();
                    if (i % alturaEsc == 0)
                        escalon++;
                }
            } else
                System.out.println("Alturas mayor que 0 por favor.");
        } catch (Exception e) {
            System.out.println("Error. Se esperaba nº entero.");
        }
    }
}
