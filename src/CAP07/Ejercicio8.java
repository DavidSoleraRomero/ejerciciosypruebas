package CAP07;

/* Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. */
public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                    "Octubre", "Noviembre", "Diciembre" };
            int[] temperaturas = new int[12];
            for (int i = 0; i < temperaturas.length; i++) {
                System.out.printf("Introduce la temperatura media del mes nº %d: ", i + 1);
                int temp = Integer.parseInt(System.console().readLine());
                temperaturas[i] = temp;
            }
            System.out.println("Resumen del tiempo en el año 2023:");
            System.out.print(
                    "******************************************************************************************************************\n*");
            for (int i = 0; i < meses.length; i++) {
                System.out.printf(" %" + meses[i].length() + "s *", meses[i]);
            }
            System.out.print(
                    "\n******************************************************************************************************************\n*");
            for (int i = 0; i < temperaturas.length; i++) {
                System.out.printf(" %" + meses[i].length() + "s *", String.valueOf(temperaturas[i]) + "ºC");
            }
            System.out.print(
                    "\n******************************************************************************************************************");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}