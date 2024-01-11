package CAP09.ejercicio5;

/* Crea la clase Pizza2 con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
siguiente código del programa principal debe dar la salida que se muestra: */
public class Ejercicio5 {
    public static void main(String[] args) {
        Pizza2.inicializaPizzas();
        Pizza2.inicializaTamanios();
        Pizza2 p1 = new Pizza2("mediana", "funghi");
        Pizza2 p2 = new Pizza2("cuatro quesos");
        p2.servir();
        Pizza2 p3 = new Pizza2("familiar", "margarita");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.servir();
        System.out.println("\nPedidas: " + Pizza2.getNumTotalPizzasPedidas());
        System.out.println("Servidas: " + Pizza2.getNumTotalPizzasServidas());
        p1.servir();
        p3.servir();
        System.out.println("\nPedidas: " + Pizza2.getNumTotalPizzasPedidas());
        System.out.println("Servidas: " + Pizza2.getNumTotalPizzasServidas());
    }
}
