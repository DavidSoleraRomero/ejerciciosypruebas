package CAP08;

/* Escribe un programa que genere los n primeros términos de la sucesión look
and say. El primer término es 1. A continuación se va leyendo - un uno - por
tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc.
Se recomienda usar arrays para almacenar los dígitos porque los tipos int y
long son muy limitados en cuanto al número de dígitos. También puede resultar
de ayuda utilizar las funciones convierteArrayEnString y concatena definidas en los
ejercicios anteriores. */
public class Ejercicio49 {
    public static void main(String[] args) {
        System.out.print("Ingrese el número de términos que desea generar: ");
        int n = Integer.parseInt(System.console().readLine());
        generarSucesionLookAndSay(n);
    }

    private static void generarSucesionLookAndSay(int n) {
        String terminoActual = "1";
        System.out.println("Sucesión 'Look and Say':");
        System.out.println("1");
        for (int i = 2; i <= n; i++) {
            terminoActual = obtenerSiguienteTermino(terminoActual);
            System.out.println(terminoActual);
        }
    }

    private static String obtenerSiguienteTermino(String terminoActual) {
        StringBuilder siguienteTermino = new StringBuilder();
        char digito = terminoActual.charAt(0);
        int conteo = 1;
        for (int i = 1; i < terminoActual.length(); i++) {
            if (terminoActual.charAt(i) == digito) {
                conteo++;
            } else {
                siguienteTermino.append(conteo).append(digito);
                digito = terminoActual.charAt(i);
                conteo = 1;
            }
        }
        siguienteTermino.append(conteo).append(digito);
        return siguienteTermino.toString();
    }
}
