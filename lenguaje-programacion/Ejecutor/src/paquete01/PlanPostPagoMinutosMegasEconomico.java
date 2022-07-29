package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private int min;
    private double porcentajedesc;
    private double costmin;
    private double megGb;
    private double costGb;

    public PlanPostPagoMinutosMegasEconomico(String n, String i, String ciud,
            String m, String mod, String num, int mi, double por, double cost,
            double meg, double costGB) {
        super(n, i, ciud, m, mod, num);
        min = mi;
        porcentajedesc = por;
        costmin = cost;
        megGb = meg;
        costGb = costGB;
    }

    public void establecerMin(int n) {
        min = n;
    }

    public void establecerPor(double n) {
        porcentajedesc = n;
    }

    public void establecerCostmin(double n) {
        costmin = n;
    }

    public void establecerMegGb(double n) {
        megGb = n;
    }

    public void establecerCostGb(double n) {
        costGb = n;
    }

    public int obtenerMin() {
        return min;
    }

    public double obtenerPor() {
        return porcentajedesc / 100;
    }

    public double obtenerCostmin() {
        return costmin;
    }

    public double obtenerMegGb() {
        return megGb;
    }

    public double obtenerCostGb() {
        return costGb;
    }

    @Override
    public void calcularPagoMensual() {
        pago_mensual = ((obtenerMin() * obtenerCostmin()) + 
                (obtenerMegGb()*obtenerCostGb())) -((obtenerMin() * 
                obtenerCostmin()) + (obtenerMegGb()*obtenerCostGb())
                *obtenerPor());

    }

    @Override
    public String toString() {
        String data = String.format("Plan PostPago Minutos Megas Economico\n"
                + "Propietario: %s\n"
                + "Marca: %s\n"
                + "Modelo: %s\n"
                + "Número de minutos: %d\n"
                + "Costo de minutos: %.2f\n"
                + "Numero de megas expresados en gigas: %.2f\n" 
                + "Costo de megas: %.2f\n"
                + "Pago mensual: %.2f\n",
                nom,
                marca,
                modelo,
                obtenerMin(),
                obtenerCostmin(),
                obtenerMegGb(),
                obtenerCostGb(), 
                obtenerPagoMensual());
        return data;
    }

}
