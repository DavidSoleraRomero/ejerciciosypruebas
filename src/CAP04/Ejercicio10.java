package CAP04;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Introduce tu mes de nacimiento en nº");
        int dia;
        int mes = Integer.parseInt(System.console().readLine());
        switch (mes) {
            case 1:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 19)) {
                    System.out.println("Eres Capricornio");
                } else {
                    System.out.println("Eres Acuario");
                }
                break;
            case 2:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 29) {
                    break;
                }
                if ((dia >= 1) && (dia <= 18)) {
                    System.out.println("Eres Acuario");
                } else {
                    System.out.println("Eres Piscis");
                }
                break;
            case 3:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 20)) {
                    System.out.println("Eres Piscis");
                } else {
                    System.out.println("Eres Aries");
                }
                break;
            case 4:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 19)) {
                    System.out.println("Eres Aries");
                } else {
                    System.out.println("Eres Tauro");
                }
                break;
            case 5:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 20)) {
                    System.out.println("Eres Tauro");
                } else {
                    System.out.println("Eres Gémini");
                }
                break;
            case 6:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 20)) {
                    System.out.println("Eres Gémini");
                } else {
                    System.out.println("Eres Cáncer");
                }
                break;
            case 7:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 22)) {
                    System.out.println("Eres Cáncer");
                } else {
                    System.out.println("Eres Leo");
                }
                break;
            case 8:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 22)) {
                    System.out.println("Eres Leo");
                } else {
                    System.out.println("Eres Virgo");
                }
                break;
            case 9:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 22)) {
                    System.out.println("Eres Virgo");
                } else {
                    System.out.println("Eres Libra");
                }
                break;
            case 10:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 22)) {
                    System.out.println("Eres Libra");
                } else {
                    System.out.println("Eres Escorpio");
                }
                break;
            case 11:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 21)) {
                    System.out.println("Eres Escorpio");
                } else {
                    System.out.println("Eres Sagitario");
                }
                break;
            case 12:
                mesNacimiento();
                dia = Integer.parseInt(System.console().readLine());
                if (dia > 31) {
                    break;
                }
                if ((dia >= 1) && (dia <= 21)) {
                    System.out.println("Eres Sagitario");
                } else {
                    System.out.println("Eres Capricornio");
                }
                break;
            default:
                System.out.println("Mes introducido incorrecto");
                break;
        }
    }

    public static void mesNacimiento() {
        System.out.println("Introduce tu día de nacimiento en nº");
    }
}