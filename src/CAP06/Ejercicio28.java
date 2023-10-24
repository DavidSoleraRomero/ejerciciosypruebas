package CAP06;

/* Realiza un programa que sea capaz de recolocar los números de un array de
fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
del array. A continuación generará un array con ese tamaño con números
enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
irá colocando desde fuera hacia adentro los números de tal forma que el
primero se coloca en la primera posición, el segundo en la última, el tercero
en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
el array resultado. */
public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.print("Introduce el tamaño del array: ");
        try {
            int tamano = Integer.parseInt(System.console().readLine());
            System.out.println("Array: ");
            System.out.printf("%-6s", "Índice");
            for (int i = 0; i < tamano; i++) {
                System.out.printf("%5d", i);
            }
            System.out.println();
            System.out.printf("%-6s", "Valor");
            for (int i = 0; i < tamano; i++) {
                System.out.printf("%5d", (int) (Math.random() * 201));
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
