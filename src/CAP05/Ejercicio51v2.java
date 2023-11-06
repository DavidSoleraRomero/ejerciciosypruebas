package CAP05;

public class Ejercicio51v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº para ver si el gusano se come algún dígito: ");
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long nuevoNum = 0;
            for (int i = 1; i <= largo; i++) {
                long cifra = num % 10;
                num /= 10;
                if (cifra != 0 & cifra != 8)
                    nuevoNum = nuevoNum * 10 + cifra;
            }
            if (largo == Funciones.largo(nuevoNum))
                System.out.println("Esta vez el gusano NO se ha comido ningún número.");
            else
                System.out.printf("El número resultante ha sido %d", Funciones.voltea(nuevoNum));
        } catch (Exception e) {
            System.out.println("Se esperaba un Nº ENTERO. Se ha producido un error.");
        }
    }

}
