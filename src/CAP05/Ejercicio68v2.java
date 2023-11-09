package CAP05;

public class Ejercicio68v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº: ");
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long nuevoNum = 0;
            for (int i = 1; i <= largo; i++) {
                long cifra = num % 10;
                num /= 10;
                if (cifra % 2 == 0)
                    nuevoNum = nuevoNum * 10 + cifra + 1;
                else
                    nuevoNum = nuevoNum * 10 + cifra - 1;
            }
            System.out.printf("Número dislocado es %d", Funciones.voltea(nuevoNum));
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº entero.");
        }
    }
}
