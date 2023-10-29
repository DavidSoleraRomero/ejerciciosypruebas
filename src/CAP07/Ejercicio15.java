package CAP07;

/* Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del programa se ilustra a continuación: */
public class Ejercicio15 {
    public static void main(String[] args) {
        int[] mesa = new int[10];
        for (int i = 0; i < mesa.length; i++) {
            int valor = (int) (Math.random() * 5);
            mesa[i] = valor;
        }
        try {
            int comensales = 0;
            do {
                System.out.println("*****************************************************");
                System.out.printf("* %-9s %3d %3d %3d %3d %3d %3d %3d %3d %3d %3d *\n* %9s ", "Mesa nº", 1, 2, 3, 4, 5,
                        6, 7, 8, 9, 10, "Ocupación");
                for (int i : mesa) {
                    System.out.printf("%3d ", i);
                }
                System.out.println("*\n*****************************************************");
                System.out.print("\n¿Cuántos comensales van a comer? (-1 para salir): ");
                comensales = Integer.parseInt(System.console().readLine());
                if (comensales == -1) {
                    System.out.println("Gracias por venir. ¡Hasta pronto!");
                    break;
                }
                boolean sentados = false;
                if (comensales > 0 & comensales < 5) {
                    for (int i = 0; i < mesa.length; i++) {
                        if (mesa[i] == 0) {
                            System.out.println("\nPor favor, siéntese en la mesa número " + (i + 1));
                            mesa[i] = comensales;
                            sentados = true;
                            break;
                        }
                    }
                    if (sentados == false) {
                        for (int i = 0; i < mesa.length; i++) {
                            if ((mesa[i] + comensales) <= 4 & (mesa[i] + comensales) >= 0) {
                                System.out.println("\nPor favor, comparta mesa en la mesa número " + (i + 1));
                                mesa[i] = comensales + mesa[i];
                                break;
                            }
                            if (i == (mesa.length - 1))
                                System.out.println("\nLo sentimos, no nos quedan mesas disponibles para ese grupo.");
                        }
                    }
                } else
                    System.out.printf("\nLo siento, no admitimos grupos de %d, haga grupos de máximo 4 personas.\n",
                            comensales);
            } while (true);
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Introduzca un número.");
        }
    }
}