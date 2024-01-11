package CAP09.ejercicio4;

/* Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
métodos pueden ser invierte, simplifica, multiplica, divide, etc. */
public class Ejercicio4 {
    public static void main(String[] args) {
        Fraccionv2.setNumerador(18);
        Fraccionv2.setDenominador(36);
        Fraccionv2.simplifica();
        Fraccionv2.multiplica();
        Fraccionv2.invierte();
        Fraccionv2.divide();
        Fraccionv2.invierte();
        System.out.println(Fraccionv2.getNumerador() + " " + Fraccionv2.getDenominador());

    }
}
