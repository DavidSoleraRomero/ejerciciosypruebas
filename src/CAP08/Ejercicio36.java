package CAP08;

/* Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
public static int[] filtraPrimos(int x[]) // Devuelve un array con todos los
                                          // números primos que se encuentren
                                          // en otro array que se pasa como
                                          // parámetro.
                                          // Obviamente el tamaño del array
                                          // que se devuelve será menor o
                                          // igual al que se pasa como
                                          // parámetro.

Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
también estará repetido 3 veces. Si no existe ningún número primo en x, se
devuelve un array con el número -1 como único elemento. */
public class Ejercicio36 {
    public static void main(String[] args) {
        int[] prueba = new int[20];
        for (int i = 0; i < prueba.length; i++) {
            prueba[i] = (int) (Math.random() * 102);
            System.out.printf("%d ", prueba[i]);
        }
        System.out.println("\n");
        int[] primos = filtraPrimos(prueba);
        for (int i = 0; i < primos.length; i++) {
            System.out.printf("%d ", primos[i]);
        }
    }

    public static int[] filtraPrimos(int x[]) {
        int[] primos = new int[sacaNumPrimos(x)];
        if (primos.length == 0) {
            int[] aux = { -1 };
            return aux;
        }
        int cont = 0;
        for (int i = 0; i < x.length; i++) {
            if (Paquete1a14.esPrimo(x[i]))
                primos[cont++] = x[i];
        }
        return primos;
    }

    public static int sacaNumPrimos(int x[]) {
        int cont = 0;
        for (int i = 0; i < x.length; i++) {
            if (Paquete1a14.esPrimo(x[i]))
                cont++;
        }
        return cont;
    }
}
