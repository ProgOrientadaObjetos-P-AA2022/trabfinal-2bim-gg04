package paquete01;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMinutos extends PlanCelular {

    private int minNac;
    private double costminNac;
    private int minInt;
    private double costminInt;

    public double getCostminInt() {
        return costminInt;
    }

    public void setCostminInt(double costminInt) {
        this.costminInt = costminInt;
    }

    public int getMinInt() {
        return minInt;
    }

    public void setMinInt(int minInt) {
        this.minInt = minInt;
    }

    public double getCostminNac() {
        return costminNac;
    }

    public void setCostminNac(double costminNac) {
        this.costminNac = costminNac;
    }

    public int getMinNac() {
        return minNac;
    }

    public void setMinNac(int minNac) {
        this.minNac = minNac;
    }

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }
}
