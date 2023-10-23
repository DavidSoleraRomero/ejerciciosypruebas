package CAP06;

/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo. */
public class Ejercicio17 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce el alto de la pecera (mínimo 4): ");
            int altura = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce el ancho de la pecera (mínimo 4): ");
            int anchura = Integer.parseInt(System.console().readLine());
            if (altura >= 4 & anchura >= 4) {
                int posicionI = (int) (Math.random() * (altura - 2) + 2);
                int posicionAste = (int) (Math.random() * (anchura * 2 - 3) + 2);
                for (int i = 1; i <= altura; i++) {
                    for (int asteriscos = 1; asteriscos <= anchura * 2 - 1; asteriscos++) {
                        if (i == posicionI & asteriscos == posicionAste)
                            System.out.print("&");
                        else if (i == 1 | i == altura) {
                            if (asteriscos % 2 != 0)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        } else if (i != 1 & i != altura) {
                            if (asteriscos == 1 | asteriscos == anchura * 2 - 1)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            } else
                System.out.println("Se esperaba una altura / anchura mayor o igual a 4.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
