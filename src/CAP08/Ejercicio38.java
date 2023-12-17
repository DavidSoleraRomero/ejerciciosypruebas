package CAP08;

/* Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
public int[] filtraCapicuas(int x[]) // Devuelve un array con todos los números
                                     // capicúa que se encuentren en otro array
                                     // que se pasa como parámetro.
                                     // Obviamente el tamaño del array que se
                                     // devuelve será menor o igual al que se
                                     // pasa como parámetro.

Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números capicúa se
conservan; es decir, si en el array x el número 505 se repite 3 veces, en el
array devuelto también estará repetido 3 veces. Si no existe ningún número
capicúa en x, se devuelve un array con el número -1 como único elemento. */
public class Ejercicio38 {
    public static void main(String[] args) {
        int[] prueba = new int[1000];
        for (int i = 0; i < prueba.length; i++) {
            prueba[i] = (int) (Math.random() * 100000);
            System.out.printf("%d ", prueba[i]);
        }
        System.out.println("\n");
        int[] capicuas = filtraCapicuas(prueba);
        for (int i = 0; i < capicuas.length; i++) {
            System.out.printf("%d ", capicuas[i]);
        }
    }

    public static int[] filtraCapicuas(int x[]) {
        int[] capicuas = new int[sacaNumCapicuas(x)];
        if (capicuas.length == 0) {
            int[] aux = { -1 };
            return aux;
        }
        int cont = 0;
        for (int i = 0; i < x.length; i++) {
            if (Paquete1a14.esCapicua(x[i]))
                capicuas[cont++] = x[i];
        }
        return capicuas;
    }

    public static int sacaNumCapicuas(int x[]) {
        int cont = 0;
        for (int i = 0; i < x.length; i++) {
            if (Paquete1a14.esCapicua(x[i]))
                cont++;
        }
        return cont;
    }
}
