package CAP10.ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColeccionDeDiscos implements ColeccionDeDiscosInterface {

    private static int cont;

    private HashMap<String, HashMap<String, Disco>> discos = new HashMap<>();
    private ArrayList<Autor> autores = new ArrayList<>();

    public static int getCont() {
        return cont++;
    }

    @Override
    public void aniadeDiscoAlAutor(String autorId, Disco d) {
        if (!discoExiste(autorId, d) & autorExiste(autorId))
            discos.get(autorId).put(d.getCodigo(), d);
    }

    @Override
    public void eliminaDiscoDelAutor(String autorId, String discoId) {
        if (discoExiste(autorId, discoId) & autorExiste(autorId))
            discos.get(autorId).remove(discoId);
    }

    @Override
    public void aniadeAutor(Autor a) {
        if (!discos.containsKey(a.getId())) {
            discos.put(a.getId(), new HashMap<>());
            autores.add(a);
        } else {
            System.out.println("Ese autor ya existe");
        }
    }

    @Override
    public void eliminaAutor(Autor a) {
        if (discos.containsKey(a.getId()))
            discos.remove(a.getId());
        else
            System.out.println("Ese autor no está en la lista");
    }

    @Override
    public void eliminaAutor(String id) {
        if (discos.containsKey(id))
            discos.remove(id);
        else
            System.out.println("Ese autor no está en la lista");
    }

    @Override
    public boolean autorExiste(Autor a) {
        if (discos.containsKey(a.getId()))
            return true;
        return false;
    }

    @Override
    public boolean autorExiste(String id) {
        if (discos.containsKey(id))
            return true;
        return false;
    }

    @Override
    public boolean discoExiste(String autorId, Disco d) {
        if (discos.containsKey(autorId)) {
            if (discos.get(autorId).containsKey(d.getCodigo())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean discoExiste(String autorId, String idDisco) {
        if (discos.containsKey(autorId)) {
            if (discos.get(autorId).containsKey(idDisco)) {
                return true;
            }
        }
        return false;
    }

    public String listaAutoresYDiscos() {
        String ret = "";
        for (Map.Entry<String, HashMap<String, Disco>> autoresDiscos : discos.entrySet()) {
            HashMap<String, Disco> disco = autoresDiscos.getValue();
            for (Map.Entry<String, Disco> discos : disco.entrySet())
                ret += discos.getValue().toString();
        }
        return ret;
    }

    @Override
    public void modificaAutor(Autor a) {
        // PENDIENTE
    }

    @Override
    public void modificaAutor(String id) {
        // PENDIENTE
    }

    public static int menu() {
        System.out.println();
        System.out.println("=====================");
        System.out.println("|COLECCIÓN DE DISCOS|");
        System.out.println("=====================");
        System.out.println("1. Listado de todos los discos");
        System.out.println("2. Nuevo disco de un autor");
        System.out.println("3. Modificar discos de un autor");
        System.out.println("4. Borrar disco");
        System.out.println("5. Añadir autor");
        System.out.println("6. Borrar autor");
        System.out.println("7. Modificar autor");
        System.out.println("8. Salir");
        System.out.print("Opción: ");
        return Integer.parseInt(System.console().readLine());
    }

}
