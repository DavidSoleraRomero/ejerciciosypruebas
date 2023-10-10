package CAP05;

/* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. */
public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para verlo al revés: ");
        int num = Integer.parseInt(System.console().readLine());
        String longitud = num + "";
        String suma = "";
        int resto = 10;
        int comas = 10;
        for (int i = longitud.length() - 1; !(i < 0); i--) {
            int iultimaCifra = num % resto;
            if ((i <= longitud.length() - 2)) {
                iultimaCifra = iultimaCifra / comas;
                comas = comas * 10;
            }
            suma = suma + "" + iultimaCifra;
            resto = resto * 10;
        }
        System.out.print("El número al reves es " + suma);
    }
}
