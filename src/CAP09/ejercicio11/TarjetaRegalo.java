package CAP09.ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {

    private double saldo;
    private int digitos;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.digitos = (int) (Math.random() * 89999 + 10000);
    }

    public void gasta(double saldo) {
        if (saldo == 0) {
            System.out.println("El saldo de esta tarjeta está a 0 euros");
        } else if (saldo > this.saldo) {
            System.out.println("Error. Tienes " + this.saldo + " euros e intentas gastar " + saldo + " euros.");
        } else
            this.saldo -= saldo;
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        TarjetaRegalo tarjetaFusionada = new TarjetaRegalo((this.saldo + t.saldo));
        this.saldo = 0;
        t.saldo = 0;
        return tarjetaFusionada;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("0.00");
        String saldoFormateado = formato.format(this.saldo);
        return "Tarjeta nº " + digitos + " - Saldo " + saldoFormateado + " euros";
    }

}
