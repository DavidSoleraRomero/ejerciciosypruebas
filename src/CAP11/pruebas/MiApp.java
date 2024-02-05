package CAP11.pruebas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MiApp {
    public static void main(String[] args) {
        try {
            // BufferedWriter bw = new BufferedWriter(new FileWriter("./miArchivo.txt"));
            // bw.write("Hello World!");
            // bw.write("\nBienvenido");
            // bw.close();
            // BufferedReader br = new BufferedReader(new FileReader("./miArchivo.txt"));
            // String linea;
            // do {
            // linea = br.readLine();
            // if (linea != null)
            // System.out.println(linea);
            // } while (linea != null);
            // br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter("./miArchivo.txt"));
            Double valor = Double.valueOf(10.65);
            Double valor2 = Double.valueOf(11.65);
            bw.write(String.valueOf(valor + "\n"));
            bw.write(String.valueOf(valor2 + "\n"));
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("./miArchivo.txt"));
            String linea = "";
            Double num = 0.0;
            Double suma = 0.0;
            do {
                if ((linea = br.readLine()) != null) {
                    num = Double.parseDouble(linea);
                    suma += num;
                }
            } while (linea != null);
            br.close();
            System.out.println(suma);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
