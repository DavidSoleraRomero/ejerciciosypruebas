package paqueteprueba;

public class clase2 {
    public static void main(String[] args) {
        clase1 mivariable = new clase1();
        mivariable.b = 12;
        mivariable.a = 30;
        System.out.println(mivariable.a + mivariable.b);
        clase1 mivariable2 = new clase1();
        mivariable2.a = 23;
        mivariable2.b = 23;
        System.out.println(mivariable2.a + mivariable2.b);
        System.out.println("---");
        System.out.println(mivariable.suma());
        System.out.println(mivariable2.suma());
    }
}
