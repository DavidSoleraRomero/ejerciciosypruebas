package CAP05;

/* Realiza un programa que pinte una pirámide maya. Por los lados, se trata
de una pirámide normal y corriente. Por el centro se van pintando líneas de
asteriscos de forma alterna (empezando por la superior): la primera se pinta,
la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
usuario introducirá un número entero mayor o igual a 3; no es necesario
comprobar los datos de entrada. */
public class Ejercicio69 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la pirámide maya (3 o más): ");
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 3) {
                for (int i = 1; i <= altura; i++) {
                    for (int espacios = 1; espacios <= altura - i; espacios++) {
                        System.out.print(" ");
                    }
                    for (int astericos = 1; astericos <= 4 + i * 2; astericos++) {
                        if (i % 2 == 0) {
                            if ((astericos >= 1 & astericos <= i) | (astericos > i + 4))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        } else
                            System.out.print("*");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduce un nº superior o igual a 3.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
