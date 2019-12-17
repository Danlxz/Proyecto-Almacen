
package Procesos;

import Sistema.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloSurtir extends Thread {
  
    String query = "select * from articulo where existencia <= stock_minimo";
    public static boolean dormirSurtir = true;
    
    public HiloSurtir() {
        this.setName("Hilo surtir.");
    }
    
    @Override
    public void run() {
        while (dormirSurtir) {            
            surtir();
        }
    }

    public void pausa(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ignorada) {
            System.out.println(" º Problemas al pausar º");
        }
    }
    
     public void surtir (){
        Conexion cn = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            s = cn.retornarConexion().prepareCall(query);
            rs = s.executeQuery();
            while (rs.next()) {
                if (dormirSurtir == false) {
                    return;
                }
                int id_prod = rs.getInt(1);
                String nombre = rs.getString(2);
                int ex = rs.getInt(5);
                int st_m = rs.getInt(6);
                int st_M = rs.getInt(7);
                int S_surte = (st_m + 10);
                if (ex <= S_surte) {
                    boolean modificar = false;
                    s = cn.retornarConexion().prepareStatement("update articulo set existencia = ? where id_producto = ?");
                    s.setInt(1, (((st_M - S_surte) + ex) - 1));
                    s.setInt(2, id_prod);
                    int r = s.executeUpdate();
                    if (r != 0) {
                        modificar = true;
                        System.out.println(" º Se surtio el producto: "+ nombre);
                    }
                }
                pausa(2200);
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
