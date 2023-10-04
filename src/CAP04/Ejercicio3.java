package CAP04;

/* Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana. */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = Integer.parseInt(System.console().readLine());
        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Asegúrese de introducir un número entre 1 y 7");
        }
    }
}
