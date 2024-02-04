package CAP10.ecentro;

import java.util.HashMap;

import CAP10.ecentro.utils.MyUuid;

public class Model implements Crud<Identifier> {

    private HashMap<String, Identifier> grupos = new HashMap<>();

    @Override
    public Identifier add(Identifier elem) {
        String UUID = MyUuid.newUUID();
        while (grupos.containsKey(UUID)) {
            UUID = MyUuid.newUUID();
        }
        Identifier newGrupo = elem.clone();
        newGrupo.setId(UUID);
        grupos.put(UUID, newGrupo);
        return newGrupo;
    }

    @Override
    public Identifier[] query(String filter) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Identifier get(String id) {
        return grupos.get(id);
    }

    @Override
    public Identifier modify(String id, Identifier data) {
        Identifier aux = data.clone();
        aux.setId(id);
        return grupos.put(id, aux);
    }

    @Override
    public Identifier delete(String id) {
        return grupos.remove(id);
    }

}
