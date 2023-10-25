package CAP07;

public class PruebaBandera {
    public static void main(String[] args) {
        String color[] = { "rojo", "verde", "amarillo", "azul", "cyan", "blanco", "negro" };
        System.out.print("Introduce cuántas franjas tendrá la bandera: ");
        try {
            int franjas = Integer.parseInt(System.console().readLine());
            if (franjas >= 1) {
                for (int i = 0; i < franjas; i++) {
                    int eleccion = (int) (Math.random() * 7);
                    System.out.printf("Color nº %d: %s\n", i + 1, color[eleccion]);
                }
            } else
                System.out.println("Introduce un número mayor o igual a 1.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
