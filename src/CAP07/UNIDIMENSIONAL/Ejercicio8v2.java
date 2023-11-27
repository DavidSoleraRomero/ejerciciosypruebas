package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. */
public class Ejercicio8v2 {
    public static void main(String[] args) {
        int year = (int) (Math.random() * 24 + 2000);
        System.out.printf("Mostrando la temperatura media del año %d\n", year);
        int[] temperaturas = new int[12];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = (int) (Math.random() * 45 + 1);
            System.out.println("Temperatura del mes " + (i + 1) + ": " + temperaturas[i]);
        }
        System.out.printf("\n%-11s", "Mes");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf(" |%11s", muestraMeses(i + 1));
        }
        System.out.printf(" |\n%-11s", "Temperatura");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf(" |%11d", temperaturas[i]);
        }
        System.out.println(" |");
    }

    public static String muestraMeses(int i) {
        switch (i) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            default:
                return "Diciembre";
        }
    }
}
