package CAP10;

public class Carta implements Comparable<Carta> {

    private String palo;
    private String nombreCarta;

    public Carta(String palo, String nombreCarta) {
        this.palo = palo;
        this.nombreCarta = nombreCarta;
    }

    public String getPalo() {
        return palo;
    }

    public String getCarta() {
        return nombreCarta;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    @Override
    public String toString() {
        return nombreCarta + " de " + palo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palo == null) ? 0 : palo.hashCode());
        result = prime * result + ((nombreCarta == null) ? 0 : nombreCarta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carta other = (Carta) obj;
        if (palo == null) {
            if (other.palo != null)
                return false;
        } else if (!palo.equals(other.palo))
            return false;
        if (nombreCarta == null) {
            if (other.nombreCarta != null)
                return false;
        } else if (!nombreCarta.equals(other.nombreCarta))
            return false;
        return true;
    }

    @Override
    public int compareTo(Carta otraCarta) {
        // Primero, ordena por palo
        int comparacionPorPalo = this.palo.compareTo(otraCarta.palo);
        if (comparacionPorPalo != 0) {
            return comparacionPorPalo;
        }

        // Si son del mismo palo, ordena por valor
        int n1 = sacaNum(this.nombreCarta);
        int n2 = sacaNum(otraCarta.nombreCarta);
        return Integer.compare(n1, n2);
    }

    private int sacaNum(String carta) {
        switch (carta) {
            case "As":
                return 1;
            case "Sota":
                return 8;
            case "Caballo":
                return 9;
            case "Rey":
                return 10;
            default:
                return Integer.valueOf(carta);
        }
    }

}
