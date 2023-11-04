package CAP05;

/* NO ES AL PIE DE LA LETRA COMO DICTA EL EJERCICIO */
public class Ejercicio34v2 {
    public static void main(String[] args) {
        System.out.print("Introduce el primer número positivo: ");
        try {
            long num1 = Long.parseLong(System.console().readLine());
            System.out.print("Introduce el segundo número positivo: ");
            long num2 = Long.parseLong(System.console().readLine());
            long copiaNum1 = num1;
            int acum1 = 0;
            long copiaNum2 = num2;
            int acum2 = 0;
            while (copiaNum1 > 0) {
                copiaNum1 /= 10;
                acum1++;
            }
            while (copiaNum2 > 0) {
                copiaNum2 /= 10;
                acum2++;
            }
            if (num1 > 0 & num2 > 0 & acum1 == acum2) {
                String numPares = "";
                String numImpares = "";
                while (num1 > 0 & num2 > 0) {
                    long cifra1 = num1 % 10;
                    if (cifra1 % 2 == 0)
                        numPares = cifra1 + numPares;
                    else
                        numImpares = cifra1 + numImpares;
                    num1 /= 10;
                    long cifra2 = num2 % 10;
                    if (cifra2 % 2 == 0)
                        numPares = cifra2 + numPares;
                    else
                        numImpares = cifra2 + numImpares;
                    num2 /= 10;
                }
                System.out.printf("El número formado por los pares es %d\n", Long.parseLong(numPares));
                System.out.printf("El número formado por impares es %d", Long.parseLong(numImpares));
            } else
                System.out.println("Introduzca dos números positivos de la misma longitud");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
