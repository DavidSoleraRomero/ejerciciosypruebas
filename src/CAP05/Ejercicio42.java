package CAP05;

/* Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no. */
public class Ejercicio42 {
    public static void main(String[] args) {
        System.out.println("|     Leyenda     |");
        System.out.println("|   P --> Primo   |");
        System.out.println("| NP --> No Primo |");
        System.out.print("Introduce un número positivo para ver los 5 siguientes y si son primos: ");
        try {
            int num = Integer.parseInt(System.console().readLine());
            if (num >= 0) {
                System.out.print("Los 5 siguientes números son: ");
                int limite = num + 5;
                for (int i = num + 1; i <= limite; i++) {
                    boolean primo = true;
                    int acum = 2;
                    while (primo & acum <= i / 2) {
                        if (i % acum == 0)
                            primo = false;
                        else
                            acum++;
                    }
                    if (primo == true)
                        System.out.print(i + "-P ");
                    else
                        System.out.print(i + "-NP ");
                }
            } else
                System.out.println("Introduzca un número positivo.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
