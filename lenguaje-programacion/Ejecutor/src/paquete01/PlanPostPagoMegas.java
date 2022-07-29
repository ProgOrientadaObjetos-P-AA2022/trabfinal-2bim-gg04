package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMegas extends PlanCelular {

    public PlanPostPagoMegas(Propietario p, String m, String mod, String num) {
        super(p, m, mod, num);
        //TODO Auto-generated constructor stub
    }

    private double megGb;
    private double costGb;
    private double tarbase;

    

    public void establecerTarbase(double tarbase) {
        this.tarbase = tarbase;
    }

    public double obtenerCostGb() {
        return costGb;
    }

    public void establecerCostGb(double costGb) {
        this.costGb = costGb;
    }

    public double obtenerMegGb() {
        return megGb;
    }

    public void establecerMegGb(double megGb) {
        this.megGb = megGb;
    }
    
    public double obtenerTarbase() {
        return tarbase;
    }

    @Override
    public void calcularPagoMensual() {
        // TODO Auto-generated method stub

    }
}
