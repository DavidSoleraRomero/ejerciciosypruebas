package CAP06;

public class Ejercicio30v4 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pecera: ");
            int altura = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce la anchura de la pecera: ");
            int anchura = Integer.parseInt(System.console().readLine());
            if (altura >= 4 & anchura >= 4) {
                anchura = anchura * 2 - 1;
                int pezI = (int) (Math.random() * (altura - 2) + 2);
                int pezJ = (int) (Math.random() * (anchura - 2) + 2);
                int carI = (int) (Math.random() * (altura - 2) + 2);
                int carJ = (int) (Math.random() * (anchura - 2) + 2);
                int cabI = (int) (Math.random() * (altura - 2) + 2);
                int cabJ = (int) (Math.random() * (anchura - 2) + 2);
                while (pezJ == carJ | pezJ == cabJ | carJ == cabJ) {
                    carJ = (int) (Math.random() * (anchura - 2) + 2);
                    cabJ = (int) (Math.random() * (anchura - 2) + 2);
                }
                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= anchura; j++) {
                        if (i != 1 & i != altura) {
                            if (i == pezI & j == pezJ)
                                System.out.print("&");
                            else if (i == cabI & j == cabJ)
                                System.out.print("$");
                            else if (i == carI & j == carJ)
                                System.out.print("@");
                            else if (j != 1 & j != anchura)
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        } else {
                            if (j % 2 == 0)
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            } else
                System.out.println("Altura / Anchura >= 4");
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
