
package paquete2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete01.PlanPostPagoMinutos;

/**
 *
 * @author andreflores
 */
public class Enlace {
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/plan.db";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutos (prop,"
                    + "marca"
                    + "modelo"
                    + "num_celular"
                    + "minNac"
                    + "costminNac"
                    + "minInt"
                    + "costminInt) "
                    + "values ('%s', %s, %s, %s, %d, %.2f, %d, %.2f)", 
                    plan.obtenerProp(), 
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
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutos> obtenerDataAuto() {  
        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutos;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMinutos auto = new PlanPostPagoMinutos(rs.getString("prop"),
                rs.getString("marca"), rs.getString("modelo"), 
                        rs.getString("num_celular"), rs.getInt("minNac"), 
                        rs.getDouble("costminNac"), rs.getInt("minInt"), 
                        rs.getDouble("costminInt"));
                lista.add(auto);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCiudad");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
     
}
}
