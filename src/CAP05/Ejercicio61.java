package CAP05;

// Programa que pinta la letra V según la altura. Su lógica es:
// Primer bucle for de dentro para meter espacios a partir de la segunda línea
// Segundo bucle for que calcula los espacios y los asteriscos juntos (el ancho)
// Se calcula de esta manera debido a que los espacios van de 2 en 2 y hay mínimo 6 asteriscos
// Habíamos puesto i*2+4 e i*2+1, pero sobraban dos espacios en la última línea de la V debido a esto
public class Ejercicio61 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la V: ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            int j = 0;
            if (altura >= 3) {
                for (int i = altura; i >= 1; i--) {
                    for (int espacios = 1; espacios <= j; espacios++) {
                        System.out.print(" ");
                    }
                    j++;
                    for (int asteriscos = 1; asteriscos <= i * 2 + 4; asteriscos++) {
                        if (asteriscos <= 3 | asteriscos > i * 2 + 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduce un número superior o igual a 3.");
        } catch (Exception e) {
            System.out.println("Introduce un número.");
        }
    }
}