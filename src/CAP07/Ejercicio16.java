package CAP07;

/* Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes. */
public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        try {
            for (int i = 0; i < numeros.length; i++) {
                int num = (int) (Math.random() * 401);
                numeros[i] = num;
            }
            for (int i : numeros) {
                System.out.print(i + " ");
            }
            System.out.println("\nIntroduce qué números quieres resaltar:\n1. Múltiplos de 5\n2. Múltiplos de 7");
            int opcion = Integer.parseInt(System.console().readLine());
            if (opcion == 1) {
                for (int i : numeros) {
                    if (i % 5 == 0)
                        System.out.print("[" + i + "] ");
                    else
                        System.out.print(i + " ");
                }
            } else if (opcion == 2) {
                for (int i : numeros) {
                    if (i % 7 == 0)
                        System.out.print("[" + i + "] ");
                    else
                        System.out.print(i + " ");
                }
            } else
                System.out.println("Introduzca una de las opciones proporcionadas.");
        } catch (Exception e) {
            System.out.println("Se esperaba un nº. Se ha producido un error.");
        }
    }
}
