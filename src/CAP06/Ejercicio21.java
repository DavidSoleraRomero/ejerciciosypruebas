package CAP06;

/* Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz. */
public class Ejercicio21 {
    public static void main(String[] args) {
        String moneda = "";
        String caraCruz = "";
        int moneda1 = 0;
        int moneda2 = 0;
        int moneda3 = 0;
        int moneda4 = 0;
        int moneda5 = 0;
        int contador = 1;
        boolean salir = false;
        while (!salir) {
            int monedaN = (int) (Math.random() * 8 + 1);
            switch (monedaN) {
                case 1:
                    moneda = "1 céntimo - ";
                    break;
                case 2:
                    moneda = "2 céntimos - ";
                    break;
                case 3:
                    moneda = "5 céntimos - ";
                    break;
                case 4:
                    moneda = "10 céntimos - ";
                    break;
                case 5:
                    moneda = "20 céntimos - ";
                    break;
                case 6:
                    moneda = "50 céntimos - ";
                    break;
                case 7:
                    moneda = "1 euro - ";
                    break;
                case 8:
                    moneda = "2 euros - ";
                    break;
            }
            int caraCruzN = (int) (Math.random() * 2 + 1);
            if (caraCruzN == 1)
                caraCruz = "cara";
            else
                caraCruz = "cruz";
            switch (contador) {
                case 1:
                    moneda1 = monedaN;
                    System.out.print(moneda + caraCruz + "\n");
                    contador++;
                    break;
                case 2:
                    moneda2 = monedaN;
                    if (moneda1 != moneda2) {
                        System.out.print(moneda + caraCruz + "\n");
                        contador++;
                    }
                    break;
                case 3:
                    moneda3 = monedaN;
                    if (moneda3 != moneda2 & moneda3 != moneda1) {
                        System.out.print(moneda + caraCruz + "\n");
                        contador++;
                    }
                    break;
                case 4:
                    moneda4 = monedaN;
                    if (moneda4 != moneda3 & moneda4 != moneda2 & moneda4 != moneda1) {
                        System.out.print(moneda + caraCruz + "\n");
                        contador++;
                    }
                    break;
                case 5:
                    moneda5 = monedaN;
                    if (moneda5 != moneda4 & moneda5 != moneda3 & moneda5 != moneda2 & moneda5 != moneda1) {
                        System.out.print(moneda + caraCruz + "\n");
                        contador++;
                        salir = true;
                    }
                    break;
            }
        }
    }
}
