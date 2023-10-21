package CAP05;

/* Escribe un programa que pida un número por teclado y que luego lo “dislo-
que” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos. */
public class Ejercicio68 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        try {
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long resto = Funciones.sacaResto(largo);
            long comas = Funciones.sacaComas(largo);
            long miNum = 0;
            for (int i = 1; i <= largo; i++) {
                long cifra = num % resto;
                if (i < largo) {
                    cifra = cifra / comas;
                    comas /= 10;
                }
                if (cifra % 2 == 0)
                    miNum = miNum * 10 + (cifra + 1);
                else
                    miNum = miNum * 10 + (cifra - 1);
                resto /= 10;
            }
            System.out.printf("El número resultante es %d", miNum);
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
