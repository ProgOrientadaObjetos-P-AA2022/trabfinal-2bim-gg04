package paquete01;

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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getCostmin() {
        return costmin;
    }

    public void setCostmin(double n) {
        costmin = n;
    }

    public double getMegGb() {
        return megGb;
    }

    public void setMegGb(double n) {
        megGb = n;
    }

    public double getCostGb() {
        return costGb;
    }

    public void setCostGb(double n) {
        costGb = n;
    }

    public double getPor() {
        return por;
    }

    public void setPor(double n) {
        por = n;
    }

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }

}
