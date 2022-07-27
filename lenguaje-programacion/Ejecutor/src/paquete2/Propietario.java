package paquete2;

/**
 *
 * @author andreflores
 */
public class Propietario {

    private String nom;
    private String id;
    private String ciudad;

    public Propietario(String n, String i, String c) {
        nom = n;
        id = i;
        ciudad = c;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerId(String n) {
        id = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerId() {
        return id;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String data = String.format("%s - %s - %s",
                obtenerNom(),
                obtenerId(),
                obtenerCiudad());
        return data;
    }
}
