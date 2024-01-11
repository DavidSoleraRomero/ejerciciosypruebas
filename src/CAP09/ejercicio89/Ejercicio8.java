package CAP09.ejercicio89;

/* Implementa la clase Terminalv2. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla. */
public class Ejercicio8 {
    public static void main(String[] args) {
        Terminalv2 t1 = new Terminalv2("678 11 22 33");
        Terminalv2 t2 = new Terminalv2("644 74 44 69");
        Terminalv2 t3 = new Terminalv2("622 32 89 09");
        Terminalv2 t4 = new Terminalv2("664 73 98 18");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
