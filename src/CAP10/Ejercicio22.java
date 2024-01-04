package CAP10;

import CAP09.ejercicio13.CuentaCorriente;

/* Amplía el ejercicio 13 del capítulo anterior que implementaba cuentas corrien-
tes de un banco de tal forma que cada cuenta lleve un registro de todos

los movimientos realizados: ingresos, cargos y transferencias (tanto enviadas
como recibidas). */
public class Ejercicio22 {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);
        cuenta1.ingreso(2000);
        cuenta1.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta1, 100);
        cuenta1.transferencia(cuenta3, 250);
        cuenta2.transferencia(cuenta1, 22);
        cuenta1.movimientos();
    }
}
