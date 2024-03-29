package CAP09.ejercicio1;

public class Caballo {

    private final int patas = 4;
    private String color;
    private String raza;
    private String comidaFavorita;

    public Caballo() throws Exception {
        throw new Exception("Utilice el constructor de la clase");
    }

    public Caballo(String color, String raza, String comidaFavorita) {
        this.color = color;
        this.raza = raza;
        this.comidaFavorita = comidaFavorita;
    }

    public void correr() {
        System.out.println("El caballo comienza a correr");
    }

    public void parar() {
        System.out.println("El caballo ha dejado de correr");
    }

    public void defecar() {
        System.out.println("El caballo ha hecho popó");
    }

    public void revolcarse() {
        System.out.println("El caballo se ha revolcado por el suelo");
    }

    public void miccionar() {
        System.out.println("El caballo ha miccionado");
    }

    public void comer() {
        if (this.getRaza().toLowerCase().equals("frisón"))
            System.out.println("No hace falta comer");
        else
            System.out.println("Trae para acá, ÑAM");
    }

    public int getPatas() {
        return patas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

}
