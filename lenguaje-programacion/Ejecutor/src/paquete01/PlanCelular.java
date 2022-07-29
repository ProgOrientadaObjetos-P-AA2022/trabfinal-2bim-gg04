package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public abstract class PlanCelular {

    protected Propietario prop;
    protected String marca;
    protected String modelo;
    protected String num_celular;
    protected double pago_mensual;

    public PlanCelular(Propietario p, String m, String mod, String num){
        prop = p;
        marca = m;
        modelo = mod;
        num_celular = num;
    }
    
    public void establecerProp(Propietario n) {
        prop = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerModelo(String n) {
        modelo = n;
    }

    public void establecerNum(String n) {
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

    public String obtenerNum() {
        return num_celular;
    }

    public double obtenerPagoMensual() {
        return pago_mensual;
    }
}
