package CAP06;

/* Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima. */
public class Ejercicio29 {
    public static void main(String[] args) {
        menu();
        try {
            int opcion = Integer.parseInt(System.console().readLine());
            if (opcion >= 1 & opcion <= 4) {
                System.out.println("\nPrevisión del tiempo para mañana");
                System.out.println("--------------------------------");
                int tempMax = 0;
                int tempMin = 0;
                int soleado = 0;
                // Switch que selecciona estación y determina las temperaturas y el porcentaje
                // de soleado / nublado. Permite que la min sea igual a la max
                switch (opcion) {
                    case 1:
                        tempMax = (int) (Math.random() * 16 + 15);
                        tempMin = (int) (Math.random() * (tempMax - 14) + 15);
                        soleado = 60;
                        break;
                    case 2:
                        tempMax = (int) (Math.random() * 21 + 25);
                        tempMin = (int) (Math.random() * (tempMax - 24) + 25);
                        soleado = 80;
                        break;
                    case 3:
                        tempMax = (int) (Math.random() * 11 + 20);
                        tempMin = (int) (Math.random() * (tempMax - 19) + 20);
                        soleado = 40;
                        break;
                    case 4:
                        tempMax = (int) (Math.random() * 26);
                        tempMin = (int) (Math.random() * (tempMax));
                        soleado = 20;
                        break;
                }
                int solNub = (int) (Math.random() * 100 + 1);
                String tiempo;
                if (solNub <= soleado)
                    tiempo = "Soleado";
                else
                    tiempo = "Nublado";
                System.out.printf("Temperatura mínima: %d\n", tempMin);
                System.out.printf("Temperatura máxima: %d\n", tempMax);
                System.out.printf("%s", tiempo);
            } else
                System.out.println("Introduce una estación que se encuentre en el menú");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un número.");
        }
    }

    public static void menu() {
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
    }
}
