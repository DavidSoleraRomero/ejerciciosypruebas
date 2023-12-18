package CAP08;

/* Realiza una función que tome como parámetro un array de cadenas de carac-
teres y que devuelva otro array con los mismos valores habiendo eliminado
las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto
“hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los valores
{“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”,
“sol”, “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”,
“coche”, “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto
el código de la función como el código de prueba que la usa. La cabecera de la
función es la siguiente:

public static String[] sinRepetir(String[] s) */
public class Ejercicio55 {
    public static void main(String[] args) {
        String[] palabras = { "casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "casa", "CASA" };
        String[] nuevo = sinRepetir(palabras);
        for (String i : nuevo) {
            System.out.printf("%s ", i);
        }
    }

    public static String[] sinRepetir(String[] s) {
        int cont = sacaLongitudAux(s);
        int index = 0;
        String[] aux = new String[s.length - cont];
        for (int i = 0; i < s.length; i++) {
            boolean repite = false;
            for (int j = 0; j < i; j++) {
                if (s[i].equals(s[j]))
                    repite = true;
            }
            if (!repite)
                aux[index++] = s[i];
        }
        return aux;
    }

    public static int sacaLongitudAux(String[] s) {
        int cont = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < i; j++) {
                if (s[i].equals(s[j]))
                    cont++;
            }
        }
        return cont;
    }
}
