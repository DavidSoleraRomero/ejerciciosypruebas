package CAP10.repasoarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class AppEquals {
    public static void main(String[] args) {
        ArrayList<OrdenarEquals> oeS = new ArrayList<>();
        oeS.add(new OrdenarEquals("David", "Solera", 18));
        oeS.add(new OrdenarEquals("David", "Solera", 18));
        oeS.add(new OrdenarEquals("María", "Zambrano", 22));
        oeS.add(new OrdenarEquals("María", "López", 23));
        oeS.add(new OrdenarEquals("Zaira", "López", 31));
        oeS.add(new OrdenarEquals("Eloy", "Solera", 21));
        oeS.add(new OrdenarEquals("David", "Zyra", 20));
        oeS.add(new OrdenarEquals("David", "Romero", 19));
        System.out.println("Pre-ordenación:");
        for (OrdenarEquals elem : oeS) {
            System.out.println(elem);
        }
        Collections.sort(oeS);
        System.out.println("\nOrdenado: ");
        for (OrdenarEquals elem : oeS) {
            System.out.println(elem);
        }
        System.out.println(oeS.get(0).equals(oeS.get(1)));
        System.out.println(oeS.get(0).equals(oeS.get(2)));
        System.out.println(oeS.get(1).equals(oeS.get(2)));
    }
}
