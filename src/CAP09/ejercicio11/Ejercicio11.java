package CAP09.ejercicio11;

/* La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
las tarjetas regalo. Como primer paso para implementar la aplicación, es
necesario crear la clase principal. Implementa la clase TarjetaRegalov2. Cuando
se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática
un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta,
se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar
creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
originales se quedarían con 0 € de saldo. */
public class Ejercicio11 {
    public static void main(String[] args) {
        try {
            TarjetaRegalov2 t1 = new TarjetaRegalov2(100);
            TarjetaRegalov2 t2 = new TarjetaRegalov2(120);

            System.out.println(t1);
            System.out.println(t2);
            t1.gasta(45.90);
            t2.gasta(5);
            t2.gasta(200);
            t1.gasta(3.55);
            System.out.println(t1);
            System.out.println(t2);
            TarjetaRegalov2 t3 = t1.fusionaCon(t2);
            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
