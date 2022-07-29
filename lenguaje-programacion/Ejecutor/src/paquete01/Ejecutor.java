package paquete01;

import java.util.Scanner;
import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean b = true;
        do {
            System.out.println("Ingrese el nombre del propietario:");
            String nom = entrada.nextLine();
            System.out.println("Ingrese la cédula del propietario:");
            String id = entrada.nextLine();
            System.out.println("Ingrese ciudad del propietario:");
            String ciud = entrada.nextLine();
            Propietario prop = new Propietario(nom, id, ciud);

            System.out.println("Ingrese la marca del celular:");
            String marca = entrada.nextLine();
            System.out.println("Ingrese el modelo del celular:");
            String mod = entrada.nextLine();
            System.out.println("Ingrese el número de celular:");
            String num = entrada.nextLine();

            System.out.println("Escriba 1 para ingresar un "
                    + "[Plan PostPago Minutos]");
            System.out.println("Escriba 2 para ingresar un "
                    + "[Plan PostPago Megas]");
            System.out.println("Escriba 3 para ingresar un "
                    + "[Plan PostPago Minutos Megas]");
            System.out.println("Escriba 4 para ingresar un "
                    + "[Plan PostPago Minutos Megas]");
            int op = entrada.nextInt();
            if (op == 1) {
                System.out.println("Ingrese los minutos nacionales");
                int min = entrada.nextInt();
                System.out.println("Ingrese el costo por minuto nacional:");
                double cost = entrada.nextDouble();
                System.out.println("Ingrese los minutos internacionales:");
                int minInter = entrada.nextInt();
                System.out.println("Ingrese el costo por minuto internacional:");
                double cost2 = entrada.nextDouble();
                PlanPostPagoMinutos p = new PlanPostPagoMinutos(prop, marca, 
                        mod, num, min, cost, minInter, cost2);
                p.calcularPagoMensual();
            }

        } while (b);
    }
}
