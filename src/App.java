/* Programa probando múltiples cosas */

import generics.MyArrayList;
import generics.Perro;

public class App {
    public static void main(String[] args) {
        /*
         * MyArrayList<Integer> array = new MyArrayList<>(10);
         * for (int i = 0; i < 1000; i++) {
         * array.add(i);
         * }
         * System.out.println(array);
         * for (int i = 0; i < 1000; i++) {
         * array.remove(0);
         * }
         * System.out.println(array);
         * for (int i = 0; i < 1000; i++) {
         * array.add(i);
         * }
         * System.out.println(array);
         * array.clear();
         * System.out.println(array);
         * array.add(100);
         * array.add(120);
         * array.add(140);
         * System.out.println(array);
         * array.set(1, 130);
         * System.out.println(array);
         */
        MyArrayList<Perro> arrayPerros = new MyArrayList<>(100);
        for (int i = 0; i < 1000; i++) {
            String nombre = "";
            for (int j = 0; j < 10; j++) {
                nombre += "" + (char) (65 + (int) (Math.random() * 20));
            }
            arrayPerros.add(new Perro(nombre));
        }
        System.out.println(arrayPerros);
    }
}
