package CAP03;

/* Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%. */
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Introduce la nota del primer examen:");
        float primer = Float.parseFloat(System.console().readLine());
        System.out.println("Introduce la nota media que quieres tener:");
        float media = Float.parseFloat(System.console().readLine());
        double segundo = (media - (primer * 0.4)) / 0.6;
        /*
         * Con este cálculo, provocamos que el primer examen valga el 40% (primer * 0.4)
         * Restamos a la media deseada el 40% (media - (primer * 0.4)) para sacar la
         * diferencia
         * Por último, de este número sacamos el 60% restante del segundo examen
         * dividiendo entre 0.6
         */
        System.out.printf("Para sacar un " + media + " tienes que sacar un %.2f", segundo);
    }
}
