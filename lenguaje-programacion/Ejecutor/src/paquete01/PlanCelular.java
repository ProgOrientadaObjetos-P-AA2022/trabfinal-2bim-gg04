package paquete01;

import paquete2.Propietario;

/**
 *
 * @author andreflores
 */
public abstract class PlanCelular {

    protected String nom;
    protected String ced;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String num_celular;
    protected double pago_mensual;

    public PlanCelular(String n, String i, String ciud, String m, String mod, String num) {
        nom = n;
        ced = i;
        ciudad = ciud;
        marca = m;
        modelo = mod;
        num_celular = num;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerId(String n) {
        ced = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
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

    public String obtenerNom() {
        return nom;
    }

    public String obtenerId() {
        return ced;
    }

    public String obtenerCiudad() {
        return ciudad;
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
