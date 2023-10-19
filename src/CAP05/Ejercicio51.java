package CAP05;

/* El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo. */
public class Ejercicio51 {
    public static void main(String[] args) {
        System.out.print("Introduce un nº mayor que 0: ");
        long num = Long.parseLong(System.console().readLine());
        long largo = Funciones.largo(num);
        long resto = Funciones.sacaResto(largo);
        long comas = Funciones.sacaComas(largo);
        String numero = "";
        for (int j = 1; j <= largo; j++) {
            long cifra = num % resto;
            if (j < largo) {
                cifra = cifra / comas;
                comas /= 10;
            }
            resto /= 10;
            if (cifra != 0 & cifra != 8)
                numero = numero + cifra;
        }
        if (!(numero.equals(String.valueOf(num))))
            System.out.printf("El número resultante después del bocado del gusano es %s", numero);
        else
            System.out.println("El gusano no se ha comido ningún número.");
    }
}