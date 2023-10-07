package CAP04;

import java.util.Scanner;

/* Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado. */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generación de nónimas");
        System.out.println("1. Prog. Junior");
        System.out.println("2. Prog. Senior");
        System.out.println("3. Jefe de proyecto");
        System.out.print("Elija un cargo de los mostrados (nº): ");
        int cargo = sc.nextInt();
        System.out.print("Introduzca los días que ha estado visitando clientes: ");
        int diaDietas = sc.nextInt();
        System.out.print("Elija --> 1. Soltero || 2. Casado: ");
        int estCivil = sc.nextInt();
        sc.close();
        float sueldoBase = 0;
        float sueldoBruto = 0;
        float sueldoNeto = 0;
        float dietas = 0;
        String sIrpf = "(0%)";
        float iIrpf = 0;
        if (((cargo > 0) && (cargo < 4) && (diaDietas > 0) && (diaDietas < 32) && (estCivil >= 1) && (estCivil <= 2))) {
            switch (cargo) {
                case 1:
                    sueldoBase = 950;
                    dietas = diaDietas * 30;
                    sueldoBruto = sueldoBase + dietas;
                    if (estCivil == 1) {
                        iIrpf = 0.25f;
                        sueldoNeto = sueldoBruto - (sueldoBruto * 0.25f);
                        sIrpf = "(25%)";
                    } else {
                        iIrpf = 0.20f;
                        sueldoNeto = sueldoBruto - (sueldoBruto * 0.20f);
                        sIrpf = "(20%)";
                    }
                    break;
                case 2:
                    sueldoBase = 1200;
                    dietas = diaDietas * 30;
                    sueldoBruto = sueldoBase + dietas;
                    if (estCivil == 1) {
                        iIrpf = 0.25f;
                        sueldoNeto = sueldoBruto - (sueldoBruto * 0.25f);
                        sIrpf = "(25%)";
                    } else {
                        iIrpf = 0.20f;
                        sueldoNeto = sueldoBruto - (sueldoBruto * 0.20f);
                        sIrpf = "(20%)";
                    }
                    break;
                case 3:
                    sueldoBase = 1600;
                    dietas = diaDietas * 30;
                    sueldoBruto = sueldoBase + dietas;
                    if (estCivil == 1) {
                        iIrpf = 0.25f;
                        sueldoNeto = sueldoBruto - (sueldoBruto * 0.25f);
                        sIrpf = "(25%)";
                    } else {
                        iIrpf = 0.20f;
                        sueldoNeto = sueldoBruto - (sueldoBruto * 0.20f);
                        sIrpf = "(20%)";
                    }
                    break;
            }
            System.out.println("--------------------------------");
            System.out.printf("| %-20s %7.2f |\n", "Sueldo base", sueldoBase);
            String comprueba = diaDietas + "";
            if (comprueba.length() == 1)
                System.out.printf("| %-6s (%d %-10s %7.2f |\n", "Dietas", diaDietas, "viajes)", dietas);
            else
                System.out.printf("| %-6s (%d %-10s %6.2f |\n", "Dietas", diaDietas, "viajes)", dietas);
            System.out.println("|------------------------------|");
            System.out.printf("| %-20s %7.2f |\n", "Sueldo bruto", sueldoBruto);
            System.out.printf("| %-14s %-5s %7.2f |\n", "Retención IRPF", sIrpf, (sueldoBruto * iIrpf));
            System.out.println("|------------------------------|");
            System.out.printf("| %-20s %7.2f |\n", "Sueldo neto", sueldoNeto);
            System.out.println("--------------------------------");
        } else {
            System.out.println("Puede que se haya producido uno de los siguientes problemas:");
            System.out.println("1. Cargo inadecuado; debe ser del 1 al 3");
            System.out.println("2. Días de dieta inadecuados; deben ser del 1 al 31");
            System.out.println("3. Estado civil inadeucado; debe ser 1 o 2");
        }

    }
}
