package CAP10;

public class Cartav2 implements Comparable<Cartav2> {

    private String stick;
    private String value;

    public Cartav2() {
        this.stick = stick();
        this.value = value();
    }

    private String stick() {
        int option = (int) (Math.random() * 4 + 1);
        switch (option) {
            case 1:
                return "espadas";
            case 2:
                return "bastos";
            case 3:
                return "oros";
            default:
                return "copas";
        }
    }

    private String value() {
        int option = (int) (Math.random() * 10 + 1);
        switch (option) {
            case 1, 2, 3, 4, 5, 6, 7, 8:
                return String.valueOf(option);
            case 9:
                return "Caballo";
            default:
                return "Rey";
        }
    }

    public String getStick() {
        return stick;
    }

    public void setStick(String stick) {
        this.stick = stick;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this ||
                this.stick.equals(((Cartav2) obj).stick) && this.value.equals(((Cartav2) obj).value);
    }

    @Override
    public int compareTo(Cartav2 o) {
        if (this.stick.equals(o.stick)) {
            return this.value.compareTo(o.value);
        } else {
            return this.stick.compareTo(o.stick);
        }
    }

    @Override
    public String toString() {
        return ((this.value.equals("1")) ? "As" : ((this.value.equals("8") ? "Sota" : value))) + " de " + this.stick;
    }

}
