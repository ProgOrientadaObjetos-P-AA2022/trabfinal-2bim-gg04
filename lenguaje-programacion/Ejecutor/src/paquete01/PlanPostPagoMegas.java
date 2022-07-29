package paquete01;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double megGb;
    private double costGb;
    private double tarbase;

    public double getTarbase() {
        return tarbase;
    }

    public void setTarbase(double tarbase) {
        this.tarbase = tarbase;
    }

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

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }
}
