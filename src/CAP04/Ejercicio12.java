package CAP04;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al cuestionario, no uses tildes");
        System.out.println("1. ¿Qué da Juan Antonio?");
        String respuesta = System.console().readLine();
        int puntuacion = 0;
        if (respuesta.toLowerCase().equals("programacion")) {
            puntuacion += 1;
        }
        System.out.println("¿Qué da Pilar?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("lenguaje de marcas")) {
            puntuacion += 1;
        }
        System.out.println("¿Qué da Fernando?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("si")) {
            puntuacion++;
        }
        System.out.println("¿Qué da Eva?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("bases de datos")) {
            puntuacion++;
        }
        System.out.println("¿Qué damos en programación?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("java")) {
            puntuacion++;
        }
        System.out.println("¿Qué IDE usamos?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("vs code")) {
            puntuacion++;
        }
        System.out.println("¿Por qué tema vamos en S.I.?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("tema 1")) {
            puntuacion++;
        }
        System.out.println("¿Qué da José Santos?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("ed")) {
            puntuacion++;
        }
        System.out.println("¿Qué hay en GitHub?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("repositorios")) {
            puntuacion++;
        }
        System.out.println("¿Qué usamos en clase?");
        respuesta = System.console().readLine();
        if (respuesta.toLowerCase().equals("portatiles")) {
            puntuacion++;
        }
        System.out.printf("Tu puntación ha sido de %d puntos.", puntuacion);
    }
}
