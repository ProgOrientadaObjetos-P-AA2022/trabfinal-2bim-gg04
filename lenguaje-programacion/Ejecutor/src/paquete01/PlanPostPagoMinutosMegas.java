
package paquete01;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {
    private int min;

    private double costminutos;

    private double megGb;

    private double costGb;

    public double getCostGb() {
        return costGb;
    }

    public void setCostGb(double costGb) {
        this.costGb = costGb;
    }

    public double getMegGb() {
        return megGb;
    }

    public void setMegGb(double megGb) {
        this.megGb = megGb;
    }

    public double getCostminutos() {
        return costminutos;
    }

    public void setCostminutos(double costminutos) {
        this.costminutos = costminutos;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }

}
