package CAP05;

/* Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido. */
public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long num = Long.parseLong(System.console().readLine());
        long num2 = num;
        long largo = 0;
        while (true) {
            num2 = num2 / 10;
            largo++;
            if ((num2 % 10 == 0) && ((num2 / 10) % 10 == 0) && ((num2 / 100) % 10 == 0)
                    && ((num2 / 1000) % 10 == 0) && ((num2 / 10000) % 10 == 0)) {
                break;
            }
        }
        long acum = 0;
        System.out.print("Introduce un dígito que puede estar (o no) dentro del nº anterior: ");
        int digito = Integer.parseInt(System.console().readLine());
        double contieneUno;
        String contieneMas = "", posicion = "";
        String restoS = "1";
        for (long i = 1; i <= largo; i++) {
            restoS = restoS + "0";
        }
        long resto = Long.parseLong(restoS); /* resto se utiliza para ir sacando las cifras, trabaja con comas */
        String comasS = "1";
        for (long i = 1; i <= largo - 1; i++) {
            comasS = comasS + "0";
        }
        long comas = Long.parseLong(comasS); // comas se encarga de eliminar las comas del número que resulta de resto
        long pos = 1;
        for (long i = 1; i <= largo; i++) {
            long cifras = num % resto;
            if ((i < largo)) { /* Se usa comas a partir del segundo bucle */
                cifras = cifras / comas;
                comas = comas / 10; /* Decrementamos comas para el siguiente bucle */
            }
            if (cifras == digito) { /* Comprueba con el dígito y */
                acum++; /* guarda la posición, las veces que ha repetido y más cosas */
                contieneUno = cifras;
                contieneMas = contieneMas + contieneUno;
                posicion = posicion + " " + pos;
            }
            resto = resto / 10; /* Decrementamos resto para el siguiente bucle */
            pos++;
        }
        if (acum == 1) { /* Comprobamos si es un nº repetido, varios o ninguno */
            System.out.println("Coincide un nº en la posición nº" + posicion);
        } else if (acum > 1) {
            System.out.println("Coincide más de un nº en las posiciones" + posicion);
        } else {
            System.out.println("No coincide ningún nº");
        }
    }
}