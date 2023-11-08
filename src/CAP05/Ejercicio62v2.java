package CAP05;

public class Ejercicio62v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº entero: ");
            long num = Long.parseLong(System.console().readLine());
            long copiaNum = num;
            int acumS = 0;
            int acumM = 0;
            do {
                if (copiaNum % 10 == 3 | copiaNum % 10 == 7 | copiaNum % 10 == 8 | copiaNum % 10 == 9)
                    acumS++;
                else
                    acumM++;
                copiaNum /= 10;
            } while (copiaNum > 0);
            System.out.printf(num + " es %s",
                    (acumS > acumM) ? "número afortunado"
                            : (acumS < acumM) ? "número NO afortunado" : "número indiferente");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº entero.");
        }
    }
}
