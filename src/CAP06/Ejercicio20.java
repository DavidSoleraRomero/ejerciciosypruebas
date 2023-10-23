package CAP06;

/* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía. */
public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.print("Introduce la capacidad de la cuba en litros (mínimo 1): ");
        try {
            int capacidad = Integer.parseInt(System.console().readLine());
            if (capacidad >= 1) {
                int agua = (int) (Math.random() * (capacidad + 1) + 1);
                System.out.println(agua);
                for (int i = 1; i <= capacidad + 1; i++) {
                    for (int asteriscos = 1; asteriscos <= 6; asteriscos++) {
                        if (i == capacidad + 1)
                            System.out.print("*");
                        else if (asteriscos == 1 | asteriscos == 6)
                            System.out.print("*");
                        else if (agua != capacidad + 1 & i >= agua)
                            System.out.print("=");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduzca una capacidad mayor o igual a 1");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
