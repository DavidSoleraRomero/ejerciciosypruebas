package CAP06;

/* Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”. */
public class Ejercicio16v2 {
    public static void main(String[] args) {
        String figura1 = figura((int) (Math.random() * 5 + 1));
        String figura2 = figura((int) (Math.random() * 5 + 1));
        String figura3 = figura((int) (Math.random() * 5 + 1));
        System.out.println("------------------------------------");
        System.out.println("  Máquina tragaperras\n------------------------------------");
        System.out.printf("  %s %s %s\n", figura1, figura2, figura3);
        System.out.println("------------------------------------");
        if (figura1.equals(figura2) & figura2.equals(figura3))
            System.out.println("  Enhorabuena, ha ganado 10 monedas");
        else if (figura1.equals(figura2) | figura1.equals(figura3) | figura2.equals(figura3))
            System.out.println("  Bien, ha recuperado su moneda");
        else
            System.out.println("  Lo siento, ha perdido");
        System.out.println("------------------------------------");
    }

    public static String figura(int num) {
        switch (num) {
            case 1:
                return "corazón";
            case 2:
                return "diamante";
            case 3:
                return "herradura";
            case 4:
                return "campana";
            default:
                return "limón";
        }
    }
}
