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

    public PlanPostPagoMinutosMegas(Propietario p, String m, String mod, String num, int min, double costminutos,
            double megGb, double costGb) {
        super(p, m, mod, num);
        this.min = min;
        this.costminutos = costminutos;
        this.megGb = megGb;
        this.costGb = costGb;
    }

    public double obtenerCostGb() {
        return costGb;
    }

    public void establecerCostGb(double n) {
        costGb = n;
    }

    public double obtenerMegGb() {
        return megGb;
    }

    public void establecerMegGb(double n) {
        megGb = n;
    }

    public double obtenerCostminutos() {
        return costminutos;
    }

    public void establecerCostminutos(double n) {
        costminutos = n;
    }

    public int obtenerMin() {
        return min;
    }

    public void establecerMin(int n) {
        min = n;
    }

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        String data = String.format("Plan PostPago Megas\n"
                + "Propietario: %s\n"
                + "Marca: %s\n"
                + "Modelo: %s\n"
                + "Número de minutos plan PostPago Megas: %d\n"
                + "Costo de minutos plan PostPago Megas: %d\n"
                + "Numero de megas expresados en gigas: %.2f\n" + "Costo de megas plan PostPago Megas "
                + "Pago mensual: %.2f\n",
                prop,
                marca,
                modelo,
                obtenerMin(),
                obtenerCostminutos(),
                obtenerMegGb(),
                obtenerCostGb(), obtenerPagoMensual());
        return data;
    }

}
