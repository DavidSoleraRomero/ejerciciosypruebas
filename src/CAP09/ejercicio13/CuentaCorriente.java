package CAP09.ejercicio13;

import java.util.ArrayList;

public class CuentaCorriente {

    private long numCuenta;
    private double saldo;
    private ArrayList<String> movimientos;

    public long getNumCuenta() {
        return numCuenta;
    }

    public CuentaCorriente() {
        this.numCuenta = generaNumero();
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public CuentaCorriente(double saldo) {
        this.numCuenta = generaNumero();
        this.saldo = saldo;
        this.movimientos = new ArrayList<>();
    }

    public void ingreso(double saldo) {
        this.saldo += saldo;
        this.movimientos.add("Ingreso de " + saldo + " € Saldo: " + this.saldo + " €");
    }

    public void cargo(double saldo) {
        this.saldo -= saldo;
        this.movimientos.add("Cargo de " + saldo + " € Saldo: " + this.saldo + " €");
    }

    public void transferencia(CuentaCorriente c, double saldo) {
        c.saldo += saldo;
        this.saldo -= saldo;
        this.movimientos.add(
                "Transferencia emitida de " + saldo + " € a la cuenta " + c.numCuenta + " Saldo: " + this.saldo + " €");
        c.movimientos.add(
                "Transferencia recibida de " + saldo + " € de la cuenta "
                        + this.numCuenta + " Saldo: " + c.saldo + " €");
    }

    /*
     * public String movimientos() {
     * String movimientos = "Movimientos de la cuenta " + getNumCuenta() +
     * "\n-----------------------------------\n";
     * if (!this.ingresos.isEmpty()) {
     * for (int i = 0; i < ingresos.size(); i += 2) {
     * movimientos = movimientos + "Ingreso de " + ingresos.get(i) + " € ";
     * movimientos = movimientos + "Saldo: " + ingresos.get(i + 1) + " € " + "\n";
     * }
     * }
     * if (!this.cargos.isEmpty()) {
     * for (int i = 0; i < cargos.size(); i += 2) {
     * movimientos = movimientos + "Cargo de " + cargos.get(i) + " € ";
     * movimientos = movimientos + "Saldo: " + cargos.get(i + 1) + " € " + "\n";
     * }
     * }
     * if (!this.transferenciasE.isEmpty()) {
     * for (int i = 0; i < transferenciasE.size(); i += 3) {
     * movimientos = movimientos + "Transf. emitida de " + transferenciasE.get(i)
     * + " € a la cuenta" + transferenciasE.get(i + 2);
     * movimientos = movimientos + " Saldo: " + transferenciasE.get(i + 1) + " € " +
     * "\n";
     * }
     * }
     * if (!this.transferenciasR.isEmpty()) {
     * for (int i = 0; i < transferenciasR.size(); i += 3) {
     * movimientos = movimientos + "Transf. recibida de " + transferenciasR.get(i)
     * + " € a la cuenta" + transferenciasR.get(i + 2);
     * movimientos = movimientos + " Saldo: " + transferenciasR.get(i + 1) + " € " +
     * "\n";
     * }
     * }
     * return movimientos;
     * }
     */

    public void movimientos() {
        String movimiento = "Movimientos de la cuenta " + getNumCuenta() + "\n-----------------------------------\n";
        System.out.print(movimiento);
        for (int i = 0; i < this.movimientos.size(); i++) {
            System.out.println(this.movimientos.get(i));
        }
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
        return "CuentaCorriente [numCuenta=" + numCuenta + ", saldo=" + saldo + ", movimientos=" + movimientos + "]";
    }

}
