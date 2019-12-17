
package Procesos;

import Sistema.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloLee extends Thread {

    String query = "select * from articulo where existencia <= stock_minimo";
    public static boolean dormirLee = true;

    public HiloLee() {
        this.setName("Hilo lee.");
    }

    @Override
    public void run() {
        while (dormirLee) {            
            leer();
        }
    }

    public void pausa(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ignorada) {
            System.out.println(" º Problemas al pausar º");
        }
    }
    
    public void leer (){
        Conexion cn = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            s = cn.retornarConexion().prepareCall(query);
            rs = s.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString(2);
                int st = rs.getInt(6);
                int ex = rs.getInt(5);
                int S_C = (st + 10);
                if (ex <= S_C) {
                    System.out.println(" º El Producto: " + nombre + " esta agotado º");
                }
                if (dormirLee == false) {
                    return;
                }
                pausa(2000);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HiloLee.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }

}
