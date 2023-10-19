package CAP05;

/* La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
no es un número impar mayor o igual que 3, el programa debe mostrar un
mensaje de error. */
public class Ejercicio66 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la figura: ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 3 & altura % 2 != 0) {
                int pinta1 = 1;
                int pinta2 = 6;
                for (int i = 1; i <= altura; i++) {
                    for (int espaciosAste = 1; espaciosAste <= altura + 5; espaciosAste++) {
                        if (espaciosAste == pinta1 | espaciosAste == pinta2)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                    if (i <= altura / 2) {
                        pinta1++;
                        pinta2++;
                    } else {
                        pinta1--;
                        pinta2--;
                    }
                }
            } else
                System.out.print("Introduce una altura impar mayor o igual a 3");
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}