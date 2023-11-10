package CAP05;

public class EjercicioCarta {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce el texto para la carta (Máximo 200 carácteres): ");
            String texto = Funciones.entradaString();
            int largoTexto = texto.length();
            if (largoTexto <= 200) {
                int alto = largoTexto + 1;
                int ancho = 6 + (largoTexto * 2) - 1;
                for (int i = 1; i <= ancho; i++) {
                    System.out.print("*");
                }
                System.out.println();
                int copiaAlt = alto;
                for (int i = 1; i <= alto; i++) {
                    System.out.print("* ");
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (copiaAlt * 2 - 1); j++) {
                        if (j == 1 | j == (copiaAlt * 2 - 1))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    copiaAlt--;
                    System.out.printf("%" + (i + 1) + "s", " *");
                    System.out.println();
                }
                System.out.printf("*%-" + (ancho - 2) + "s*\n", " ");
                int espacioTexto1 = (ancho - largoTexto - 4) / 2;
                int espacioTexto2 = espacioTexto1;
                if (largoTexto % 2 == 0)
                    espacioTexto1++;
                System.out.printf("* %-" + espacioTexto1 + "s%s%" + espacioTexto2 + "s *\n", " ", texto, " ");
                System.out.printf("*%-" + (ancho - 2) + "s*\n", " ");
                for (int i = 1; i <= ancho; i++) {
                    System.out.print("*");
                }
            } else
                System.out.println("El máximo era de 200 carácteres");
        } catch (Exception e) {
            System.out.println("Se ha producido un error, se esperaba un nº entero.");
        }
    }
}
