package CAP08;

/* Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)

Esta función convierte los dígitos del número n en las correspondientes pala-
bras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:

cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien. Desde
la función no se debe mostrar nada por pantalla, solo se debe usar print desde
el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al
final. */
public class Ejercicio39 {
    public static void main(String[] args) {
        int num = 470213;
        int largo = Paquete1a14.digitos(num);
        num = Paquete1a14.voltea(num);
        for (int i = 1; i <= largo; i++) {
            int cifra = num % 10;
            num /= 10;
            System.out.printf("%s ", (i != largo) ? convierteEnPalabras(cifra) + "," : convierteEnPalabras(cifra));
        }
    }

    public static String convierteEnPalabras(int n) {
        switch (n) {
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            default:
                return "cero";
        }
    }
}
