package CAP07.UNIDIMENSIONAL;

/* Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería aparecer como Felipe 1o y el segundo como Felipe 2o. */
public class Ejercicio20 {
    public static void main(String[] args) {
        try {
            System.out.print("¿Cuántos reyes vas a introducir?: ");
            int cantidadReyes = Integer.parseInt(System.console().readLine());
            String[] reyes = new String[cantidadReyes];
            System.out.println("Introduzca el nombre de cada rey y pulse intro");
            for (int i = 0; i < reyes.length; i++) {
                String rey = System.console().readLine();
                reyes[i] = rey;
            }

            System.out.println("\nLos reyes introducidos son:");
            for (int i = 0; i < reyes.length; i++) {
                int ordinal = 1;
                for (int j = 0; j < i; j++) {
                    if (reyes[i].equals(reyes[j]))
                        ordinal++;
                }
                System.out.println(reyes[i] + " " + ordinal + "º");
            }
        } catch (Exception e) {
            System.out.println("Se produjo un error. Se esperaba un número.");
        }
    }
}
