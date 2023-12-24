package CAP09.ejercicio5;

/* Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
siguiente código del programa principal debe dar la salida que se muestra: */
public class Ejercicio5 {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("mediana", "funghi");
        Pizza p2 = new Pizza("cuatro quesos");
        p2.servir();
        Pizza p3 = new Pizza("familiar", "margarita");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.servir();
        System.out.println("\nPedidas: " + Pizza.getNumTotalPizzasPedidas());
        System.out.println("Servidas: " + Pizza.getNumTotalPizzasServidas());
        p1.servir();
        p3.servir();
        System.out.println("\nPedidas: " + Pizza.getNumTotalPizzasPedidas());
        System.out.println("Servidas: " + Pizza.getNumTotalPizzasServidas());
    }
}
