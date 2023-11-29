package CAP06;

public class Ejercicio32v4 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la longitud del sendero: ");
            int longitud = Integer.parseInt(System.console().readLine());
            if (longitud > 0) {
                int espacios = 12;
                String obstaculo = "";
                for (int i = 1; i <= longitud; i++) {
                    if (dosOpciones() == false)
                        obstaculo = " ";
                    else {
                        if (dosOpciones() == true)
                            obstaculo = "O";
                        else
                            obstaculo = "*";
                    }
                    int posicion = (int) (Math.random() * 4 + 2);
                    for (int j = 1; j <= espacios; j++) {
                        System.out.print(" ");
                    }
                    espacios = (int) (Math.random() * 3 + (espacios - 1));
                    for (int k = 1; k <= 6; k++) {
                        if (k == 1 | k == 6)
                            System.out.print("|");
                        else if (k == posicion)
                            System.out.print(obstaculo);
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println("\nError producido");
        }
    }

    public static boolean dosOpciones() {
        int num = (int) (Math.random() * 2);
        return (num == 0) ? true : false;
    }
}
