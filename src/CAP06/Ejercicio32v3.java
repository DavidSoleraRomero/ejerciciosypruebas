package CAP06;

public class Ejercicio32v3 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la longitud del sendero: ");
            int longitud = Integer.parseInt(System.console().readLine());
            int espacios = 12;
            if (longitud > 0) {
                for (int i = 1; i <= longitud; i++) {
                    boolean hayObstaculo = obstaculo((int) (Math.random() * 2));
                    String obstaculo = "";
                    int posicion = 2;
                    if (hayObstaculo == false)
                        obstaculo = " ";
                    else {
                        boolean piedraHierba = obstaculo((int) (Math.random() * 2));
                        if (piedraHierba)
                            obstaculo = "O";
                        else
                            obstaculo = "*";
                        posicion = (int) (Math.random() * 4 + 2);
                    }
                    for (int j = 1; j <= espacios; j++) {
                        System.out.print(" ");
                    }
                    Thread.sleep(100);
                    for (int k = 1; k <= 6; k++) {
                        if (k == 1 | k == 6)
                            System.out.print("|");
                        else if (k == posicion)
                            System.out.print(obstaculo);
                        else
                            System.out.print(" ");
                    }
                    espacios = (int) (Math.random() * 3 + (espacios - 1));
                    System.out.println();
                }
            } else
                System.out.println("Introduce un nº positivo.");
        } catch (Exception e) {
            System.out.println("\nSe ha producido un error.");
        }
    }

    public static boolean obstaculo(int i) {
        return (i == 1) ? true : false;
    }
}
