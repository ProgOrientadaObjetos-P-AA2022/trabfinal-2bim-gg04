
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

    public void setCostmin(double costmin) {
        this.costmin = costmin;
    }

    public double getMegGb() {
        return megGb;
    }

    public void setMegGb(double megGb) {
        this.megGb = megGb;
    }

    public double getCostGb() {
        return costGb;
    }

    public void setCostGb(double costGb) {
        this.costGb = costGb;
    }

    public double getPor() {
        return por;
    }

    public void setPor(double por) {
        this.por = por;
    }

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }

}
