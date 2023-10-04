package CAP02;

/* Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible? */
public class Ejercicio7 {
    public static void main(String[] args) {
        char letraNo = 'D';
        String nombre = "Mi nombre es David, que empieza por ";
        char letraAp = 'S';
        String apellido = " y mi 1er apellido es Solera, que empieza por ";
        System.out.println(nombre + letraNo + apellido + letraAp);
    } // Es posible concatenar carácteres con cadenas de texto
}
