package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private int min;
    private double por;
    private double costmin;
    private double megGb;
    private double costGb;

    public PlanPostPagoMinutosMegasEconomico(Propietario p, String m, String mod, String num, int min, double por,
            double costmin, double megGb, double costGb) {
        super(p, m, mod, num);
        this.min = min;
        this.por = por;
        this.costmin = costmin;
        this.megGb = megGb;
        this.costGb = costGb;
    }

    public int obtenerMin() {
        return min;
    }

    public void establecerMin(int min) {
        this.min = min;
    }

    public double obtenerCostmin() {
        return costmin;
    }

    public void establecerCostmin(double n) {
        costmin = n;
    }

    public double obtenerMegGb() {
        return megGb;
    }

    public void establecerMegGb(double n) {
        megGb = n;
    }

    public double obtenerCostGb() {
        return costGb;
    }

    public void establecerCostGb(double n) {
        costGb = n;
    }

    public double obtenerPor() {
        return por;
    }

    public void establecerPor(double n) {
        por = n;
    }

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }

}
