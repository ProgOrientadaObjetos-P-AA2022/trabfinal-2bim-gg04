package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double megGb;
    private double costGb;
    private double tarbase;

    public PlanPostPagoMegas(String n, String i, String ciud, String m, String mod, String num,
            double me, double co, double tar) {
        super(n, i, ciud, m, mod, num);
        megGb = me;
        costGb = co;
        tarbase = tar;
    }

    public void establecerMegGb(double n) {
        megGb = n;
    }

    public void establecerCostGb(double n) {
        costGb = n;
    }

    public void establecerTarbase(double n) {
        tarbase = n;
    }

    @Override
    public void calcularPagoMensual() {
        pago_mensual = (obtenerCostGb() * obtenerMegGb()) + obtenerTarbase();
    }

    public double obtenerMegGb() {
        return megGb;
    }

    public double obtenerCostGb() {
        return costGb;
    }

    public double obtenerTarbase() {
        return tarbase;
    }

    @Override
    public String toString() {
        String data = String.format("Plan PostPago Megas\n"
                + "Propietario: %s\n"
                + "Marca: %s\n"
                + "Modelo: %s\n"
                + "Número de megas en gigas: %.0f\n"
                + "Costo por giga: %.0f\n"
                + "Tarifa base: %.2f\n"
                + "Pago mensual: %.2f\n",
                nom,
                marca,
                modelo,
                obtenerCostGb(),
                obtenerMegGb(),
                obtenerTarbase(),
                obtenerPagoMensual());
        return data;
    }

}
