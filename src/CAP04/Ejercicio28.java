package CAP04;

import java.util.Scanner;

/* Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error. */
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Juego de Piedra, Papel y Tijera");
        System.out.print("Turno del jugador 1 (piedra, papel o tijera): ");
        String turno1 = sc.nextLine();
        System.out.print("Turno del jugador 2 (piedra, papel o tijera): ");
        String turno2 = sc.nextLine();
        turno1 = turno1.toLowerCase();
        turno2 = turno2.toLowerCase();
        switch (turno1) {
            case "piedra":
                if (turno2.equals("piedra")) {
                    System.out.println("Ha resultado en empate");
                } else if (turno2.equals("papel")) {
                    System.out.println("Gana el jugador 2");
                } else {
                    System.out.println("Gana el jugador 1");
                }
                break;
            case "papel":
                if (turno2.equals("papel")) {
                    System.out.println("Ha resultado en empate");
                } else if (turno2.equals("tijera")) {
                    System.out.println("Gana el jugador 2");
                } else {
                    System.out.println("Gana el jugador 1");
                }
                break;
            case "tijera":
                if (turno2.equals("tijera")) {
                    System.out.println("Ha resultado en empate");
                } else if (turno2.equals("piedra")) {
                    System.out.println("Gana el jugador 2");
                } else {
                    System.out.println("Gana el jugador 1");
                }
                break;
        }
        sc.close();
    }
}
