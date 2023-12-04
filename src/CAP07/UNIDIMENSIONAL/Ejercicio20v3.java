package CAP07.UNIDIMENSIONAL;

/* Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería aparecer como Felipe 1o y el segundo como Felipe 2o. */
public class Ejercicio20v3 {
    public static void main(String[] args) {
        try {
            System.out.print("¿Cuántos reyes vas a introducir?: ");
            int numReyes = Integer.parseInt(System.console().readLine());
            String[] reyes = new String[numReyes];
            for (int i = 0; i < reyes.length; i++) {
                System.out.print("Introduce nombres de reyes: ");
                String rey = System.console().readLine();
                reyes[i] = rey;
            }
            for (int i = 0; i < reyes.length; i++) {
                int numRey = 1;
                for (int j = 0; j < i; j++) {
                    if (reyes[j].equals(reyes[i]))
                        numRey++;
                }
                System.out.printf("%s %d\n", reyes[i], numRey);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
