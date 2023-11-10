package CAP05;

public class EjercicioDerecha {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide hacia la derecha: ");
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 2) {
                int aux = 1;
                int alt = altura * 2 - 1;
                for (int i = 1; i <= alt; i++) {
                    for (int j = 1; j <= aux; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    if (i <= alt / 2)
                        aux++;
                    else
                        aux--;
                }
            } else
                System.out.println("Introduce una altura superior o igual a 2");
        } catch (Exception e) {
            System.out.print("\nSe ha producido un error. Se esperaba un nº.");
        }
    }
}
