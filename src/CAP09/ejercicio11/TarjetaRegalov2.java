package CAP09.ejercicio11;

public class TarjetaRegalov2 {

    private int numero;
    private double saldo;

    public TarjetaRegalov2() throws Exception {
        throw new Exception("Utilice el constructor con parámetros");
    }

    public TarjetaRegalov2(double saldo) throws Exception {
        if (saldo > 0) {
            this.saldo = saldo;
            this.numero = generaNumero();
        } else
            throw new Exception("Introduzca un saldo positivo");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void gasta(double saldo) {
        if ((this.saldo - saldo) >= 0) {
            this.saldo -= saldo;
        } else {
            System.out.println("No dispones de suficiente dinero; tienes " + this.saldo + " euros");
        }
    }

    public TarjetaRegalov2 fusionaCon(TarjetaRegalov2 t) throws Exception {
        TarjetaRegalov2 aux = new TarjetaRegalov2(this.saldo + t.saldo);
        this.saldo = 0;
        t.saldo = 0;
        return aux;
    }

    private int generaNumero() {
        int num = 0;
        for (int i = 1; i <= 5; i++) {
            num *= 10;
            num += (int) (Math.random() * 10);
        }
        return num;
    }

    @Override
    public String toString() {
        return "Tarjeta nº " + this.numero + " - " + String.format("%.2f", this.saldo) + " euros";
    }

}
