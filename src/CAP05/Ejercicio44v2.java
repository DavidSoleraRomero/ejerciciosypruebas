package CAP05;

public class Ejercicio44v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº entero positivo: ");
            long num = Long.parseLong(System.console().readLine());
            System.out.print("Indica la posición en la que insertar el nº: ");
            long posicion = Long.parseLong(System.console().readLine());
            System.out.print("Indica qué número quieres insertar: ");
            long numPos = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            if (num > 0 && posicion <= largo) {
                long resto = Funciones.sacaResto(largo);
                long comas = resto / 10;
                long numCambiado = 0;
                for (int i = 1; i <= largo; i++) {
                    long cifra = num % resto;
                    resto /= 10;
                    if (i < largo)
                        cifra = cifra / comas;
                    comas /= 10;
                    if (i == posicion)
                        numCambiado = (numCambiado * 10 + numPos) * 10 + cifra;
                    else
                        numCambiado = numCambiado * 10 + cifra;
                }
                System.out.printf("El número resultante es %d", numCambiado);
            } else
                System.out.println("Se requiere de un nº positivo y de una posición inferior al largo");
        } catch (Exception e) {
            System.out.println("Se ha producido un error, se esperaba un nº.");
        }
    }
}
