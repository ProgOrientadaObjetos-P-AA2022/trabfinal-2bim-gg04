package paquete2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete01.*;

/**
 *
 * @author andreflores
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            
            String url = "jdbc:sqlite:bd/base.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutos (nom"
                    + "ced"
                    + "ciud"
                    + "marca"
                    + "modelo"
                    + "num_celular"
                    + "minNac"
                    + "costminNac"
                    + "minInt"
                    + "costminInt) "
                    + "values ('%s', '%s', '%s', %s, %s, %s, %d, %.2f, %d, %.2f)",
                    plan.obtenerNom(),
                    plan.obtenerId(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNum(),
                    plan.obtenerMinNac(),
                    plan.obtenerCostminNac(),
                    plan.obtenerMinInt(),
                    plan.obtenerCostminInt());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception insertarPlanPostPagoMinutos:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMegas (nom"
                    + "ced"
                    + "ciud"
                    + "marca"
                    + "modelo"
                    + "num_celular"
                    + "megGb"
                    + "costGb"
                    + "tarbase) "
                    + "values ('%s', '%s', '%s', %s, %s, %s, %.2f, %.2f, %.2f)",
                    plan.obtenerNom(),
                    plan.obtenerId(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNum(),
                    plan.obtenerMegGb(),
                    plan.obtenerCostGb(),
                    plan.obtenerTarbase());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception insertarPlanPostPagoMegas:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas "
                    + "(nom"
                    + "ced"
                    + "ciud"
                    + "marca"
                    + "modelo"
                    + "num_celular"
                    + "min"
                    + "costminutos"
                    + "megGb"
                    + "costGb) "
                    + "values ('%s', '%s', '%s', %s, %s, %s, %d, %.2f, %.2f, "
                    + "%.2f)",
                    plan.obtenerNom(),
                    plan.obtenerId(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNum(),
                    plan.obtenerMin(),
                    plan.obtenerCostminutos(),
                    plan.obtenerMegGb(),
                    plan.obtenerCostGb());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception insertarPlanPostPagoMinutosMegas:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegasEconomico(
            PlanPostPagoMinutosMegasEconomico plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO "
                    + "PlanPostPagoMinutosMegasEconomico "
                    + "(nom"
                    + "ced"
                    + "ciud"
                    + "marca"
                    + "modelo"
                    + "num_celular"
                    + "min"
                    + "porcentajedesc"
                    + "costminutos"
                    + "megGb"
                    + "costGb) "
                    + "values ('%s', '%s', '%s', %s, %s, %s, %d, %.2f,%.2f, %.2f, "
                    + "%.2f)",
                    plan.obtenerNom(),
                    plan.obtenerId(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNum(),
                    plan.obtenerMin(),
                    plan.obtenerPor(),
                    plan.obtenerCostmin(),
                    plan.obtenerMegGb(),
                    plan.obtenerCostGb());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception "
                    + "insertarPlanPostPagoMinutosMegasEconomico:");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {
        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutos p = new PlanPostPagoMinutos(
                        rs.getString("nom"),
                        rs.getString("ced"),
                        rs.getString("ciudad"),
                        rs.getString("marca"), rs.getString("modelo"),
                        rs.getString("num_celular"), rs.getInt("minNac"),
                        rs.getDouble("costminNac"), rs.getInt("minInt"),
                        rs.getDouble("costminInt"));
                lista.add(p);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutos");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMegas> obtenerPlanPostPagoMegas() {
        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMegas p = new PlanPostPagoMegas(
                        rs.getString("nom"),
                        rs.getString("ced"),
                        rs.getString("ciudad"),
                        rs.getString("marca"), rs.getString("modelo"),
                        rs.getString("num_celular"), rs.getDouble("megGb"),
                        rs.getDouble("costGb"), rs.getDouble("tarbase"));
                lista.add(p);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutosMegas> obtenerPlanPostPagoMinutosMegas() {
        ArrayList<PlanPostPagoMinutosMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegas p = new PlanPostPagoMinutosMegas(
                        rs.getString("nom"),
                        rs.getString("ced"),
                        rs.getString("ciudad"),
                        rs.getString("marca"), rs.getString("modelo"),
                        rs.getString("num_celular"), rs.getInt("minNac"),
                        rs.getDouble("costminNac"), rs.getDouble("megGb"),
                        rs.getDouble("costGb"));
                lista.add(p);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }
    
    public ArrayList<PlanPostPagoMinutosMegasEconomico> 
        obtenerDataPlanPostPagoMinutosMegasEconomico() {
        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegasEconomico;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico p = new PlanPostPagoMinutosMegasEconomico(
                        rs.getString("nom"),
                        rs.getString("ced"),
                        rs.getString("ciudad"),
                        rs.getString("marca"), rs.getString("modelo"),
                        rs.getString("num_celular"), rs.getInt("min"),
                        rs.getDouble("porcentajedesc"), rs.getDouble("costmin"),
                        rs.getDouble("megGb"), rs.getDouble("costGb"));
                lista.add(p);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: "
                    + "insertarPlanPostPagoMinutosMegasEconomico");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
