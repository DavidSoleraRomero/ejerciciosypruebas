package CAP06;

/* Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria. Por cada metro de sendero - representado por una línea - puede que haya un
obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
habrá más de un obstáculo por metro de sendero, habrá uno o ninguno. */
public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.print("Introduce la longitud del sendero: ");
        try {
            int longitud = Integer.parseInt(System.console().readLine());
            int ancho = 6;
            for (int i = 1; i <= longitud; i++) {
                for (int espacios = 1; espacios <= ancho; espacios++) {
                    System.out.print(" ");
                }
                int hayObstaculo = (int) (Math.random() * 2 + 1);
                String pintar;
                int posicion = (int) (Math.random() * 4 + 2);
                if (hayObstaculo == 1) {
                    pintar = " ";
                } else {
                    int obstaculo = (int) (Math.random() * 2 + 1);
                    if (obstaculo == 1)
                        pintar = "O";
                    else
                        pintar = "*";
                }
                for (int sendero = 1; sendero <= 6; sendero++) {
                    if (sendero == 1 | sendero == 6)
                        System.out.print("|");
                    else if (sendero == posicion)
                        System.out.print(pintar);
                    else
                        System.out.print(" ");
                }
                ancho = (int) (Math.random() * 3 + ancho - 1);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
