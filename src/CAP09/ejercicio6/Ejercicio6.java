package CAP09.ejercicio6;

/* Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
donde los parámetros que se le pasan al constructor son las horas, los minutos
y los segundos respectivamente. Crea el método toString para ver los intervalos
de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el
resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar
que la clase funciona bien. */
public class Ejercicio6 {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(10, 35, 5);
        Tiempo t2 = new Tiempo(10, 25, 1);
        Tiempo.suma(t1, t2);
        System.out.println();
        Tiempo.resta(t1, t2);
        System.out.println();
        System.out.print(t1 + " | " + t2);
    }
}
