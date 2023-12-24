package CAP09.ejercicio4;

/* Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
métodos pueden ser invierte, simplifica, multiplica, divide, etc. */
public class Ejercicio4 {
    public static void main(String[] args) {
        Fraccion.setNumerador(12);
        Fraccion.setDenominador(16);
        Fraccion.simplifica();
        System.out.println(Fraccion.getNumerador() + " " + Fraccion.getDenominador());

    }
}
