package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public class PlanPostPagoMinutos extends PlanCelular {

    private int minNac;
    private double costminNac;
    private int minInt;
    private double costminInt;

    public PlanPostPagoMinutos(String n, String i, String ciud, String m, 
            String mod, String num, int min, double cMin, int minI, 
            double cosInt) {
        super(n, i, ciud, m, mod, num);
        minNac = min;
        costminNac = cMin;
        minInt = minI;
        costminInt = cosInt;
    }

    public void establecerMinNac(int n) {
        minNac = n;
    }

    public void establecerCostminNac(double n) {
        costminNac = n;
    }

    public void establecerMinInt(int n) {
        minInt = n;
    }

    public void establecerCostminInt(double n) {
        costminInt = n;
    }

    @Override
    public void calcularPagoMensual() {
        pago_mensual = (obtenerMinNac() * obtenerCostminNac()) + 
                (obtenerMinInt() * obtenerCostminInt());
    }

    public int obtenerMinNac() {
        return minNac;
    }

    public double obtenerCostminNac() {
        return costminNac;
    }

    public int obtenerMinInt() {
        return minInt;
    }

    public double obtenerCostminInt() {
        return costminInt;
    }
    @Override
    public String toString (){
        String data = String.format("Plan PostPago Minutos\n"
                + "Propietario: %s\n"
                + "Marca: %s\n"
                + "Modelo: %s\n"
                + "Número de minutos nacionales: %d\n"
                + "Número de minutos internacionales: %d\n"
                + "Pago mensual: %.2f\n",
                nom,
                marca,
                modelo,
                obtenerMinNac(),
                obtenerMinInt(),
                obtenerPagoMensual());
        return data;
    }
}
