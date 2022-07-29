package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {

    private int min;
    private double costminutos;
    private double megGb;
    private double costGb;

    public PlanPostPagoMinutosMegas(String n, String i, String ciud, String m, 
            String mod, String num, int mi, double cost, double me, 
            double costGB) {
        super(n, i, ciud, m, mod, num);
        min = mi;
        costminutos = cost;
        megGb = me;
        costGb = costGB;
    }

    public void establecerMin(int n) {
        min = n;
    }

    public void establecerCostminutos(double n) {
        costminutos = n;
    }

    public void establecerMegGb(double n) {
        megGb = n;
    }

    public void establecerCostGb(double n) {
        costGb = n;
    }

    public int obtenerMin() {
        return min;
    }

    public double obtenerCostminutos() {
        return costminutos;
    }

    public double obtenerMegGb() {
        return megGb;
    }

    public double obtenerCostGb() {
        return costGb;
    }

    @Override
    public void calcularPagoMensual() {
        pago_mensual = (obtenerMin() * obtenerCostminutos())
                + (obtenerMegGb() * obtenerCostGb());
    }

    @Override
    public String toString() {
        String data = String.format("Plan PostPago Minutos Megas\n"
                + "Propietario: %s\n"
                + "Marca: %s\n"
                + "Modelo: %s\n"
                + "Número de minutos: %d\n"
                + "Costo de minutos: %.2f\n"
                + "Numero de megas expresados en gigas: %.2f\n"
                + "Costo por cada giga: %.2f\n "
                + "Pago mensual: %.2f\n",
                nom,
                marca,
                modelo,
                obtenerMin(),
                obtenerCostminutos(),
                obtenerMegGb(),
                obtenerCostGb(),
                obtenerPagoMensual());
        return data;
    }

}
