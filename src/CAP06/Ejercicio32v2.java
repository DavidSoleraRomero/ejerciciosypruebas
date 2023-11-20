package CAP06;

public class Ejercicio32v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la longitud del sendero en metros: ");
            int longitud = Integer.parseInt(System.console().readLine());
            int acum = 1;
            int espacios = 6;
            String obstaculo = "";
            do {
                for (int i = 1; i <= espacios; i++) {
                    System.out.print(" ");
                }
                if (hayObs() == 1) {
                    obstaculo = " ";
                } else {
                    if (hayObs() == 1)
                        obstaculo = "O";
                    else
                        obstaculo = "*";
                }
                int posObs = (int) (Math.random() * 3 + 2);
                for (int i = 1; i <= 5; i++) {
                    if (i == 1 | i == 5)
                        System.out.print("|");
                    if (i == posObs)
                        System.out.print(obstaculo);
                    else
                        System.out.print(" ");
                }
                System.out.println();
                Thread.sleep(100);
                espacios = (int) (Math.random() * 3 + (espacios - 1));
                acum++;
            } while (acum <= longitud);
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }

    public static int hayObs() {
        return (int) (Math.random() * 2 + 1);
    }
}
