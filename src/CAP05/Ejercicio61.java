package CAP05;

/* Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error. */
public class Ejercicio61 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la V: ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            int altura2 = altura * 3;
            int j = 0;
            if (altura >= 3) {
                for (int i = 1; i <= altura; i++) {
                    for (int espacios = 1; espacios <= j; espacios++) {
                    }
                    for (int asteriscos = 1; asteriscos <= altura * 3; asteriscos++) {

                    }
                }
            } else
                System.out.println("Introduce un número superior o igual a 3.");
        } catch (Exception e) {
            System.out.println("Introduce un número.");
        }
    }
}
