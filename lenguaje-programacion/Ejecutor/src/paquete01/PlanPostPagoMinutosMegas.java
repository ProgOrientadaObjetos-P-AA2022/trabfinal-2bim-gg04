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

    public void setCostGb(double n) {
        costGb = n;
    }

    public double getMegGb() {
        return megGb;
    }

    public void setMegGb(double n) {
        megGb = n;
    }

    public double getCostminutos() {
        return costminutos;
    }

    public void setCostminutos(double n) {
        costminutos = n;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int n) {
        min = n;
    }

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }

}
