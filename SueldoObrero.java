package sueldoobrero;

import java.util.Scanner;

public class SueldoObrero {

    public static void main(String[] args) {
        double sueldoSemanal = 0;
        int horasSemanalesTrabajadas = 0;
        double precioHora = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el precio por hora");
        precioHora = entrada.nextDouble();

        System.out.println("ingrese horas semanales del trabajador");
        horasSemanalesTrabajadas = entrada.nextInt();

        if (horasSemanalesTrabajadas > 40) {
            sueldoSemanal = 40 * precioHora + (horasSemanalesTrabajadas - 40) * precioHora * 1.75;
        } else {
            sueldoSemanal = horasSemanalesTrabajadas * precioHora;
        }

        System.out.println("el sueldo semanal es: " + sueldoSemanal);

    }

}
