package CAP06;

/* Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima. */
public class Ejercicio29v2 {
    public static void main(String[] args) {
        try {
            menu();
            int estacion = Integer.parseInt(System.console().readLine());
            if (estacion <= 4) {
                int max = 0;
                int min = 0;
                if (estacion == 1) {
                    max = (int) (Math.random() * 16 + 15);
                    min = (int) (Math.random() * (max - 15) + 15);
                } else if (estacion == 2) {
                    max = (int) (Math.random() * 21 + 25);
                    min = (int) (Math.random() * (max - 25) + 25);
                } else if (estacion == 3) {
                    max = (int) (Math.random() * 11 + 20);
                    min = (int) (Math.random() * (max - 20) + 20);
                } else if (estacion == 4) {
                    max = (int) (Math.random() * 26);
                    min = (int) (Math.random() * max + 1);
                }
                System.out.println("\nPrevisión del tiempo para mañana\n----------------------------------");
                System.out.printf("Temperatura mínima: %dºC\n", min);
                System.out.printf("Temperatura máxima: %dºC\n%s", max, soleadoNublado(estacion));
            } else
                System.out.println("Introduzca una opción válida.");
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }

    public static void menu() {
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Selecciones la estación del año (1-4): ");
    }

    public static String soleadoNublado(int i) {
        int num = (int) (Math.random() * 100);
        if (i == 1)
            return (num <= 60) ? "Soleado" : "Nublado";
        else if (i == 2)
            return (num <= 80) ? "Soleado" : "Nublado";
        else if (i == 3)
            return (num <= 40) ? "Soleado" : "Nublado";
        else
            return (num <= 20) ? "Soleado" : "Nublado";
    }
}
