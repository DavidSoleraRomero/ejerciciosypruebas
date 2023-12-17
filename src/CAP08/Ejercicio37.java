package CAP08;

/* Crea una función con la siguiente cabecera:
public String convierteEnMorse(int n)
Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.
1 . _ _ _ _ 6 _ . . . .
2 . . _ _ _ 7 _ _ . . .
3 . . . _ _ 8 _ _ _ . .
4 . . . . _ 9 _ _ _ _ .
5 . . . . . 0 _ _ _ _ _ */
public class Ejercicio37 {
    public static void main(String[] args) {
        String miNum = "";
        int num = 213;
        int largo = Paquete1a14.digitos(num);
        num = Paquete1a14.voltea(num);
        for (int i = 1; i <= largo; i++) {
            int cifra = num % 10;
            num /= 10;
            miNum = miNum + convierteEnMorse(cifra) + " ";
        }
        System.out.println(miNum);
    }

    public static String convierteEnMorse(int n) {
        switch (n) {
            case 1:
                return ". _ _ _ _";
            case 2:
                return ". . _ _ _";
            case 3:
                return ". . . _ _";
            case 4:
                return ". . . . _ ";
            case 5:
                return ". . . . .";
            case 6:
                return "_ . . . .";
            case 7:
                return "_ _ . . .";
            case 8:
                return "_ _ _ . .";
            case 9:
                return "_ _ _ _ .";
            default:
                return "_ _ _ _ _";
        }

    }
}
