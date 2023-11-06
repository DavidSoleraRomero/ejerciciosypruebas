package CAP05;

public class Ejercicio50v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura del 155: ");
            int altura = Funciones.entradaInt();
            System.out.print("Introduce los espacios entre números: ");
            int espacios = Funciones.entradaInt();
            if (altura >= 5 & espacios >= 1) {
                String formatoi = "*%" + espacios + "s****%" + espacios + "s****";
                String formato2 = "*%" + espacios + "s*   %" + espacios + "s*   ";
                String formatoresto = "*%" + espacios + "s   *%" + espacios + "s   *";
                System.out.printf(formatoi + "\n", " ", " ");
                System.out.printf(formato2 + "\n", " ", " ");
                System.out.printf(formatoi + "\n", " ", " ");
                for (int i = 1; i <= altura - 4; i++) {
                    System.out.printf(formatoresto + "\n", " ", " ");
                }
                System.out.printf(formatoi, " ", " ");
            } else
                System.out.println("Altura de 5 o superior y espacios de 1 o superior");
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
