package CAP09.ejercicio89;

import java.text.DecimalFormat;

public class Movil extends Terminal {

    private String tarifa;
    private int costeMinuto;
    private double tarificado;

    public int getCosteMinuto() {
        return costeMinuto;
    }

    public String getTarifa() {
        return tarifa;
    }

    public double getTarificado() {
        return tarificado;
    }

    public Movil(String n, String tarifa) {
        super(n);
        this.tarifa = tarifa;
        this.costeMinuto = (tarifa.equals("rata")) ? 6 : (tarifa.equals("mono")) ? 12 : 30;
        this.tarificado = 0;
    }

    public void llama(Movil m, int segundos) {
        super.llama(m, segundos);
        double minutos = (double) segundos / 60;
        this.tarificado += (minutos * this.costeMinuto) / 100;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("0.00");
        String numeroFormateado = formato.format(this.tarificado);
        return super.toString() + " - tarificados " + numeroFormateado + " euros";
    }

}
