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
        int altura = Integer.parseInt(System.console().readLine());
    }
}
