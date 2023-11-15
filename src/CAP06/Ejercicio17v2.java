package CAP06;

/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo. */
public class Ejercicio17v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce el ancho de la pecera (mínimo 4): ");
            int ancho = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce el alto de la prece (mínimo 4): ");
            int alto = Integer.parseInt(System.console().readLine());
            if (alto >= 4 & ancho >= 4) {
                int posI = (int) (Math.random() * (alto - 2) + 2);
                ancho = ancho * 2 - 1;
                int posJ = (int) (Math.random() * (ancho - 2) + 2);
                for (int i = 1; i <= alto; i++) {
                    for (int j = 1; j <= ancho; j++) {
                        if ((j % 2 != 0 & i == 1) | (j % 2 != 0 & i == alto))
                            System.out.print("*");
                        else if (j == 1 | j == ancho)
                            System.out.print("*");
                        else if (i == posI & j == posJ)
                            System.out.print("&");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduzca una altura y anchura superiores o igual a 4.");
        } catch (Exception e) {
            System.out.println("Error inesperado. Se esperaba un nº entero positivo.");
        }
    }
}
