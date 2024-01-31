package CAP10.ecentro;

public interface Crud<T> /* T genérico --> Cualquier objeto */ {

    public T add(T elem);

    public T[] query(String filter);

    public T get(String id);

    public T modify(String id, T data);

    public T delete(String id);

}
