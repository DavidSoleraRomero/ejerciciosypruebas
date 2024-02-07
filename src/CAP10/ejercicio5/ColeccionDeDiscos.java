package CAP10.ejercicio5;

import java.util.HashMap;
import java.util.Map;

public class ColeccionDeDiscos implements ColeccionDeDiscosInterface {

    private static int cont;

    private HashMap<String, HashMap<String, Disco>> discos = new HashMap<>();
    private HashMap<String, Autor> autores = new HashMap<>();

    private int discosCreados;

    public int getDiscosCreados() {
        return discosCreados;
    }

    public static int getCont() {
        return cont++;
    }

    @Override
    public void aniadeDiscoAlAutor(String autorId, Disco d) {
        if ((!discoExiste(autorId, d)) & autorExiste(autorId)) {
            discos.get(autorId).put(d.getCodigo(), d);
            discosCreados++;
        }
    }

    @Override
    public void eliminaDiscoDelAutor(String autorId, String discoId) {
        if (discoExiste(autorId, discoId) & autorExiste(autorId)) {
            discos.get(autorId).remove(discoId);
            discosCreados--;
        }
    }

    @Override
    public void aniadeAutor(Autor a) {
        if (!discos.containsKey(a.getId())) {
            discos.put(a.getId(), new HashMap<>());
            autores.put(a.getId(), a);
        } else {
            System.out.println("\nEse autor ya existe");
        }
    }

    @Override
    public void eliminaAutor(Autor a) {
        if (discos.containsKey(a.getId())) {
            discos.remove(a.getId());
            autores.remove(a.getId());
        } else
            System.out.println("\nEse autor no está en la lista");
    }

    @Override
    public void eliminaAutor(String id) {
        if (discos.containsKey(id)) {
            discos.remove(id);
            autores.remove(id);
        } else
            System.out.println("\nEse autor no está en la lista");
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
    public boolean autorExisteAlguno() {
        return (discos.size() > 0) ? true : false;
    }

    @Override
    public boolean discoExisteAlguno() {
        return (discosCreados > 0) ? true : false;
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
        String ret = "| ARTISTAS |\n\n";
        for (Map.Entry<String, Autor> entrys : autores.entrySet()) {
            ret += entrys.getValue().toString();
        }
        for (Map.Entry<String, HashMap<String, Disco>> autoresDiscos : discos.entrySet()) {
            HashMap<String, Disco> disco = autoresDiscos.getValue();
            for (Map.Entry<String, Disco> discos : disco.entrySet())
                ret += discos.getValue().toString();
        }
        return (ret.equals("| ARTISTAS |\n\n") ? "\nAún no hay artistas" : ret);
    }

    @Override
    public void modificaAutor(Autor a) {
        if (autorExiste(a)) {
            Autor autor = autores.get(a.getId());
            System.out.printf("ID Actual: %s\n", autor.getId());
            String nuevoId;
            do {
                System.out.print("Nuevo ID: ");
                nuevoId = System.console().readLine();
            } while (discos.containsKey(nuevoId) & !a.getId().equals(nuevoId));
            System.out.printf("Nombre artístico actual: %s\n", autor.getNombreArtistico());
            System.out.print("Nombre artístico nuevo: ");
            String nuevoNArtistico = System.console().readLine();
            System.out.printf("Nombre real actual: %s\n", autor.getNombreReal());
            System.out.print("Nombre real nuevo: ");
            String nuevoNReal = System.console().readLine();
            System.out.printf("Edad actual: %s\n", autor.getEdad());
            System.out.print("Edad nueva: ");
            int nuevaEdad = Integer.parseInt(System.console().readLine());
            Autor aux = new Autor(nuevoId, nuevoNReal, nuevoNArtistico, nuevaEdad);
            autores.remove(a.getId());
            autores.put(aux.getId(), aux);
            if (!a.getId().equals(aux.getId())) {
                HashMap<String, Disco> discosAutorAux = discos.get(a.getId());
                discos.remove(a.getId());
                discos.put(aux.getId(), discosAutorAux);
            }
        } else {
            System.out.println("\nEse autor no existe aún");
        }
    }

    @Override
    public void modificaAutor(String id) {
        if (autorExiste(id)) {
            Autor autor = autores.get(id);
            System.out.printf("ID Actual: %s\n", autor.getId());
            String nuevoId;
            do {
                System.out.print("Nuevo ID: ");
                nuevoId = System.console().readLine();
            } while (discos.containsKey(nuevoId) & !id.equals(nuevoId));
            System.out.printf("Nombre artístico actual: %s\n", autor.getNombreArtistico());
            System.out.print("Nombre artístico nuevo: ");
            String nuevoNArtistico = System.console().readLine();
            System.out.printf("Nombre real actual: %s\n", autor.getNombreReal());
            System.out.print("Nombre real nuevo: ");
            String nuevoNReal = System.console().readLine();
            System.out.printf("Edad actual: %s\n", autor.getEdad());
            System.out.print("Edad nueva: ");
            int nuevaEdad = Integer.parseInt(System.console().readLine());
            Autor aux = new Autor(nuevoId, nuevoNReal, nuevoNArtistico, nuevaEdad);
            autores.remove(id);
            autores.put(aux.getId(), aux);
            if (!id.equals(aux.getId())) {
                HashMap<String, Disco> discosAutorAux = discos.get(id);
                discos.remove(id);
                discos.put(aux.getId(), discosAutorAux);
            }
        } else {
            System.out.println("\nEse autor no existe aún");
        }
    }

    @Override
    public void modificaDisco(String id) {
        boolean existe = false;
        Autor aux = new Autor(null, null, null, cont);
        for (Map.Entry<String, HashMap<String, Disco>> autoresDiscos : discos.entrySet()) {
            HashMap<String, Disco> disco = autoresDiscos.getValue();
            for (Map.Entry<String, Disco> discos : disco.entrySet())
                if (discos.getKey().equals(id)) {
                    existe = true;
                    aux = autores.get(autoresDiscos.getKey());
                    System.out.print(discos.getValue().toString());
                }
        }
        if (existe) {
            System.out.printf("Disco de: %s\n", aux.getNombreArtistico());
            String nuevoCod;
            do {
                System.out.print("Nuevo código: ");
                nuevoCod = System.console().readLine();
            } while (discoExiste(aux.getId(), nuevoCod) & !nuevoCod.equals(id));
            System.out.print("Nuevo título: ");
            String nuevoTit = System.console().readLine();
            String nuevoAut;
            do {
                System.out.print("Nuevo autor: ");
                nuevoAut = System.console().readLine();
            } while (!autorExiste(nuevoAut));
            System.out.print("Nueva duración: ");
            int nuevaDur = Integer.parseInt(System.console().readLine());
            System.out.print("Nuevo género: ");
            String nuevoGen = System.console().readLine();
            discos.get(aux.getId()).remove(id);
            discos.get(aux.getId()).put(nuevoCod, new Disco(nuevoCod, nuevoTit, nuevoAut, nuevaDur, nuevoGen));
        } else {
            System.out.println("\nEse disco no existe");
        }
    }

    @Override
    public void modificaDisco(Disco d) {
        boolean existe = false;
        Autor aux = new Autor(null, null, null, cont);
        for (Map.Entry<String, HashMap<String, Disco>> autoresDiscos : discos.entrySet()) {
            HashMap<String, Disco> disco = autoresDiscos.getValue();
            for (Map.Entry<String, Disco> discos : disco.entrySet())
                if (discos.getKey().equals(d.getCodigo())) {
                    existe = true;
                    aux = autores.get(autoresDiscos.getKey());
                }
        }
        if (existe) {
            System.out.printf("Disco de: %s\n", aux.getNombreArtistico());
            String nuevoCod;
            do {
                System.out.print("Nuevo código: ");
                nuevoCod = System.console().readLine();
            } while (discoExiste(aux.getId(), nuevoCod) & !nuevoCod.equals(d.getCodigo()));
            System.out.print("Nuevo título: ");
            String nuevoTit = System.console().readLine();
            String nuevoAut;
            do {
                System.out.print("Nuevo autor: ");
                nuevoAut = System.console().readLine();
            } while (!autorExiste(nuevoAut));
            System.out.print("Nueva duración: ");
            int nuevaDur = Integer.parseInt(System.console().readLine());
            System.out.print("Nuevo género: ");
            String nuevoGen = System.console().readLine();
            discos.get(aux.getId()).remove(d.getCodigo());
            discos.get(aux.getId()).put(nuevoCod, new Disco(nuevoCod, nuevoTit, nuevoAut, nuevaDur, nuevoGen));
        } else {
            System.out.println("\nEse disco no existe");
        }
    }

}
