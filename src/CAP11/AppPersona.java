package CAP11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import CAP11.persona.Persona;

public class AppPersona {
    public static void main(String[] args) {
        if (args.length != 1)
            System.out.println("Not enough arguments");
        else {
            String fileName = args[0];
            File file = new File(args[0]);
            ArrayList<Persona> personas = new ArrayList<>();
            if (!file.exists()) {
                personas.add(new Persona("1", "David", "Solera", 18));
                personas.add(new Persona("2", "Adrián", "Romero", 19));
            } else {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(fileName));
                    String linea = "";
                    while ((linea = br.readLine()) != null) {
                        personas.add(Persona.deSerialize(linea));
                    }
                    br.close();
                } catch (Exception e) {
                    System.out.println("Error reading the file");
                }
            }
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
                for (Persona persona : personas) {
                    bw.write(persona.serialize());
                }
                bw.close();
            } catch (Exception e) {
                System.out.println("Error writing the file");
            }
        }
    }
}
