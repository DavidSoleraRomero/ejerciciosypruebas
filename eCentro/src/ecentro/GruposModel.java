package ecentro;

import java.util.HashMap;

public class GruposModel extends Model implements GruposInterface {

    private HashMap<String, String> gruposExistentes = new HashMap<>();

    @Override
    public Identifier add(Identifier elem) {
        Grupo grupoAux = (Grupo) super.add(elem);
        gruposExistentes.put(grupoAux.getNombre(), grupoAux.getId());
        return grupoAux;
    }

    @Override
    public boolean groupExists(Grupo grupo) {
        return gruposExistentes.containsKey(grupo.getNombre());
    }

    public String devuelveId(String nombre) {
        return gruposExistentes.get(nombre);
    }

    @Override
    public boolean groupExists(String nomGrupo) {
        return gruposExistentes.containsKey(nomGrupo);
    }
}
