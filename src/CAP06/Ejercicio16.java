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
public class Ejercicio16 {
    public static void main(String[] args) {
        String figura = "";
        String figura1 = "";
        String figura2 = "";
        String figura3 = "";
        System.out.println("Simulando la máquina tragaperras...");
        for (int i = 1; i <= 3; i++) {
            int figuraN = (int) (Math.random() * 5 + 1);
            switch (figuraN) {
                case 1:
                    figura = "corazón";
                    break;
                case 2:
                    figura = "diamante";
                    break;
                case 3:
                    figura = "herradura";
                    break;
                case 4:
                    figura = "limón";
                    break;
                case 5:
                    figura = "campana";
                    break;
            }
            System.out.print("| " + figura + " ");
            if (i == 1)
                figura1 = figura;
            else if (i == 2)
                figura2 = figura;
            else
                figura3 = figura;
        }
        System.out.print("|");
        if (figura1.equals(figura2) & figura2.equals(figura3))
            System.out.println("\nEnhorabuena, has ganado 10 monedas.");
        else if (figura1.equals(figura2) | figura1.equals(figura3) | figura2.equals(figura3))
            System.out.println("\nBien, has recuperado tu moneda.");
        else
            System.out.println("\nLo siento, ha perdido.");
    }
}
