package CAP09.ejercicio89;

import java.text.DecimalFormat;

public class Movilv2 extends Terminalv2 {

    private static final String[] tarifas = { "rata", "mono", "bisonte" };
    private double costeMinuto;
    private double tarificados;
    private String tarifa;

    public Movilv2() throws Exception {
        super();
    }

    public Movilv2(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa.toLowerCase();
        if (tarifa.equals("rata")) {
            this.costeMinuto = 6;
        } else if (tarifa.equals("mono")) {
            this.costeMinuto = 12;
        } else {
            this.costeMinuto = 30;
        }
    }

    public double getCosteMinuto() {
        return costeMinuto;
    }

    public String getTarifa() {
        return tarifa;
    }

    public static String[] getTarifas() {
        return tarifas;
    }

    @Override
    public void llama(Terminalv2 t, int segundos) {
        super.llama(t, segundos);
        double minutos = (double) segundos / 60;
        this.tarificados += (this.costeMinuto * minutos) / 100;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("0.00");
        String numeroFormateado = formato.format(this.tarificados);
        return super.toString() + " - tarificados " + numeroFormateado + " euros";
    }

}
