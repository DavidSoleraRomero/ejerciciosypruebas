package CAP09.ejemploconstructor;

public class App {
    public static void main(String[] args) {
        try {
            EjemploConstructor ejemplo1 = new EjemploConstructor();
            System.out.println(ejemplo1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            EjemploConstructor ejemplo2 = new EjemploConstructor("David", 1000);
            System.out.println(ejemplo2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
