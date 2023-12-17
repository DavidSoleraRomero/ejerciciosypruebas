package CAP08;

/* Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
                                 // que contienen el 7 (por ej. 7, 27, 782)
                                 // que se encuentren en otro array que se
                                 // pasa como parámetro. El tamaño del array
                                 // que se devuelve será menor o igual al
                                 // que se pasa como parámetro.

Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números que contienen
7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
el array devuelto también estará repetido 3 veces. Si no existe ningún número
que contiene 7 en el array x, se devuelve un array con el número -1 como único
elemento. */
public class Ejercicio40 {
    public static void main(String[] args) {
        int[] prueba = new int[40];
        for (int i = 0; i < prueba.length; i++) {
            prueba[i] = (int) (Math.random() * 10001);
            System.out.printf("%d ", prueba[i]);
        }
        System.out.println("\n");
        int[] pruebaCon7 = filtraCon7(prueba);
        for (int i = 0; i < pruebaCon7.length; i++) {
            System.out.printf("%d ", pruebaCon7[i]);
        }
    }

    public static int[] filtraCon7(int[] x) {
        int[] filtrado = new int[sacaLongitudArray7(x)];
        if (filtrado.length == 0) {
            int[] aux = { -1 };
            return aux;
        }
        int cont = 0;
        for (int i = 0; i < x.length; i++) {
            if (contiene7(x[i]))
                filtrado[cont++] = x[i];
        }
        return filtrado;
    }

    public static int sacaLongitudArray7(int[] x) {
        int cont = 0;
        for (int i = 0; i < x.length; i++) {
            if (contiene7(x[i]))
                cont++;
        }
        return cont;
    }

    public static boolean contiene7(int num) {
        int largo = Paquete1a14.digitos(num);
        boolean contiene = false;
        for (int i = 1; i <= largo & !contiene; i++) {
            if (num % 10 == 7)
                contiene = true;
            num /= 10;
        }
        return contiene;
    }
}
