
package Sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    Connection conexion;
    Statement s;
    ResultSet rs;
    
    // Metodo de la Conexion a la base de datos.
    
    String driver = "org.postgresql.Driver", puente = "postgresql", usuario = "dan", password = "050499", iP = "localhost",
            puerto = "5432", nombreBD = "inventario";

    public Conexion () {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:" + puente+ "://" + iP+ ":" + puerto+ "/" + nombreBD, usuario, password);
            //System.out.println(" º Conexion Establecida º");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" º Problemas de conexion.");
        }
    }

     public Connection retornarConexion () {
        return conexion;
    }
    
    public void cerrarConexion () {
        try {
            if (!conexion.isClosed()) {
                conexion.close();
                //System.out.println(" º Conexion cerrada º");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarStatement (Statement... statements) {
        for (Statement statement : statements) {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void cerrarResultSet (ResultSet... results) {
        for (ResultSet rss : results) {
            if (rss != null) {
                try {
                    rss.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
