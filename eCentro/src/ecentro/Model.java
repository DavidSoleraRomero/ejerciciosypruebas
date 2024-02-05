package ecentro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import utils.MyUuid;

public class Model implements CRUD<Identifier> {

    private HashMap<String, Identifier> elems = new HashMap<String, Identifier>();

    @Override
    public Identifier add(Identifier elem) {
        String id = MyUuid.newUUID();
        while (elems.containsKey(id))
            id = MyUuid.newUUID();
        Identifier newElem = elem.clone();
        newElem.setId(id);
        elems.put(id, newElem);
        return newElem;
    }

    @Override
    public Identifier[] query(String filter) {
        return null;
    }

    @Override
    public ArrayList<Identifier> clone() {
        ArrayList<Identifier> aux = new ArrayList<>();
        for (Map.Entry<String, Identifier> entrys : elems.entrySet()) {
            aux.add(entrys.getValue());
        }
        return aux;
    }

    public int size() {
        return elems.size();
    }

    @Override
    public Identifier get(String id) {
        return elems.get(id);
    }

    public Identifier update(String id, Identifier data) {
        Identifier newElem = data.clone();
        newElem.setId(id);
        return elems.put(id, newElem);
    }

    @Override
    public Identifier delete(String id) {
        return elems.remove(id);
    }

    @Override
    public String toString() {
        String ret = "";
        for (Map.Entry<String, Identifier> elem : elems.entrySet()) {
            ret += elem.getValue().toString() + "\n";
        }
        return ret;
    }

}
