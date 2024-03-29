package CAP09.ejercicio89;

/* Implementa la clase Movilv2 como subclase de Terminal (la clase del ejercicio
anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
llamada. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
decimales, puedes utilizar DecimalFormat. */
public class Ejercicio9 {
    public static void main(String[] args) {
        Movilv2 m1 = new Movilv2("678 11 22 33", "rata");
        Movilv2 m2 = new Movilv2("644 74 44 69", "mono");
        Movilv2 m3 = new Movilv2("622 32 89 09", "bisonte");
        System.out.println(m1);
        System.out.println(m2);
        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
