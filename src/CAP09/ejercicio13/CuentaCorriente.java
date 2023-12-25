package CAP09.ejercicio13;

import java.text.DecimalFormat;

public class CuentaCorriente {

    private long numCuenta;
    private int saldo;

    public CuentaCorriente() {
        this.numCuenta = generaNumero();
        this.saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        this.numCuenta = generaNumero();
        this.saldo = saldo;
    }

    public void ingreso(int saldo) {
        this.saldo += saldo;
    }

    public void cargo(int saldo) {
        this.saldo -= saldo;
    }

    public void transferencia(CuentaCorriente c, int saldo) {
        c.saldo += saldo;
        this.saldo -= saldo;
    }

    private long generaNumero() {
        String numero = "";
        for (int i = 1; i <= 10; i++) {
            numero = numero + (int) (Math.random() * 10);
        }
        return Long.parseLong(numero);
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("0.00");
        String saldoFormateado = formato.format(this.saldo);
        return "Número de cta: " + this.numCuenta + " Saldo: " + saldoFormateado + " €";
    }

}
