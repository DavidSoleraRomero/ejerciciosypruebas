package CAP04;

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.print("Introduce un nº (MÁX 5 CIFRAS): ");
        int num = Integer.parseInt(System.console().readLine());
        String longitud = num + "";
        if (!(longitud.length() > 5)) {
            double dultimaCifra = Math.pow(10, longitud.length() - 1);
            int iultimaCifra = num / (int) dultimaCifra;
            System.out.printf("La primera cifra es %d", iultimaCifra);
        } else {
            System.out.println("Introduzca un número inferior o igual a 5 cifras");
        }

    }
}
