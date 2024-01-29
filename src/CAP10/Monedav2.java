package CAP10;

public class Monedav2 {

    String face;
    String type;
    int amount;

    public Monedav2() {
        this.face = ((int) (Math.random() * 2) == 1) ? "cara" : "cruz";
        this.type = ((int) (Math.random() * 2) == 1) ? "euro" : "céntimo";
        this.amount = randomAmount();
    }

    private int randomAmount() {
        if (this.type.equals("euro")) {
            return (int) (Math.random() * 2 + 1);
        } else {
            int option = (int) (Math.random() * 5 + 1);
            switch (option) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 5;
                case 4:
                    return 10;
                case 5:
                    return 20;
                default:
                    return 50;
            }
        }
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString() {
        return String.format("%-2d %-8s | %s", this.amount, ((this.amount != 1) ? this.type + "s" : this.type),
                this.face);
    }

}
