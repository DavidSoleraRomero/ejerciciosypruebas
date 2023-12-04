package CAP07.UNIDIMENSIONAL;

/* Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del programa se ilustra a continuación: */
public class Ejercicio15v2 {
    public static void main(String[] args) {
        try {
            int[] mesas = new int[10];
            for (int i = 0; i < mesas.length; i++) {
                mesas[i] = (int) (Math.random() * 5);
            }
            boolean salir = false;
            do {
                System.out.print("Situación actual del restaurante: \n");
                pintaArray("Mesa", mesas.length);
                System.out.printf("%-8s", "Clientes");
                for (int i = 0; i < mesas.length; i++) {
                    System.out.printf("%3d", mesas[i]);
                }
                System.out.print("\nIntroduce cuántos comensales van a comer: ");
                int comensales = Integer.parseInt(System.console().readLine());
                if (comensales > 4)
                    System.out.println("Lo siento, no admitimos grupos de " + comensales);
                else if (comensales <= 4 & comensales >= 1) {
                    for (int i = 0; i < mesas.length; i++) {
                        if (mesas[i] + comensales <= 4) {
                            System.out.println("Vayan a comer a la mesa número " + i + "\n");
                            mesas[i] = mesas[i] + comensales;
                            break;
                        } else if (i == mesas.length - 1)
                            System.out.println("No nos quedan mesas disponibles para todo el mundo\n");
                    }
                }

            } while (!salir);
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }

    public static void pintaArray(String texto, int i) {
        System.out.printf("%-8s", texto);
        for (int j = 0; j < i; j++) {
            System.out.printf("%3d", j);
        }
        System.out.println();
    }
}
