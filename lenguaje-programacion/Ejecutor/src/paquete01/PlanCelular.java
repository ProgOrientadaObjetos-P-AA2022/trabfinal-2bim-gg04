package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public abstract class PlanCelular {

    private Propietario prop;
    private String marca;
    private String modelo;
    private double num_celular;
    private double pago_mensual;

    public void establecerProp(Propietario n) {
        prop = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerModelo(String n) {
        modelo = n;
    }

    public void establecerNum(double n) {
        num_celular = n;
    }

    public abstract void calcularPagoMensual();

    public Propietario obtenerProp() {
        return prop;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public double obtenerNum() {
        return num_celular;
    }

    public double obtenerPagoMensual() {
        return pago_mensual;
    }
}
