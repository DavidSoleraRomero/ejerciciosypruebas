package CAP10.ecentro;

public class Usuario implements Comparable<Usuario>, Identifier {

    private String id;
    private String name;
    private String lastnames;
    private String email;
    private String password;

    public Usuario(String id, String name, String lastnames, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastnames = lastnames;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Identifier clone() {
        return (Identifier) new Usuario(id, name, lastnames, email, password);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || this.id.equals(((Usuario) obj).id) || this.email.equals(((Usuario) obj).email);
    }

    @Override
    public int compareTo(Usuario o) {
        if (this.lastnames.equals(o.lastnames))
            return this.name.compareTo(o.name);
        return this.lastnames.compareTo(o.lastnames);
    }

    @Override
    public String toString() {
        return String.format("%s: %s, %s (%s)", this.id, this.lastnames, this.name, this.email);
    }

}
