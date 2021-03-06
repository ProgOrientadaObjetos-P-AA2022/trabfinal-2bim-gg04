package paquete01;

import java.sql.SQLException;
import java.util.Scanner;
import paquete2.Enlace;
import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Enlace c = new Enlace();
        boolean b = true;
        do {
            System.out.println("Ingrese el nombre del propietario:");
            String nom = entrada.nextLine();
            System.out.println("Ingrese la cédula del propietario:");
            String id = entrada.nextLine();
            System.out.println("Ingrese ciudad del propietario:");
            String ciud = entrada.nextLine();
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
                System.out.println("Ingrese los minutos nacionales:");
                int min = entrada.nextInt();
                System.out.println("Ingrese el costo por minuto nacional:");
                double cost = entrada.nextDouble();
                System.out.println("Ingrese los minutos internacionales:");
                int minInter = entrada.nextInt();
                System.out.println("Ingrese el costo por minuto internacional:");
                double cost2 = entrada.nextDouble();
                PlanPostPagoMinutos p = new PlanPostPagoMinutos(nom, id, ciud,
                        marca, mod, num, min, cost, minInter, cost2);
                p.calcularPagoMensual();
                c.insertarPlanPostPagoMinutos(p);
            } else if (op == 2) {
                System.out.println("Ingrese las megas expresado en gigas:");
                double megasGb = entrada.nextDouble();
                System.out.println("Ingrese el costo por cada giga:");
                double gB = entrada.nextDouble();
                System.out.println("Ingrese la tarifa base:");
                double tari = entrada.nextDouble();
                PlanPostPagoMegas p = new PlanPostPagoMegas(nom, id, ciud,
                        marca, mod, num, megasGb, gB, tari);
                p.calcularPagoMensual();
                c.insertarPlanPostPagoMegas(p);
            } else if (op == 3) {
                System.out.println("Ingrese el número de los minutos:");
                int min = entrada.nextInt();
                System.out.println("Ingrese el costo por cada minuto:");
                double cost = entrada.nextDouble();
                System.out.println("Ingrese las megas expresado en gigas:");
                double megasGb = entrada.nextInt();
                System.out.println("Ingrese el costo por cada giga:");
                double gB = entrada.nextDouble();
                PlanPostPagoMinutosMegas p = new PlanPostPagoMinutosMegas(nom,
                        id, ciud, marca, mod, num, min, cost, megasGb, gB);
                p.calcularPagoMensual();
                c.insertarPlanPostPagoMinutosMegas(p);
            } else if (op == 4) {
                System.out.println("Ingrese el número de los minutos:");
                int min = entrada.nextInt();
                System.out.println("Ingrese el costo por cada minuto:");
                double cost = entrada.nextDouble();
                System.out.println("Ingrese las megas expresado en gigas:");
                double megasGb = entrada.nextInt();
                System.out.println("Ingrese el costo por cada giga:");
                double gB = entrada.nextDouble();
                System.out.println("Ingrese el porcentaje de descuento:");
                double por = entrada.nextDouble();
                PlanPostPagoMinutosMegasEconomico p
                        = new PlanPostPagoMinutosMegasEconomico(nom, id, ciud,
                                marca, mod, num, min, cost, megasGb, gB, por);
                p.calcularPagoMensual();
                c.insertarPlanPostPagoMinutosMegasEconomico(p);
            }

            entrada.nextLine();
            System.out.println("Ingrese SI para salir del proceso");
            String opc = entrada.nextLine();
            if ("SI".equals(opc) || "Si".equals(opc)) {
                b = false;
                for (int i = 0; i < c.obtenerDataPlanPostPagoMinutos().size();
                        i++) {
                    System.out.printf("%s\n",
                            c.obtenerDataPlanPostPagoMinutos().get(i));
                }
                for (int i = 0; i < c.obtenerPlanPostPagoMegas().size(); i++) {
                    System.out.printf("%s\n",
                            c.obtenerPlanPostPagoMegas().get(i));
                }
                for (int i = 0; i < c.obtenerPlanPostPagoMinutosMegas().size();
                        i++) {
                    System.out.printf("%s\n",
                            c.obtenerPlanPostPagoMinutosMegas().get(i));
                }
                for (int i = 0; i
                        < c.obtenerDataPlanPostPagoMinutosMegasEconomico().size();
                        i++) {
                    System.out.printf("%s\n",
                            c.obtenerDataPlanPostPagoMinutosMegasEconomico().get(i));
                }
            }
        } while (b);
    }
}
