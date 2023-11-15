package CAP06;

/* Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz. */
public class Ejercicio21v3 {
    public static void main(String[] args) {
        String m1 = moneda((int) (Math.random() * 8 + 1));
        String m2 = moneda((int) (Math.random() * 8 + 1));
        String m3 = moneda((int) (Math.random() * 8 + 1));
        String m4 = moneda((int) (Math.random() * 8 + 1));
        String m5 = moneda((int) (Math.random() * 8 + 1));
        while (m1.equals(m2) | m1.equals(m3) | m1.equals(m4) | m1.equals(m5) | m2.equals(m3) | m2.equals(m4)
                | m2.equals(m5) | m3.equals(m4) | m3.equals(m5) | m4.equals(m5)) {
            m2 = moneda((int) (Math.random() * 8 + 1));
            m3 = moneda((int) (Math.random() * 8 + 1));
            m4 = moneda((int) (Math.random() * 8 + 1));
            m5 = moneda((int) (Math.random() * 8 + 1));
        }
        String caraCruz = "";
        for (int i = 1; i <= 5; i++) {
            int caraC = (int) (Math.random() * 2 + 1);
            if (caraC == 1)
                caraCruz = "cara";
            else
                caraCruz = "cruz";
            System.out.print((i == 1) ? m1 : (i == 2) ? m2 : (i == 3) ? m3 : (i == 4) ? m4 : m5);
            System.out.println(" - " + caraCruz);
        }
    }

    public static String moneda(int num) {
        switch (num) {
            case 1:
                return "1 céntimo";
            case 2:
                return "2 céntimos";
            case 3:
                return "5 céntimos";
            case 4:
                return "10 céntimos";
            case 5:
                return "20 céntimos";
            case 6:
                return "50 céntimos";
            case 7:
                return "1 euro";
            default:
                return "2 euros";
        }
    }

}
